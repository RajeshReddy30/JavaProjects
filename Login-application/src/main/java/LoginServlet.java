import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name=req.getParameter("name");
	String gender=req.getParameter("gender");
	String state=req.getParameter("state");
	String language=req.getParameter("language");
	String date=req.getParameter("date");
	req.setAttribute("name",name);
	req.setAttribute("gender",gender);
	req.setAttribute("state",state);
	req.setAttribute("date", date);
	req.setAttribute("language",language);
	RequestDispatcher request=req.getRequestDispatcher("success.jsp");
	request.forward(req, resp);
}


}
