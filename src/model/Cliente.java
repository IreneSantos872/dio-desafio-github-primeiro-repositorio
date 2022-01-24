package model;

public class Cliente {

    private static int SEQUENCIAL = 1;

    private static int idcliente;
    private String nomeCliente;

    public Cliente(Cliente nomecliente){
          this.idcliente = SEQUENCIAL++;
          this.nomeCliente = nomecliente;

    }

    public static int getIdcliente() {
        return idcliente;
    }

    public static void setIdcliente(int idcliente) {
        Cliente.idcliente = idcliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
}
