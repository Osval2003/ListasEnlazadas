package org.UMG.principal.Listasenlazadas;

public class Nodo {
    String dato; // Dato que contiene el nodo
    Nodo siguiente; // Enlace o puntero contiene dirección del siguiente nodo

    public Nodo(String d, Nodo sig) {
        dato = d;
        siguiente = sig;
    }
}
