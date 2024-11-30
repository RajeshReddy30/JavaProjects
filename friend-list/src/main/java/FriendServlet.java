import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/GetName")
public class FriendServlet extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	ArrayList<String> list=new ArrayList<String>();
	list.add("rajesh");
	list.add("ganesh");
	req.setAttribute("lists", list);
RequestDispatcher request=	req.getRequestDispatcher("index.jsp");
request.forward(req, resp);
	
}
	
	

}
