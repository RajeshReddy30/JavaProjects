package com.xworkz.autospare.service.seller;

import com.xworkz.autospare.dto.seller.SellerDto;

public interface SellerService {
	boolean sellerSave(SellerDto dto);
	public boolean getEmail(String email);
	boolean verifyOTP(int otp, String email);

	boolean sendOtp(String email);


}
