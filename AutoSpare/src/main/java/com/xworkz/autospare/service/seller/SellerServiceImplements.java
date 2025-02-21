package com.xworkz.autospare.service.seller;

import java.time.LocalDateTime;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.autospare.dto.seller.SellerDto;
import com.xworkz.autospare.entity.seller.SellerEntity;
import com.xworkz.autospare.entity.user.SignUpEntity;
import com.xworkz.autospare.repository.seller.SellerRepositoryImplements;
import com.xworkz.autospare.util.MailSender;
import com.xworkz.autospare.util.Otp;

@Service
public class SellerServiceImplements implements SellerService {
	@Autowired
	private SellerRepositoryImplements repo;
	@Autowired
	private MailSender emailsender;

	SellerEntity sellerEntity = new SellerEntity();

	@Override
	public boolean sellerSave(SellerDto dto) {
		if (dto != null) {
			BeanUtils.copyProperties(dto, sellerEntity);

			sellerEntity.setCreatedBy(dto.getName());
			sellerEntity.setCreatedOn(LocalDateTime.now());
			sellerEntity.setUpdatedBy("NA");
			sellerEntity.setUpdatedOn(LocalDateTime.now());
			sellerEntity.setActive(true);

			repo.sellerSave(sellerEntity);
			System.out.println("Saved");
			return true;
		}
		System.out.println("Not Saved");
		return false;
	}

	@Override
	public boolean getEmail(String email) {
		SellerEntity sellerEntity = new SellerEntity();

		if (email != null) {
			SellerEntity mail = repo.getEmail(email);
			if (mail != null) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean verifyOTP(int otp, String email) {

		try {
			// Retrieve the user by email
			SellerEntity entity = repo.getEmail(email);
			if (entity == null) {
				System.out.println("User not found for email: " + email);
				return false;
			}

			// Get the OTP generation time
			LocalDateTime otpGeneratedTime = entity.getGetOtpGeneratedTime();
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
	public boolean sendOtp(String email) {
		SellerEntity entity = repo.getEmail(email);
		System.err.println(entity);
		Otp name = new Otp();
		int otp = name.generateOTP();
		emailsender.sendOtp(otp, entity.getEmail(), entity.getName());
		entity.setOtp(otp);
		entity.setGetOtpGeneratedTime(LocalDateTime.now());
		repo.updateByEmail(entity);
		return true;
	}

}
