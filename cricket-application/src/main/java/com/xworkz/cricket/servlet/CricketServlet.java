package com.xworkz.cricket.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.cricket.dto.CricketDto;
import com.xworkz.cricket.repo.CricketRepository;
import com.xworkz.cricket.repo.CricketRepositoryImplementation;
import com.xworkz.cricket.service.CricketService;
import com.xworkz.cricket.service.CricketServiceImplementation;

@WebServlet(urlPatterns = "/cricket")
public class CricketServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		CricketDto cricket = new CricketDto();
		cricket.setTeamName(req.getParameter("teamName"));
		cricket.setTeamBoard(req.getParameter("teamBoard"));
		cricket.setCaptain(req.getParameter("captain"));
		cricket.setCoach(req.getParameter("coach"));
		cricket.setMatchesPlayed(Integer.parseInt(req.getParameter("matchesPlayed")));
		cricket.setMatchesWon(Integer.parseInt(req.getParameter("matchesWon")));
		cricket.setWorldCupsWon(Integer.parseInt(req.getParameter("worldCupsWon")));
		CricketRepository repo = new CricketRepositoryImplementation();
		CricketService service = new CricketServiceImplementation(repo);
		String result = service.validateAndSave(cricket);

		req.setAttribute("result", result);

		RequestDispatcher request = req.getRequestDispatcher("success.jsp");
		request.forward(req, resp);
	}

}
