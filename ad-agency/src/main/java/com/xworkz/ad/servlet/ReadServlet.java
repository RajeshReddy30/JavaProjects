package com.xworkz.ad.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.ad.dto.AdAgencyDto;
import com.xworkz.ad.repo.AdAgencyRepo;
import com.xworkz.ad.repo.AdAgencyRepoImpl;
import com.xworkz.ad.service.AdAgencyService;
import com.xworkz.ad.service.AdAgencyServiceImpl;

@WebServlet("/view")
public class ReadServlet extends HttpServlet {

	public ReadServlet() {

	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) {

		AdAgencyRepo repo = new AdAgencyRepoImpl();
		AdAgencyService service = new AdAgencyServiceImpl(repo);

		List<AdAgencyDto> listOfDto = service.findAll();

		request.setAttribute("listOfDto", listOfDto);

		RequestDispatcher dispatcher = request.getRequestDispatcher("view.jsp");

		RequestDispatcher dispatchersignin = request.getRequestDispatcher("signin.jsp");
		try {
			dispatcher.forward(request, response);
			dispatchersignin.forward(request, response);
		} catch (ServletException | IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
