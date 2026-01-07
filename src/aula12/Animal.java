package aula12;
public class Animal {
    // Atributos de Animal
    protected float peso;
    protected int idade;
    protected int membros;
    // Métodos de Animal
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }
}
