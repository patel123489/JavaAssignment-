package Controller;

import java.io.IOException;

import Dao.StudentDao;
import Model.Student;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/form")
public class Servlet_1 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(phone);
		
		Student st = new Student();
		st.setName(name);
		st.setEmail(email);
		st.setPhone(phone);
		
		StudentDao dao = new StudentDao();
		int i = dao.addStudent(st);
		if(i>0)
		{
			req.setAttribute("msg", "Regstration Successfully");
			req.getRequestDispatcher("index.jsp").forward(req, resp);
		}
	}
}