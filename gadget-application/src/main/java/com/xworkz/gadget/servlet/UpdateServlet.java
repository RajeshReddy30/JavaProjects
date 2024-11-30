package com.xworkz.gadget.servlet;

import java.io.IOException;

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

@WebServlet(urlPatterns = "/update")
public class UpdateServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		GadgetRepo repo = new GadgetRepoImplementation();
		GadgetService service = new GadgetServiceImplementation(repo);
		GadgetDto dto = service.searchById(Integer.parseInt(req.getParameter("id")));
		req.setAttribute("updateDto", dto);
		RequestDispatcher request = req.getRequestDispatcher("update.jsp");
		request.forward(req, resp);
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("post method of update");

		GadgetDto dto = new GadgetDto();

		dto.setGadgetId(Integer.parseInt(req.getParameter("gadgetId")));
		dto.setGadgetName(req.getParameter("gadgetName"));
		dto.setGadgetType(req.getParameter("gadgetType"));
		System.out.println("updated dto is:" + dto);
		GadgetRepo repo = new GadgetRepoImplementation();
		GadgetService service = new GadgetServiceImplementation(repo);
		int id = Integer.parseInt(req.getParameter("id"));
		String update = service.updateById(id, dto);

		req.setAttribute("update", update);
		RequestDispatcher request = req.getRequestDispatcher("view.jsp");
		request.forward(req, resp);

	}
}
