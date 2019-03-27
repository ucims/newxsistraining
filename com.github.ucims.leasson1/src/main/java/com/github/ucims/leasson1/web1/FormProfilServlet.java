package com.github.ucims.leasson1.web1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/simpan.ums","/formsecond.html"})
public class FormProfilServlet extends HttpServlet {

	public FormProfilServlet() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setAttribute("modus","input");
//		doPost(req, resp);
		req.getRequestDispatcher("/form.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		String nama = req.getParameter("nama");
//		System.out.println(nama);
//		String asal = req.getParameter("asal");
//		System.out.println(asal);
//		String asal_kampus = req.getParameter("asal_kampus");
//		System.out.println(asal_kampus);
//		String jurusan = req.getParameter("jurusan");
//		System.out.println(jurusan);
//		String github = req.getParameter("github");
//		System.out.println(github);
//		String linkedin = req.getParameter("linkedin");
//		System.out.println(linkedin);
		
		req.setAttribute("modus", "tampil");
		req.setAttribute("nama", nama);
		req.getRequestDispatcher("form.jsp").forward(req, resp);
	}
	
	

}
