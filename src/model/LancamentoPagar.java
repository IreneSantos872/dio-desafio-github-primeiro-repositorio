package model;

import java.util.Date;

public class LancamentoPagar {

    private int idLancamentoPagar;
    private String fornecedor;
    private String categoria;
    private String banco;
    private String descricao;
    private Date dataemissao;
    private Date datavencimento;
    private Double valor;

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public int getIdLancamentoPagar() {
        return idLancamentoPagar;
    }

    public void setIdLancamentoPagar(int idLancamentoPagar) {
        this.idLancamentoPagar = idLancamentoPagar;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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
