package academia.entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import academia.enums.DiasSemana;
import academia.enums.Periodo;

@Entity
public class Atividade {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String descricao;
	
	@ManyToMany
    @JoinTable(name = "ATIVIDADE_RESTRICOES")
    private List<Restricao> restricoes = new ArrayList<Restricao>();
	
	private DiasSemana dia;
	
	private Periodo periodo;
	
	@ManyToMany
    @JoinTable(name = "USER_ATIVIDADES")
    private List<User> clientes = new ArrayList<User>();

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

	public List<Restricao> getRestricoes() {
		return restricoes;
	}

	public void setRestricoes(List<Restricao> restricoes) {
		this.restricoes = restricoes;
	}

	public DiasSemana getDia() {
		return dia;
	}

	public void setDia(DiasSemana dia) {
		this.dia = dia;
	}

	public Periodo getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
	}

	public List<User> getClientes() {
		return clientes;
	}

	public void setClientes(List<User> clientes) {
		this.clientes = clientes;
	}
}
