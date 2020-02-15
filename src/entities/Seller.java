package entities;

import java.util.Date;

public class Seller {
	
	private Integer id;
	private String nome, email;
	private Date dataNascimento;
	private Double salarioBase;
	
	private Department departamento;
	
	public Seller(Integer id, String nome, String email, Date dataNascimento, Double salarioBase, Department departamento) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	public Double getSalarioBase() {
		return salarioBase;
	}
	
	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public Department getDepartamento() {
		return departamento;
	}
	
	public void setDepartamento(Department departamento) {
		this.departamento = departamento;
	}
}