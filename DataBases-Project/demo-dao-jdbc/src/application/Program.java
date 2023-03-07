package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	
	public static void main(String args[]) {		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("----  Test 1: Seller findbyId ----");
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
	}
}