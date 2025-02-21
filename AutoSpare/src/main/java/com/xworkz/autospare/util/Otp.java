package com.xworkz.autospare.util;

import java.security.SecureRandom;

public class Otp {
	public static int generateOTP() {
		 SecureRandom random = new SecureRandom();
	       return 100000 + random.nextInt(900000);
	}

}
