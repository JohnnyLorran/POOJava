package ProjetoConta;

import java.util.Scanner;

public class ContaTeste {
    private static Conta conta1 = new Conta();
    static Scanner ler = new Scanner(System.in);


    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int op;

        do {
            System.out.println("\n Bem vindo !! \n\n O que deseja realizar?");
            System.out.print("\n(1) -> Sacar ");
            System.out.print("\n(2) -> Depositar ");
            System.out.print("\n(3) -> Consultar ");
            System.out.print("\n(4) -> Cadastrar ");
            System.out.print("\n ----> Opção desejada: ");
            op = ler.nextInt();
            if(op == 1){
                exeSacar();
            }else if(op == 2){
                exeDepositar();
            }else if(op == 3){
                exeConsultar();
            }else if(op == 4){
                exeCadastrar();
            }
        }while (op < 5 && op != 0);

    }
    public static void exeCadastrar(){
        String recebe;
        System.out.println("\nDigite o nome do Cliente: ");
        recebe = ler.nextLine();
        conta1.nomeCliente = recebe;
        System.out.println("\nDigite o número da conta: ");
        recebe = ler.nextLine();
        conta1.conta = recebe;
        System.out.println("\nDigite o número da agência: " );
        recebe = ler.nextLine();
        conta1.agencia = recebe;
        conta1.saldo = 0;
    }
    public static void exeConsultar(){
        conta1.imprimir();
    }

    public static void exeSacar(){
        int rtn;
        double valor;
        System.out.println("\nDigite o valor que deseja sacar: ");
        valor = ler.nextDouble();
        rtn = conta1.sacar(valor);
        if (rtn == 1){
            System.out.println("\nSaque realizado: ");
        }else{
            System.out.println("\nSaque não realizado: ");
        }
    }
    public static void exeDepositar(){
        double valor;
        System.out.println("\nDigite o valor que deseja depositar: ");
        valor = ler.nextDouble();
        conta1.depositar(valor);
    }



}
