package aedev.mentoria.lojavirtual.model;


import java.io.Serializable;
import java.util.Objects;

import org.hibernate.annotations.ManyToAny;
import org.hibernate.mapping.Constraint;
import org.springframework.beans.factory.ListableBeanFactory;

import aedev.mentoria.lojavirtual.enums.TipoEndereco;
import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "endereco")
@SequenceGenerator(name = "seq_endereco", sequenceName = "seq_endereco", allocationSize = 1, initialValue = 1)
public class Endereco  implements Serializable{
  private static final long serialVersionUID = 1L;
		  
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_endereco")
  private Long id;
  
  private String cidade;
  private String ruaLogra;
  private String cep;
  private String numero;
  private String complemento;
  private String bairro;
  private String UF;
  
  
  
  //Muitos enderecos para uma pessoa
  @ManyToOne(targetEntity = Pessoa.class)
  @JoinColumn(name = "pessoa_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT,
  name = "pessoa_fk"))
  private Pessoa pessoa;
  
  @Enumerated(EnumType.STRING)
  private TipoEndereco tipoEndereco;
  
  public void setTipoEndereco(TipoEndereco tipoEndereco) {
	  this.tipoEndereco = tipoEndereco;
  }
  
  public TipoEndereco getTipoEndereco() {
	  return tipoEndereco;
  }

  public Long getId() {
	return id;
  }

  public void setId(Long id) {
	this.id = id;
  }

  public String getRuaLogra() {
	return ruaLogra;
  }

  public void setRuaLogra(String ruaLogra) {
	this.ruaLogra = ruaLogra;
  }

  public String getCep() {
	return cep;
  }

  public void setCep(String cep) {
	this.cep = cep;
  }

  public String getNumero() {
	return numero;
  }

  public void setNumero(String numero) {
	this.numero = numero;
  }

  public String getComplemento() {
	return complemento;
  }

  public void setComplemento(String complemento) {
	this.complemento = complemento;
  }

  public String getBairro() {
	return bairro;
  }

  public void setBairro(String bairro) {
	this.bairro = bairro;
  }

  public String getUF() {
	return UF;
  }

  public void setUF(String UF) {
	UF = UF;
  }

  public Pessoa getPessoa() {
	return pessoa;
  }

  public void setPessoa(Pessoa pessoa) {
	this.pessoa = pessoa;
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
	Endereco other = (Endereco) obj;
	return Objects.equals(id, other.id);
  }
  
  
  
  
}
