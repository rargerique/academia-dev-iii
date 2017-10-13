package academia.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import academia.enums.Pagamento;

@Entity
public class Plano {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String descricao;
	
	private Pagamento formaDePagamento;
	
	//adicionar atividades que o plano da acesso

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Pagamento getFormaDePagamento() {
		return formaDePagamento;
	}

	public void setFormaDePagamento(Pagamento formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}
}