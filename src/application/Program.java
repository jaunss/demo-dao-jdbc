package application;

import java.util.List;

import entities.Department;
import entities.Seller;
import model.dao.DAOFactory;
import model.dao.SellerDAO;

public class Program {

	public static void main(String[] args) {
	
		SellerDAO sellerDAO = DAOFactory.createSellerDAO();
		
		System.out.println("- - - Test 1: Seller findById - - -");
		Seller seller = sellerDAO.findById(3);
		System.out.println(seller);
		
		System.out.println("- - - Test 2: Seller findByDepartment - - -");
		
		Department department = new Department(2, null);
		List<Seller> list = sellerDAO.findByDepartment(department);
		
		for (Seller obj : list) {
			System.out.println(obj);
		}
	}
}