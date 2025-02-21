package com.xworkz.autospare.repository.seller;

import com.xworkz.autospare.entity.seller.SellerEntity;

public interface SellerRepository {
	boolean sellerSave(SellerEntity sellerentity);
	SellerEntity getEmail(String email);
	SellerEntity findByEmailAndPassword(String email, String password);
	boolean updateByEmail(SellerEntity entity);
	boolean deleteByEmail(SellerEntity entity);

}
