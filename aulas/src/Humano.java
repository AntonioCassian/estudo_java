package src;

public class Humano extends SerVivo {
    String nome;
    public Humano() {
        super(42);
        this.nome = "Fernada";
    }

    // @Override
    // public void respirar() {
    //      System.out.println(this.idade);
    //     System.out.println("Expirando e Inalando");
    // }

    
    @Override
    public void respirar() {
        System.out.print("transformando em oxigênio");
    }
}
