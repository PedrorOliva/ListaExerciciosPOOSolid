package L007;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Pais Brasil = new Brasil("BRA", "Brasil", 209288278, 8515767.049);
    Pais Argentina = new Argentina("ARG", "Argentina", 44271041, 2780400);
    Pais Bolivia = new Bolivia("BOL", "Bolívia", 11307314, 1098581);

    Brasil.setFronteira(new ArrayList<>());
    Argentina.setFronteira(new ArrayList<>());
    Bolivia.setFronteira(new ArrayList<>());

    System.out.println("Brasil e Argentina");
    Brasil.fazFronteira(Argentina);
    Brasil.vizinho(Argentina);
    Brasil.densidadePopulacional();
    Brasil.temVizinhos(Brasil);

    System.out.println("\nArgentina e Brasil");
    Argentina.fazFronteira(Brasil);
    Argentina.vizinho(Brasil);
    Argentina.densidadePopulacional();

    System.out.println("\nBolivia e Brasil");
    Bolivia.fazFronteira(Brasil);
    Bolivia.vizinho(Brasil);
    Bolivia.densidadePopulacional();

  }
}
