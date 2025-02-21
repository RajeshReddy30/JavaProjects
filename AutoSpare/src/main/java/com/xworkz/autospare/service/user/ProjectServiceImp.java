package com.xworkz.autospare.service.user;

import java.time.LocalDateTime;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.xworkz.autospare.dto.user.ProjectDto;
import com.xworkz.autospare.entity.user.SignInEntity;
import com.xworkz.autospare.entity.user.SignUpEntity;
import com.xworkz.autospare.repo.user.ProjectRepositoryImp;
import com.xworkz.autospare.util.MailSender;
import com.xworkz.autospare.util.Otp;
import com.xworkz.autospare.util.ProjectUtil;

@Component
@Service
public class ProjectServiceImp implements ProjectService {

	@Autowired
	private ProjectRepositoryImp repo;
	@Autowired
	private MailSender emailsender;

	SignUpEntity signupEntity = new SignUpEntity();

	@Override
	public boolean signUpSave(ProjectDto dto) {
		if (dto != null) {
			BeanUtils.copyProperties(dto, signupEntity);

			signupEntity.setCreatedBy(dto.getUserName());
			signupEntity.setCreatedOn(LocalDateTime.now());
			signupEntity.setUpdatedBy("NA");
			signupEntity.setUpdatedOn("NA");
			signupEntity.setActive(true);

			repo.signUpSave(signupEntity);
			System.out.println("Saved");
			return true;
		}
		System.out.println("Not Saved");
		return false;
	}

	@Override
	public boolean findByEmailAndPassword(String email, String password) {
        SignUpEntity entity = repo.findByEmailAndPassword(email, password);
        if (entity != null) {
            SignInEntity signUserEntity = new SignInEntity();
            signUserEntity.setUserId(entity.getId());
            signUserEntity.setSignInTime(LocalDateTime.now());
            repo.signInSave(signUserEntity);
            return true;
        }
        return false;
    }

	@Override
	public boolean getEmail(String email) {

		if (email != null) {
			SignUpEntity mail = repo.getEmail(email);
			System.out.println(mail);
			return true;
			
		}
		return false;
	}

	@Override
	public boolean getAadharNumber(long aadharNumber) {
		if (aadharNumber != 0) {
			boolean adhar = repo.getAadharNumber(aadharNumber);
			System.out.println("aadhar" + adhar);
			if (adhar) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean getContactNumber(long contactNumber) {
		if (contactNumber != 0) {
			boolean adhar = repo.getContactNumber(contactNumber);
			System.out.println("contact" + adhar);
			if (adhar) {
				return true;
			}
		}
		return false;
	}

	@Override
	public ProjectDto findByEmail(String email) {
		if (email != null) {
			SignUpEntity entity = repo.getEmail(email);
			return ProjectUtil.convertRegisterEntityToDto(entity);
		}
		return null;

	}

	@Override
	public boolean updateByEmail(ProjectDto dto) {
		SignUpEntity entity = new SignUpEntity();
		BeanUtils.copyProperties(dto, entity);
		entity.setActive(true);
		entity.setCreatedBy(null);
		entity.setCreatedOn(null);
		entity.setUpdatedBy(dto.getUserName());
		entity.setUpdatedOn(null);
		repo.updateByEmail(entity);
		return true;

	}

	@Override
	public boolean deleteByEmail(ProjectDto dto) {
		if (dto != null) {
			SignUpEntity entity = new SignUpEntity();
			BeanUtils.copyProperties(dto, entity);
			entity.setActive(false);

			entity.setUpdatedBy(dto.getUserName());
			entity.setUpdatedOn(null);
			repo.deleteByEmail(entity);
			return true;

		}
		return false;
	}

	@Override
	public ProjectDto getInActiveEmail(String email) {
		if (email != null) {
			SignUpEntity entity = repo.getInActiveEmail(email);
			if (entity != null) {
				return ProjectUtil.convertRegisterEntityToDto(entity);
			} else {
				System.out.println("data is null in service");
			}
		}
		return null;

	}
	@Override
	public SignUpEntity increament(ProjectDto dto) {
		SignUpEntity entity = repo.getEmail(dto.getEmail());
		if(entity!=null) {
			entity.setFailedAttempt(entity.getFailedAttempt()+1);
			repo.updateByEmail(entity);
			
			return entity;
		}
		return new SignUpEntity();
	}

	@Override
	public boolean verifyOTP(int otp, String email) {
		
		    try {
		        // Retrieve the user by email
		        SignUpEntity entity = repo.getEmail(email);
		        if (entity == null) {
		            System.out.println("User not found for email: " + email);
		            return false;
		        }

		        // Get the OTP generation time
		        LocalDateTime otpGeneratedTime = entity.getOtpGeneratedTime();
		        if (otpGeneratedTime == null) {
		            System.out.println("OTP generation time is null for user: " + email);
		            return false;
		        }

		        // Calculate the OTP expiration time
		        LocalDateTime expirationTime = otpGeneratedTime.plusMinutes(2);
		        LocalDateTime currentTime = LocalDateTime.now();

		        // Print the times for reference
		        System.out.println("OTP Generated Time: " + otpGeneratedTime);
		        System.out.println("Current Time: " + currentTime);
		        System.out.println("OTP Expiry Time: " + expirationTime);

		        // Check if the OTP has expired
		        if (currentTime.isAfter(expirationTime)) {
		            System.out.println("OTP expired for user: " + email);
		            return false;
		        }

		        // Check if the provided OTP matches the generated OTP
		        if (entity.getOtp() == otp) {
		            System.out.println("OTP verified successfully for user: " + email);
		            return true;
		        }

		        System.out.println("Incorrect OTP provided for user: " + email);
		    } catch (Exception e) {
		        System.out.println("An error occurred while verifying OTP for email: " + email);
		        e.printStackTrace();
		    }

		    return false;
		

	 }

	@Override
	public boolean updatePasswordByEmail(String password, String email) {
		SignUpEntity entity1 = repo.getEmail(email);
		if(entity1 != null) {
			entity1.setPassword(password);
			entity1.setOtp(0);
			repo.updateByEmail(entity1);
			return true;
		}
		System.out.println("email and password is empty");
		return false;
	}

	@Override
	public boolean sendOtp(String email) {
		SignUpEntity entity = repo.getEmail(email);
		Otp name = new Otp();
		int otp = name.generateOTP();
		emailsender.sendOtp(otp, entity.getEmail() , entity.getUserName());
		entity.setOtp(otp);
		entity.setOtpGeneratedTime(LocalDateTime.now());
		repo.updateByEmail(entity);
		return true;
	}

	
}
