package com.xworkz.gadget.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.tribes.ChannelInterceptor.InterceptorEvent;

import com.xworkz.gadget.repo.GadgetRepo;
import com.xworkz.gadget.repo.GadgetRepoImplementation;
import com.xworkz.gadget.service.GadgetService;
import com.xworkz.gadget.service.GadgetServiceImplementation;

@WebServlet(urlPatterns = "/delete")
public class DeleteServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		GadgetRepo repo = new GadgetRepoImplementation();
		GadgetService service = new GadgetServiceImplementation(repo);

		int id = Integer.parseInt(req.getParameter("id"));

		String delete = service.deleteById(id);
		req.setAttribute("delete", delete);
		RequestDispatcher request= req.getRequestDispatcher("view.jsp");
		request.forward(req, resp);

	}

}
