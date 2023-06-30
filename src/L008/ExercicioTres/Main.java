package L008.ExercicioTres;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner inputUsuario = new Scanner(System.in);
    GerenciaPratos gerencia = new GerenciaPratos();

    boolean continuar = true;

    while (continuar){
      System.out.println("Escolha uma das opções: \n1 - Adicionar prato \n2 - Exibir todos os pratos " +
          "\n3 - Excluir um prato \n4 - SAIR");
      int escolha = inputUsuario.nextInt();

      switch (escolha){
        case 1:
          gerencia.adicionar();
          break;
        case 2:
          gerencia.exibir();
          break;
        case 3:
          gerencia.excluir();
          break;
        case 4:
          continuar = false;
          System.out.println("Encerrando programa...");
          break;
        default:
          System.out.println("Escolha uma opção válida!!");
      }
    }
  }
}
