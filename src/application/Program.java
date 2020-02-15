package application;

import java.util.Date;
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
		System.out.println();
		
		System.out.println("- - - Test 2: Seller findByDepartment - - -");
		
		Department department = new Department(2, null);
		List<Seller> list = sellerDAO.findByDepartment(department);
		
		for (Seller obj : list) {
			System.out.println(obj);
			System.out.println();
		}
		
System.out.println("- - - Test 3: Seller findAll - - -");
		
		list = sellerDAO.findAll();
		
		for (Seller obj : list) {
			System.out.println(obj);
			System.out.println();
		}
		
System.out.println("- - - Test 4: Seller insert - - -");
		
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.00, department);
		sellerDAO.insert(newSeller);
		System.out.println("Inserted! New Id = " + newSeller.getId());
		
System.out.println("- - - Test 5: Seller update - - -");
		
		seller = sellerDAO.findById(1);
		seller.setNome("Martha Waine");
		sellerDAO.update(seller);
		System.out.println("Update Completed!");
		System.out.println();
	}
}