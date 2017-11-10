package academia.entidades;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;

@Entity
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Basic(fetch = FetchType.LAZY)
    @OneToOne
    @JoinTable(name = "USER_FUNCIONARIO")
    private User usuario;

    private String funcao;

    private Integer cargaHorarioMensal;

    private String grauInstrucao;

    private double valorHora;

    private double salario;

    private String oberservacao;

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

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public Integer getCargaHorarioMensal() {
        return cargaHorarioMensal;
    }

    public void setCargaHorarioMensal(Integer cargaHorarioMensal) {
        this.cargaHorarioMensal = cargaHorarioMensal;
    }

    public String getGrauInstrucao() {
        return grauInstrucao;
    }

    public void setGrauInstrucao(String grauInstrucao) {
        this.grauInstrucao = grauInstrucao;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getOberservacao() {
        return oberservacao;
    }

    public void setOberservacao(String oberservacao) {
        this.oberservacao = oberservacao;
    }

}
