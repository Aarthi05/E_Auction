package com.cts.cls;

public class Purchase {

	String User_id,Product_name,Description,Final_price;

public Purchase()
{}
	public Purchase( String product_name, String description,
			String final_price) {
		super();
		
		Product_name = product_name;
		Description = description;
		Final_price = final_price;
	}


	public String getUser_id() {
		return User_id;
	}


	public void setUser_id(String user_id) {
		this.User_id = user_id;
	}


	public String getProduct_name() {
		return Product_name;
	}


	public void setProduct_name(String product_name) {
		Product_name = product_name;
	}


	public String getDescription() {
		return Description;
	}


	public void setDescription(String description) {
		Description = description;
	}


	public String getFinal_price() {
		return Final_price;
	}


	public void setFinal_price(String final_price) {
		Final_price = final_price;
	}

	
	
	

}