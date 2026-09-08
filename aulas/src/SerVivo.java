package src;

public abstract class SerVivo {
    protected int idade;

    public SerVivo(int idade) {
        this.idade = idade;
    }

    public abstract void respirar();
    // public void respirar() {
    //     System.out.println(this.idade);
    //     System.out.println("Expirando e Inalando");
    // }

    // public abstract void respirar();
    public void dormir() {
        System.out.println("dormindo...");
    }
}
