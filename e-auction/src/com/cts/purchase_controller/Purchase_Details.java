package com.cts.purchase_controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.cls.Purchase;
import com.cts.purchase_serv.Purchase_impl;
import com.cts.purchase_serv.Purchase_interface;

/**
 * Servlet implementation class purchase_details
 */
@WebServlet("/purchase_details")
public class Purchase_Details extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	Purchase_interface pi=new Purchase_impl();
	Purchase p=new Purchase();
  
	//String user_id,Product_name,Description,Final_price;
    List<Purchase> pur_obj=new ArrayList<Purchase>();
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
	
		String user_id=(String) request.getAttribute("user_id");
		p.setUser_id(user_id);
		pur_obj=pi.purchase(p);
		request.setAttribute("Dis_obj", pur_obj);
		
		RequestDispatcher rd=request.getRequestDispatcher("purchase.jsp");
		rd.forward(request, response);
			
		
	}

}
