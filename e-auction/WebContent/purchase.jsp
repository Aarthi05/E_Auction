<%@page import="com.cts.cls.Purchase"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product for sale</title>
</head>
<body>
	<form method="post" action="purchase_details">
	<%
List<Purchase> cd=(List<Purchase>)request.getAttribute("Dis_obj");
%>
<% if(cd!=null)
       {%>
       <table border="1">
       
       <%
              for(Purchase cusDisp:cd)
              {
       %>
                     <tr>
                           <td> <% out.println(cusDisp.getProduct_name()); %></td>
                           <td><%out.println(cusDisp.getDescription()); %></td>
                           <td><%out.println(cusDisp.getFinal_price()); %></td>
                     </tr>
       <%
              }
       }
       
       %>
       
       
       
       
       </table>

	
	
	
	
	</form>

</body>
</html>