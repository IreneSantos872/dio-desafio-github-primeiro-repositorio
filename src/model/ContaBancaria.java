package model;

import metodo.Conta;

public class ContaBancaria extends Conta {

    private int idContaBancaria;
    private String nomeBanco;
    private String agencia;
    private String nroconta;
    private Double saldo;
    protected Cliente cliente;

    public int getIdContaBancaria() {
        return idContaBancaria;
    }

    public void setIdContaBancaria(int idContaBancaria) {
        this.idContaBancaria = idContaBancaria;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNroconta() {
        return nroconta;
    }

    public void setNroconta(String nroconta) {
        this.nroconta = nroconta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }


//    protected void imprimirInfoComuns(Cliente cliente){
//        System.out.println(String.format("Titular: %s", this.cliente.getNomeCliente()));
//        System.out.println(String.format("Agencia: %s", this.agencia));
//        System.out.println(String.format("Numero: %s", this.nroconta));
//        System.out.println(String.format("Saldo: %.2f", this.saldo));
//
//    }
}
