package model.dao;

import java.util.List;

import entities.Department;
import entities.Seller;

public interface SellerDAO {

	public void insert(Seller obj);

	public void update(Seller obj);

	public void deleteById(Integer id);

	public Seller findById(Integer id);

	public List<Seller> findAll();
	
	public List<Seller> findByDepartment(Department department);
}
