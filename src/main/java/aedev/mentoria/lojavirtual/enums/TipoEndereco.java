package aedev.mentoria.lojavirtual.enums;

public enum TipoEndereco {

	COBRANCA("Cobrança"),
	ENTREGA("Entrega");
	
	private String descricao;

	TipoEndereco(String descricao) {
		this.descricao = descricao;
	}

public String getDescriacao() {
	return this.descricao;
}

@Override
public String toString() {
	return this.descricao;
}
	
}
