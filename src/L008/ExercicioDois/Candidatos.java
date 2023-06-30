package L008.ExercicioDois;

public class Candidatos {
  private int numMatricula;
  private double nota;

  public Candidatos(int numMatricula, double nota) {
    this.numMatricula = numMatricula;
    this.nota = nota;
  }

  public int getNumMatricula() {
    return numMatricula;
  }

  public void setNumMatricula(int numMatricula) {
    this.numMatricula = numMatricula;
  }

  public double getNota() {
    return nota;
  }

  public void setNota(double nota) {
    this.nota = nota;
  }
}
