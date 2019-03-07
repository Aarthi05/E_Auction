package com.cts.purchase_dao_layer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



import com.cts.DaoUtils.DbConst;
import com.cts.cls.Purchase;


public class My_Purchase implements My_Purchase_Interface {
	
	private static final String User_id = null;

	List<Purchase> pur=new ArrayList<Purchase>();
	@Override
	public List<Purchase> purchase(Purchase p) {
		// TODO Auto-generated method stub
	


		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			con=DbConst.getConnection();
			ps=con.prepareStatement("select p.Product_name,p.description,bid.bid_price from p join bid where p.pid=bid.pid and bider=?");
			ps.setString(1,p.getUser_id());
			rs=ps.executeQuery();
			while(rs.next())
			{
				pur.add(new Purchase(rs.getString(1),rs.getString(2),rs.getString(3)));
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			
		}
		
		return pur;
	}
	
	
	
}
