package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {
	
	public static void main(String args[]) {		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("----  Test 1: Department findbyId ----");
		Department department = departmentDao.findById(2);
		System.out.println(department);
		
		System.out.println();
		System.out.println("----  Test 2: Department findbyAll ----");		
		List<Department> list = departmentDao.findAll();	
		for(Department dep : list)
			System.out.println(dep);
		
		System.out.println();
		System.out.println("----  Test 3: Department Insert ----");
		Department newDepartment = new Department(null,"Office Admin");
		departmentDao.insert(newDepartment);
		System.out.println(newDepartment);
		
		System.out.println();
		System.out.println("----  Test 4: Department Update ----");
		department = departmentDao.findById(1);
		department.setName("Computer Machine");
		departmentDao.update(department);
		System.out.println(department);
		
		
		System.out.println();
		System.out.println("----  Test 5: Department Delete ----");
		departmentDao.deleteById(9);
	}
}
