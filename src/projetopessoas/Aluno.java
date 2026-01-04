package projetopessoas;
public class Aluno extends Pessoa {
    private int mat;
    private String curso;

    public void cancelarMatr() {
        System.out.println("Matrícula será cancelada");
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public String getCurso() {
        return curso;
    }

    public String setCurso() {
        this.curso = curso;
    }

}
