package application;

import java.util.Date;
import java.util.List;

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

		System.out.println();
		System.out.println("----  Test 2: Seller findbyDepartment ----");
		Department department = new Department(2,null);
		List<Seller> list = sellerDao.findByDepartment(department);	
		for(Seller sel : list)
			System.out.println(sel);
		
		System.out.println();
		System.out.println("----  Test 3: Seller findbyAll ----");		
		list = sellerDao.findAll();	
		for(Seller sel : list)
			System.out.println(sel);
		
		System.out.println();
		System.out.println("----  Test 4: Seller Insert ----");
		Seller newSeller = new Seller(null,"Greg","greg@gmail.com",new Date(),4000.0,department);
		sellerDao.insert(newSeller);
		System.out.println(newSeller);
		
		System.out.println();
		System.out.println("----  Test 5: Seller Update ----");
		seller = sellerDao.findById(1);
		seller.setName("Martha Wayne");
		sellerDao.update(seller);
		System.out.println(seller);
		
		
		System.out.println();
		System.out.println("----  Test 6: Seller Delete ----");
		sellerDao.deleteById(9);
	}
}
