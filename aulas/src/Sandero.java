package src;

public class Sandero implements CarroI {
    final int limiteDeVelocidade = 50;

    public int velocidadeAtual = 0;

    @Override
    public void acelerar() {
        if (this.velocidadeAtual < this.limiteDeVelocidade) {
            this.velocidadeAtual += 10;
            System.out.println("Acelerando");
        }
        System.out.println("velocidade atual" + this.velocidadeAtual);
    }

    @Override
    public void freiar() {

    }

    @Override
    public void parar() {

    }
}
