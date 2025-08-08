package org.example.collections;

import org.example.enums.Marca;
import org.example.models.Auto;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class EjQueue {
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

    ArrayDeque<Auto> queueAutos = new ArrayDeque<>();

    // para agregar elementos uso add (collections)
    queueAutos.add(auto1);

    //para agregar elementos uso offer (Queue)
    queueAutos.offer(auto2);
    queueAutos.offer(auto3);

    // agrego al principio de la cola
    queueAutos.offerFirst(auto4);
    // agrego al final de la cola
    queueAutos.offerLast(auto5);
    queueAutos.offer(auto6);
    queueAutos.offer(auto7);

    Auto auto8 = null;
    // NO SE PUEDE AGREGAR OBJETOS NULL
    //queueAutos.offer(auto8);

    System.out.println("Element: " + queueAutos.element().toString());
    System.out.println("PeekLast: " + queueAutos.peekLast().toString());
    System.out.println("Peek: " + queueAutos.peek().toString());
    System.out.println("PeekFirst: " + queueAutos.peekFirst().toString());

    System.out.println("Está vacia? " + queueAutos.isEmpty());

    // el primero que se agregó es el primero que se elimina
    while (!queueAutos.isEmpty()) {
      // poll saca elementos de la cola
      System.out.println("Poll:" + queueAutos.poll().toString());
    }

    System.out.println("Está vacia? " + queueAutos.isEmpty());

    /*
    for (Auto a : queueAutos) {
      System.out.println(a.toString());
    } */
  }
}
