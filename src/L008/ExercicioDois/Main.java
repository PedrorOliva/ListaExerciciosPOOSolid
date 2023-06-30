package L008.ExercicioDois;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner inputUsuario = new Scanner(System.in);
    GerenciaCandidatos gerenciaCandidato = new GerenciaCandidatos();

    boolean continuar = true;

    while(continuar){
      System.out.println("Escolha uma das opções: \n1 - Adicionar candidato \n2 - Exibir todos os candiatos" +
          "\n3 - Excluir um candidato \n4 - SAIR");
      int escolha = inputUsuario.nextInt();

      switch(escolha){
        case 1:
          System.out.println("Informe o número da matrícula: ");
          int matricula = inputUsuario.nextInt();
          System.out.println("Informe a nota: ");
          double nota = inputUsuario.nextDouble();
          Candidatos candidato = new Candidatos(matricula, nota);
          gerenciaCandidato.cadastrarCandidatos(candidato);
          break;
        case 2:
          gerenciaCandidato.exibirCanditados();
          break;
        case 3:
          System.out.println("Informe o número da matrícula: ");
          matricula = inputUsuario.nextInt();
          gerenciaCandidato.excluirCandidato(matricula);
          break;
        case 4:
          continuar = false;
          System.out.println("Encerrando programa...");
        default:
          System.out.println("Escolha uma opção válida!");
      }
    }
  }
}
