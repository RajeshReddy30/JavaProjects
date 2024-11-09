import java.io.File;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/enquiry")
public class EnquiryServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		EnquiryDto dto=new EnquiryDto();
		dto.setName(req.getParameter("name"));
		dto.setEmail(req.getParameter("email"));
		dto.setContactNumber(Long.parseLong(req.getParameter("contacts")));
		dto.setDescription(req.getParameter("description"));
		String name=dto.getName();
		String email=dto.getEmail();
		Long contact=dto.getContactNumber();
		String description=dto.getDescription();
		req.setAttribute("Name",name);
		req.setAttribute("Email",email);
		req.setAttribute("Contact",contact);
		req.setAttribute("Description", description);
	RequestDispatcher request=req.getRequestDispatcher("success.jsp");
	request.forward(req, resp);
	EnquiryFileOperation file = new EnquiryFileOperation();
	file.writeFile(dto);
	File f = new File("Enquiry.txt");
	}

}
