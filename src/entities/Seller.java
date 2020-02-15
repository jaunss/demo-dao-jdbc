package entities;

import java.io.Serializable;
import java.util.Date;

public class Seller implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seller other = (Seller) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Seller [id = " + id + ", nome = " + nome + ", email = " + email + ", dataNascimento = " + dataNascimento
				+ ", salarioBase = " + salarioBase + ", departamento = " + departamento + "]";
	}
	
	
}