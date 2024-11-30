package com.xworkz.car.servlet;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.car.dto.CarRentalDto;
import com.xworkz.car.repo.CarRentalRepo;
import com.xworkz.car.repo.CarRentalRepoImplementation;
import com.xworkz.car.service.CarRentalService;
import com.xworkz.car.service.CarRentalServiceImplementation;
@WebServlet(urlPatterns = "/CarRental")
public class CarRentalServlet extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	CarRentalDto dto= new CarRentalDto();
	System.out.println("servlet method");
	dto.setCustomerName(req.getParameter("customerName"));
	dto.setCustomerEmail(req.getParameter("customerEmail"));
	dto.setCarModel(req.getParameter("carModel"));
	dto.setCarLicensePlate(req.getParameter("carLicensePlate"));
	dto.setRentalCost(Double.parseDouble(req.getParameter("rentalCost")));
	dto.setRentalStartDate(Date.valueOf(req.getParameter("rentalStartDate")));
	dto.setRentalEndDate(Date.valueOf(req.getParameter("rentalEndDate")));
	CarRentalRepo repo=new CarRentalRepoImplementation();
	CarRentalService service=new CarRentalServiceImplementation(repo);
	
	req.setAttribute("dto", service.save(dto));
	RequestDispatcher request=req.getRequestDispatcher("success.jsp");
	request.forward(req, resp);
	}

}
