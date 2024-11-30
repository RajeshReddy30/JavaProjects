package com.xworkz.gadget.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.gadget.dto.GadgetDto;
import com.xworkz.gadget.repo.GadgetRepo;
import com.xworkz.gadget.repo.GadgetRepoImplementation;
import com.xworkz.gadget.service.GadgetService;
import com.xworkz.gadget.service.GadgetServiceImplementation;

@WebServlet(urlPatterns = "/Gadget")
public class GadgetServlet extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		GadgetDto dto = new GadgetDto();
		dto.setGadgetId(Integer.parseInt(req.getParameter("gadgetId")));
		dto.setGadgetName(req.getParameter("gadgetName"));
		dto.setGadgetType(req.getParameter("gadgetType"));
		GadgetRepo repo = new GadgetRepoImplementation();
		GadgetService service = new GadgetServiceImplementation(repo);
		String result = service.save(dto);

		req.setAttribute("result", result);

		RequestDispatcher request = req.getRequestDispatcher("success.jsp");
		request.forward(req, resp);

	}

}
