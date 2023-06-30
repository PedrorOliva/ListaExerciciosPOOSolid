package L008.ExercicioUm;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner inputUsuario = new Scanner(System.in);
    GerenciaProduto gerenciaProduto = new GerenciaProduto();

    boolean continuar = true;

    while(continuar){
      System.out.println("Escolha uma das opções: \n1 - Adicionar produto \n2 - Exibir todos os produtos " +
          "\n3 - Excluir um produto \n4 - SAIR");
      int escolha = inputUsuario.nextInt();

      switch(escolha){
        case 1:
          System.out.println("Digite o nome do produto: ");
          String nome = inputUsuario.next();
          System.out.println("Informe o preço: ");
          double preco = inputUsuario.nextDouble();
          Produtos produto = new Produtos(nome, preco);
          gerenciaProduto.adicionarProduto(produto);
          break;
        case 2:
          gerenciaProduto.exibirProdutos();
          break;
        case 3:
          System.out.println("Informe o nome do produto: ");
          nome = inputUsuario.next();
          gerenciaProduto.excluirProduto(nome);
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
