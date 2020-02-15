package application;

import entities.Seller;
import model.dao.DAOFactory;
import model.dao.SellerDAO;

public class Program {

	public static void main(String[] args) {
	
		SellerDAO sellerDAO = DAOFactory.createSellerDAO();
		
		Seller seller = sellerDAO.findById(3);
		
		System.out.println(seller);
	}
}