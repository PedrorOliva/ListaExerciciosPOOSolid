package L008.ExercicioDois;

import java.util.ArrayList;
import java.util.List;

public class GerenciaCandidatos implements BancoCandidatos {
  private List<Candidatos> listaCandidatos = new ArrayList<>();

  @Override
  public void exibirCanditados() {
    if(listaCandidatos.isEmpty()){
      System.out.println("Não existem candidatos cadastrados!!");
    } else {
      System.out.println("--- Candidatos ---");
      for(Candidatos candidato : listaCandidatos){
        System.out.println("Matrícula: " + candidato.getNumMatricula() + " Nota: " + candidato.getNota());
      }
    }
  }

  @Override
  public void cadastrarCandidatos(Candidatos candidato) {
    listaCandidatos.add(candidato);
    System.out.println("Candidato adicionado!");
  }

  @Override
  public void excluirCandidato(int numMatricula) {
    Candidatos existeCandidato = null;
    for(Candidatos candidato : listaCandidatos) {
      if(candidato.getNumMatricula() == numMatricula){
        existeCandidato = candidato;
      }
    }
    if(existeCandidato != null) {
      listaCandidatos.remove(existeCandidato);
      System.out.println("Candidato removido!");
    } else {
      System.out.println("Nenhum candidato encontrado!");
    }
  }
}
