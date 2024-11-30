package com.xworkz.cricket.runner;

import com.xworkz.cricket.dto.CricketDto;
import com.xworkz.cricket.repository.CricketRepository;
import com.xworkz.cricket.repository.CricketRepositoryImplementation;
import com.xworkz.cricket.service.CricketService;
import com.xworkz.cricket.service.CricketServiceImplementation;

public class CricketRunner {

	public static void main(String[] args) {
		CricketDto cricket = new CricketDto();
		cricket.setId(1);
		cricket.setTeamName("India");
		cricket.setTeamBoard("BCCI");
		cricket.setCaptain("Rohit Sharma");
		cricket.setCoach("Gautam gambir");
		cricket.setMatchesPlayed(6578);
		cricket.setMatchesWon(6544);
		cricket.setWorldCupsWon(3);
		CricketRepository repo = new CricketRepositoryImplementation();
		CricketService service = new CricketServiceImplementation(repo);

		System.out.println(service.validateAndSave(cricket));
		System.out.println(service.read());
		System.out.println("search operation is:"+service.searchById(3));
		System.out.println("delete operation:"+service.delete(2));

	}

}
