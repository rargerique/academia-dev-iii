package academia.entidades;

import academia.enums.Pagamento;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;

@Entity
public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne
    @JoinTable(name = "USER_MATRICULA")
    private User usuario;

    private String servicoContratado;

    @OneToOne
    @JoinTable(name = "MATRICULA_PLANO")
    private Plano planoPagamento;

    private String formaPagamento;

    private String observacao;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUsuario() {
        return usuario;
    }

    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }

    public String getServicoContratado() {
        return servicoContratado;
    }

    public void setServicoContratado(String servicoContratado) {
        this.servicoContratado = servicoContratado;
    }

    public Plano getPlanoPagamento() {
        return planoPagamento;
    }

    public void setPlanoPagamento(Plano planoPagamento) {
        this.planoPagamento = planoPagamento;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

}
