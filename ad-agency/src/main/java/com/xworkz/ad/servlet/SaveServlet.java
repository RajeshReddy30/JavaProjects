package com.xworkz.ad.servlet;

import java.io.IOException;

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



@WebServlet("/save")
public class SaveServlet extends HttpServlet {

	public SaveServlet() {
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) {

		AdAgencyDto dto = new AdAgencyDto();

		dto.setPersonName(request.getParameter("personname"));
		dto.setCompanyName(request.getParameter("companyname"));
		dto.setProductName(request.getParameter("productname"));
		dto.setContactNumber(Long.parseLong(request.getParameter("contactnumber")));
		dto.setEmail(request.getParameter("email"));
		dto.setPassword(Integer.parseInt(request.getParameter("password")));

		AdAgencyRepo repo = new AdAgencyRepoImpl();
		AdAgencyService service = new AdAgencyServiceImpl(repo);

		String saveResult = service.saveAndValidate(dto);

		request.setAttribute("saveResult", saveResult);
		RequestDispatcher dispatcher = request.getRequestDispatcher("success.jsp");

		try {
			dispatcher.forward(request, response);
		} catch (ServletException | IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
