package L007;


import java.util.ArrayList;
import java.util.List;

public class Pais {
  private String codigoISO;
  private String nome;
  private long populacao;
  private double dimensao;
  private List<Pais> fronteira;

  public Pais(String codigoISO, String nome, long populacao, double dimensao) {
    this.codigoISO = codigoISO;
    this.nome = nome;
    this.populacao = populacao;
    this.dimensao = dimensao;
    this.fronteira = fronteira;
  }

  public String getCodigoISO() {
    return codigoISO;
  }

  public void setCodigoISO(String codigoISO) {
    this.codigoISO = codigoISO;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public long getPopulacao() {
    return populacao;
  }

  public void setPopulacao(long populacao) {
    this.populacao = populacao;
  }

  public double getDimensao() {
    return dimensao;
  }

  public void setDimensao(double dimensao) {
    this.dimensao = dimensao;
  }

  public List<Pais> getFronteira() {
    return fronteira;
  }

  public void setFronteira(List<Pais> fronteira) {
    this.fronteira = fronteira;
  }

  public void fazFronteira(Pais pais){
    fronteira.add(pais);
  }

  public boolean vizinho (Pais pais) {
    for (Pais temFronteira : fronteira){
      if(temFronteira.equals(pais)){
        System.out.println("Fazem fronteira!");
        return true;
      }
    }
    return false;
  }

  public double densidadePopulacional(){
    double densidade;
    densidade = populacao / dimensao;
    System.out.println("Densidade populacional: " + densidade);
    return densidade;
  }

  public List<Pais> temVizinhos(Pais pais2){
    List<Pais> eVizinho = new ArrayList<>();
    for(Pais fazFronteira : fronteira){
      if(pais2.vizinho(fazFronteira)){
        eVizinho.add(fazFronteira);
      }
    }
    return eVizinho;
  }
}
