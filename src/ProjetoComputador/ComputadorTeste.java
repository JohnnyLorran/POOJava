package ProjetoComputador;

public class ComputadorTeste {

    public static void main(String[] args){
        Computador computador1,computador2;
        int rtn;

        computador1 = new Computador();
        computador1.setMarca("HP");
        computador1.setCor("Rosa");
        computador1.setModelo("HP123");
        computador1.setNumeroSerie(1223L);
        computador1.setPreco(2000.00);
        computador1.imprimir();
        computador1.calcularValor();
        computador1.imprimir();

        computador2 = new Computador();
        computador2.setMarca("IBM");
        computador2.setCor("Branco");
        computador2.setModelo("IBM875");
        computador2.setNumeroSerie(1873L);
        computador2.setPreco(3000.00);
        computador2.imprimir();
        computador2.calcularValor();
        computador2.imprimir();
        rtn = computador2.alterarValor(3500.00);
        if (rtn == 1) {
           System.out.println("\nValor Alterado");
        }else{
           System.out.println("\nValor Não Alterado");
        }
        computador2.imprimir();
    }
}
