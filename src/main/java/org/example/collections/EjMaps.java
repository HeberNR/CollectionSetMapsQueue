package org.example.collections;

import org.example.enums.Marca;
import org.example.models.Auto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class EjMaps {
  public static void main(String[] args) {

    Auto auto1 = new Auto("AB123CD", "Rojo", 2025, 3000,
        "Raptor", Marca.FORD);
    Auto auto2 = new Auto("AB456CD", "Negro", 2017, 122000,
        "Focus", Marca.FORD);
    Auto auto3 = new Auto("AB344CD", "Azul", 2020, 49000,
        "Polo", Marca.VW);
    Auto auto4 = new Auto("AB283CD", "Blanco", 2022, 30000,
        "Onix", Marca.CHEVROLET);
    Auto auto5 = new Auto("AB263LL", "Gris", 2024, 95000,
        "Corolla", Marca.TOYOTA);
    Auto auto6 = new Auto("AB657KL", "Azul", 2024, 15000,
        "Oroch", Marca.RENAULT);
    Auto auto7 = new Auto("NLW 496", "Gris", 2012, 132000,
        "Civic", Marca.HONDA);

    /// mapa de doble entrada: Clave: Integer, Valor: List<Auto>
    HashMap<Integer, List<Auto>> mapaAutosPorAnio = new HashMap<>();

    HashMap<String, Auto> mapaAutosPorPatente = new HashMap<>();

    mapaAutosPorPatente.put("AB456CD", auto2);
    mapaAutosPorPatente.put("AB344CD", auto3);
    mapaAutosPorPatente.put("NLW 496", auto7);

    //para obtener un valor del mapa por clave
    System.out.println("Esta el auto con patente AA123BB");
    System.out.println(mapaAutosPorPatente.containsKey("AA123BB"));

    //para ver si un auto existe por patente
    System.out.println("Esta el auto2?");
    System.out.println(mapaAutosPorPatente.containsValue(auto2));

    //obtener un auto por patente(calve) y mostrarlo
    System.out.println(mapaAutosPorPatente.get("NLW 496").toString());

    //para recorrer el mapa (pares atributo-valor)
    // por cada put que use tengo una entrada en el mapa (1 por atributo-valor)
    // POR CADA ENTRADAD DEL MAPA
    for (Map.Entry<String, Auto> fila : mapaAutosPorPatente.entrySet()) {
      //puedo mostrar el atributo: uso getKey()
      System.out.println("Patente: " + fila.getKey());
      // puedo mostrar el valor
      System.out.println("Patente: " + fila.getValue());
    }

  }
}
