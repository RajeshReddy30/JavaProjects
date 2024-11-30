package com.xworkz.gadget.service;

import java.util.List;

import com.xworkz.gadget.dto.GadgetDto;

public interface GadgetService {
	String save(GadgetDto dto);
	List<GadgetDto> read();
	String deleteById(int id);
	GadgetDto searchById(int id);
	String updateById(int id,GadgetDto dto);

}
