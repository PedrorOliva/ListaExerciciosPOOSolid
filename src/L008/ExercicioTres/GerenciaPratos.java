package L008.ExercicioTres;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GerenciaPratos implements FuncoesCardapio{
  Scanner inputUsuario = new Scanner(System.in);
private Map<String, String> cardapio = new HashMap<>();
  @Override
  public void adicionar() {
    System.out.println("Nome do prato: ");
    String nome = inputUsuario.nextLine();
    System.out.println("Ingredientes: ");
    String ingredientes = inputUsuario.nextLine();
    cardapio.put(nome, ingredientes);
    System.out.println("Prato adicionado!");
  }

  @Override
  public void exibir() {
    for(String prato: cardapio.keySet()){
      System.out.println("Prato: " + prato + " ingredientes: " + cardapio.get(prato));
    }
  }

  @Override
  public void excluir() {
    System.out.println("Digite o nome do prato: ");
    String nome = inputUsuario.next();
    for(String prato : cardapio.keySet()){
      if(nome.equalsIgnoreCase(prato)){
        cardapio.remove(prato);
        System.out.println("Prato removido!");
      } else {
        System.out.println("Prato não encontrado!");
      }
    }
  }
}
