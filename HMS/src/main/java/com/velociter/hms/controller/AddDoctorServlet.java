package com.velociter.hms.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.velociter.hms.database.HospitalDAO;
import com.velociter.hms.model.Doctor;

public class AddDoctorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		Doctor doctorObject = new Doctor();

		doctorObject.setName(request.getParameter("name"));
		doctorObject.setPosition(request.getParameter("position"));
		doctorObject.setSsn(Long.parseLong(request.getParameter("ssn")));
		doctorObject.setJoinDate(request.getParameter("joindate"));
		doctorObject.setSpecialties(request.getParameter("specialties"));
  
		try
		{
		HospitalDAO hospitalDaoObject = new HospitalDAO();

		if (hospitalDaoObject.addDoctor(doctorObject) != 0) {

			RequestDispatcher requestDispaterObject = request.getRequestDispatcher("SuccessMessage.jsp");
			requestDispaterObject.include(request, response);

		} else {
			out.println("<h3 style='color: red;'>Add physician  Operation is Faild</h3>");
		}

	   }catch(Exception e)
		{
		   System.out.println(e.getMessage());
		}

 }
}
