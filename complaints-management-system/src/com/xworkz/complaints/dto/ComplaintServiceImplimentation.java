package com.xworkz.complaints.dto;


import java.util.List;


import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ComplaintServiceImplimentation implements ComplaintService{

	private ComplaintRepo repo;
	@Override
	public String validate(ComplaintDto complaintDto) {
		System.out.println("Validate is running");
		if(complaintDto!=null){
			if(repo.onSave(complaintDto)) {
				return"Saved sucessfully";
			}
		}
		return "Not Saved sucessfully";
	}

	@Override
	public List<ComplaintDto> getAll() {

		return repo.getAll();
	}

	@Override
	public String updateById(int id, ComplaintDto complaintDto) {
		if(id>0) {
			if(repo.updateById(id, complaintDto)) {
				return"Updatesucessfully";
			}
		}
		return "notupdated";
	}

	@Override
	public String deleteById(int id, ComplaintDto complaintDto) {
		if(id>0) {
			if(repo.deleteById(id, complaintDto)) {
				return"deletesucessfully";
			}
		}
		return "notdeleted";
	}

}
