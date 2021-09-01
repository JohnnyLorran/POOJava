package ProjetoConta;

public class Conta {
    public String conta;
    public String agencia;
    public double saldo;
    public String nomeCliente;

    int saq = 0;

    public int sacar(double valorR){
        if (saq == 1) {
            if (saldo > valorR) {
                saldo -= valorR;
                return 1;
            }
        }
     return 0;
    }

    public void depositar(double valorD){
       saldo += valorD;
       saq = 1;
    }

    public void imprimir(){
        System.out.println("\nConta: " + conta);
        System.out.println("Agencia: " + agencia);
        System.out.println("Saldo: " + saldo);
        System.out.println("Nome do Cliente: " + nomeCliente);
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
}
