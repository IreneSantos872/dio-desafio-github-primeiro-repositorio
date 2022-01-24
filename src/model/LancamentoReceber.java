package model;

import java.util.Date;

public class LancamentoReceber {

    private int idLancamentoReceber;
    private String cliente;
    private String categoria;
    private String banco;
    private String descricao;
    private Date dataemissao;
    private Date datavencimento;
    private Double valor;

    public int getIdLancamentoReceber() {
        return idLancamentoReceber;
    }

    public void setIdLancamentoReceber(int idLancamentoReceber) {
        this.idLancamentoReceber = idLancamentoReceber;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataemissao() {
        return dataemissao;
    }

    public void setDataemissao(Date dataemissao) {
        this.dataemissao = dataemissao;
    }

    public Date getDatavencimento() {
        return datavencimento;
    }

    public void setDatavencimento(Date datavencimento) {
        this.datavencimento = datavencimento;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
