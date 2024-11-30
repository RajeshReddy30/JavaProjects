package com.xworkz.gadget.repo;

import java.util.List;

import com.xworkz.gadget.dto.GadgetDto;

public interface GadgetRepo {
	boolean save(GadgetDto dto);
	List<GadgetDto> read();
	boolean deleteById(int id);
	GadgetDto searchById(int id);
	boolean updateById(int id,GadgetDto dto);

}
