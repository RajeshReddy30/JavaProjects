package com.xworkz.complaints.dto;

import java.util.List;

public interface ComplaintService {
	String validate(ComplaintDto complaintDto);

	List<ComplaintDto> getAll();

	String updateById(int id, ComplaintDto complaintDto);

	String deleteById(int id, ComplaintDto complaintDto);
}
