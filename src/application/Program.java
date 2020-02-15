package application;

import java.util.Date;

import entities.Department;
import entities.Seller;
import model.dao.DAOFactory;
import model.dao.SellerDAO;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Livros");
		Seller sl = new Seller(2, "Joao", "joaogcm_jb@outlook.com", new Date(), 23400.00, obj);
		
		SellerDAO seller = DAOFactory.createSellerDAO();
		System.out.println(obj);
		System.out.println(sl);
	}
}