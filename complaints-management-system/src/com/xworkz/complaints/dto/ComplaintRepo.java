package com.xworkz.complaints.dto;

import java.util.List;

public interface ComplaintRepo {

	boolean onSave(ComplaintDto complaintDto);

	List<ComplaintDto> getAll();

	boolean updateById(int id, ComplaintDto complaintDto);

	boolean deleteById(int id, ComplaintDto complaintDto);
}
