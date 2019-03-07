package com.cts.purchase_serv;

import java.util.ArrayList;
import java.util.List;

import com.cts.cls.Purchase;
import com.cts.purchase_dao_layer.My_Purchase;
import com.cts.purchase_dao_layer.My_Purchase_Interface;

public class Purchase_impl implements Purchase_interface {
	My_Purchase_Interface pi=new My_Purchase();
	List<Purchase> pr=new ArrayList<Purchase>();
	@Override
	public List<Purchase> purchase(Purchase p) {
			pr=pi.purchase(p);
		
		return pr;
	}

}
