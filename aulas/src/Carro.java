package src;

public class Carro {
    String modelo;
    public static void main(String[] args) {
        System.out.println("teste");
    }
    public Carro(String modelo) {
        this.modelo = modelo;
        // System.out.println("Carro criado!");
    }

    // public void acelerar() {
    //     System.out.println("Acelerando o carro" + this.modelo);
    // }
    public String acelerar() {
        System.out.println("Acelerando o carro" + this.modelo);
        return "oi";
    }
}