package com.xworkz.autospare.service.seller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.xworkz.autospare.dto.seller.SparePartDTO;
import com.xworkz.autospare.entity.seller.SparePartEntity;
import com.xworkz.autospare.repository.seller.SparePartRepositoryImplements;

public class SparePartServiceImplements implements SparePartService {
	@Autowired
	private SparePartRepositoryImplements repo;
	SparePartEntity entity = new SparePartEntity();

	@Override
	public boolean sparePartSave(SparePartDTO dto) {
		if (dto != null) {
			BeanUtils.copyProperties(dto, entity);
			repo.sparePartSave(entity);
			return true;

		}
		return false;
	}
}
