package com.xworkz.gadget.servlet;

import java.io.IOException;
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
@WebServlet(urlPatterns = "/view")
public class ReadServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		GadgetRepo repo = new GadgetRepoImplementation();
		GadgetService service = new GadgetServiceImplementation(repo);
		List<GadgetDto> read=service.read();
		req.setAttribute("read", read);
		 RequestDispatcher request= req.getRequestDispatcher("view.jsp");
		 request.forward(req, resp);
		
	}

}
