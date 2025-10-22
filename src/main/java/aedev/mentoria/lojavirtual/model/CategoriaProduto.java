package aedev.mentoria.lojavirtual.model;

import java.io.Serializable;
import java.util.Objects;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
@Entity
@Table(name = "categoria_produto")
@SequenceGenerator(name = "seq_categoria_produto", sequenceName = "seq_categoria_produto", allocationSize = 1, initialValue = 1)
 
public class CategoriaProduto implements Serializable {
private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_marca_produto")
private Long idLong;

@Column(name = "nome_desc", nullable = false)
private String nomeDesc;

public Long getIdLong() {
	return idLong;
}

public void setIdLong(Long idLong) {
	this.idLong = idLong;
}

public String getNomeDesc() {
	return nomeDesc;
}

public void setNomeDesc(String nomeDesc) {
	this.nomeDesc = nomeDesc;
}

@Override
public int hashCode() {
	return Objects.hash(idLong, nomeDesc);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	CategoriaProduto other = (CategoriaProduto) obj;
	return Objects.equals(idLong, other.idLong) && Objects.equals(nomeDesc, other.nomeDesc);
}



}
