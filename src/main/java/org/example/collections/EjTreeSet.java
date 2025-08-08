package org.example.collections;

import org.example.enums.Marca;
import org.example.models.Auto;

import java.util.Set;
import java.util.TreeSet;

public class EjTreeSet {
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


    Set<Auto> treeSetAutos = new TreeSet<>();
    /* Diferentes formas de crear treeSet
    treeSetAutos.add(auto1);
    TreeSet<Auto> treeSetAutos = Set.of(auto1, auto2, auto3, auto4, auto5, auto6, auto7);
    */

    treeSetAutos.add(auto1);
    treeSetAutos.add(auto2);
    treeSetAutos.add(auto3);
    treeSetAutos.add(auto4);
    treeSetAutos.add(auto5);
    treeSetAutos.add(auto6);
    treeSetAutos.add(auto6);
    treeSetAutos.add(auto7);

    for (Auto a : treeSetAutos) {
      System.out.println(a.toString());
    }


  }
}
