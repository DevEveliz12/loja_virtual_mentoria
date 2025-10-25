package aedev.mentoria.lojavirtual.model;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

//Estou na classe pessoa, mas trouxe um arrayList da classe endereco
//como isso pode?
//por conta do JPA - o JPA está em ambas, as classes ele faz esse gerenciamento
//sem precisar do import.




//Classe abstract não pode ser instanciada - classe mãe
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@SequenceGenerator(name = "seq_pessoa", sequenceName = "sequ_pessoa", initialValue = 1, allocationSize = 1)
public abstract class Pessoa implements Serializable {
private static final long serialVersionUID = 1L;

@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_pessoa")
private Long id;

private String nome;

private String email;

private String telefone;


//estamos dizendo que uma pessoa pode ter varios enderecos
@OneToMany(mappedBy = "pessoa", orphanRemoval = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
private List<Endereco> enderecos = new ArrayList<Endereco>();

public void setEnderecos(List<Endereco> enderecos) {
	this.enderecos = enderecos;
}

public List<Endereco> getEnderecos(){
	return enderecos;
}


public Pessoa() {
	// TODO Auto-generated constructor stub
}
public Long getId() {
	return id;
}

public void setId(Long id) {
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

public String getTelefone() {
	return telefone;
}

public void setTelefone(String telefone) {
	this.telefone = telefone;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}

@Override
public int hashCode() {
	return Objects.hash(id);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Pessoa other = (Pessoa) obj;
	return Objects.equals(id, other.id);
}

}

