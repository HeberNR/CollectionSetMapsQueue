package org.example.collections;

import org.example.enums.Marca;
import org.example.models.Auto;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EjSets {
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


    //creo Set
    Set<Auto> setAutos = new HashSet<Auto>();

    //agrego elementos con metodo add
    setAutos.add(auto7);
    setAutos.add(auto1);
    setAutos.add(auto2);
    setAutos.add(auto2);
    setAutos.add(auto3);
    setAutos.add(auto4);
    setAutos.add(auto5);
    setAutos.add(auto6);
    setAutos.add(auto7);

    //reccoro y muestro
    System.out.println("Recorro el set con for-each");
    for (Auto a : setAutos) {
      System.out.println(a.toString());
    }

    System.out.println("Recorro el set con iterator");
    Iterator<Auto> it = setAutos.iterator();
    while (it.hasNext()) {
      Auto a = it.next();
      System.out.println(a.toString());
    }

    //ver si contiene un elemento
    System.out.println("Esta el Civic en la lista?" + setAutos.contains(auto7));

    setAutos.clear();

    System.out.println("Tamaño del set luego del clear: " + setAutos.size());
    System.out.println("Esta vacio el set?" + setAutos.isEmpty());
    System.out.println("Recorro el set con for-each luego de clear");
    for (Auto a : setAutos) {
      System.out.println(a.toString());
    }
  }
}
