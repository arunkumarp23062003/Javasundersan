package com.srecStudents;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class registrationServelet
 */
@WebServlet("/registrationServelet")
public class registrationServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registrationServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("fname");
		String dept = request.getParameter("dept");
		String section = request.getParameter("class");
		String rollno = request.getParameter("rollno");
		String add = request.getParameter("add");
		String phno = request.getParameter("phno");
		RequestDispatcher dispatcher = null;
		Connection con = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","2306PTA2003");
			PreparedStatement pst = con.prepareStatement("insert into users(name,department,class,rollno,address,phno) values (?,?,?,?,?,?)");
			pst.setString(1,uname);
			pst.setString(2,dept);
			pst.setString(3,section);
			pst.setString(4,rollno);
			pst.setString(5,add);
			pst.setString(6,phno);
			int rowcount=pst.executeUpdate();
			dispatcher = request.getRequestDispatcher("/WEB-INF/login.jsp");
			if(rowcount>0)
			{
				request.setAttribute("status", "success");
			}
			else
			{
				request.setAttribute("status", "failed");
			}
		} catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
