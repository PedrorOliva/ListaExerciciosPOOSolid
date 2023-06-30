package L008.ExercicioUm;

import java.util.ArrayList;
import java.util.List;

public class GerenciaProduto implements BancoProdutos{
  private List<Produtos> listaProdutos = new ArrayList<>();

  @Override
  public void adicionarProduto(Produtos produto) {
    listaProdutos.add(produto);
    System.out.println("Produto adicionado!");
  }

  public void exibirProdutos(){
    if(listaProdutos.isEmpty()){
      System.out.println("Não existem produtos cadastrados!!");
    } else {
      System.out.println("--- Lista de Produtos ---");
      for(Produtos produto : listaProdutos){
        System.out.println("Nome: " + produto.getNome() + "   |  Preço: R$" + produto.getPreco());
      }
    }
  }

  @Override
  public void excluirProduto(String nome) {
    Produtos produtoExiste = null;
    for(Produtos produto: listaProdutos){
      if(produto.getNome().equalsIgnoreCase(nome)){
        produtoExiste = produto;
      }
    }
    if(produtoExiste != null){
      listaProdutos.remove(produtoExiste);
      System.out.println("Produto removido!");
    } else {
      System.out.println("Nenhum produto encontrado!");
    }
  }

}
