package ProjetoComputador;

public class Computador {
    public String marca;
    public String cor;
    public String modelo;
    public Long numeroSerie;
    public Double preco;

    public void  imprimir(){
        System.out.println("\nMarca: " + marca);
        System.out.println("Cor: " + cor);
        System.out.println("Modelo: " + modelo);
        System.out.println("Número de serie: " + numeroSerie);
        System.out.println("Preço: " + preco);
    }
    public  void calcularValor(){
        double valor;
        if (marca == "HP"){
            valor = preco * 1.3;
            alterarValor(valor);
        }else if (marca == "IBM"){
            valor = preco * 1.5;
            alterarValor(valor);
        }

    }
    public int alterarValor(Double newValor){
       if (newValor > 0){
           preco = newValor;
           return 1;
       }
        return 0;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setNumeroSerie(Long numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
