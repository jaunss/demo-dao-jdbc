package application;

import java.util.Date;

import entities.Department;
import entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department dp = new Department(1, "Livros");
		Seller sl = new Seller(2, "Joao", "joaogcm_jb@outlook.com", new Date(), 23400.00, dp);
		
		System.out.println(dp);
		System.out.println(sl);
	}
}