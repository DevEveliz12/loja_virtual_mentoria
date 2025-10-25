package aedev.mentoria.lojavirtual.model;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "pessoa_juridica")
@PrimaryKeyJoinColumn(name = "id")

public class PessoaJuridica extends Pessoa {
private static final long serialVersionUID = 1L;

private String cnpj;
private String inscEstadual;
private String inscMunicipal;
private String nomeFantasia;
private String razaoSocial;
private String categoriaString;
public String getCnpj() {
	return cnpj;
}
public void setCnpj(String cnpj) {
	this.cnpj = cnpj;
}
public String getInscEstadual() {
	return inscEstadual;
}
public void setInscEstadual(String inscEstadual) {
	this.inscEstadual = inscEstadual;
}
public String getInscMunicipal() {
	return inscMunicipal;
}
public void setInscMunicipal(String inscMunicipal) {
	this.inscMunicipal = inscMunicipal;
}
public String getNomeFantasia() {
	return nomeFantasia;
}
public void setNomeFantasia(String nomeFantasia) {
	this.nomeFantasia = nomeFantasia;
}
public String getRazaoSocial() {
	return razaoSocial;
}
public void setRazaoSocial(String razaoSocial) {
	this.razaoSocial = razaoSocial;
}
public String getCategoriaString() {
	return categoriaString;
}
public void setCategoriaString(String categoriaString) {
	this.categoriaString = categoriaString;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}


}
