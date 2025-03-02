package org.UMG.principal.Listasenlazadas;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Lista {
    private static final Logger logger = LogManager.getLogger(Lista.class); // Logger

    Nodo inicio, fin; // Punteros para acceder al inicio o fin de la lista

    public Lista() {
        inicio = null;
        fin = null;
    }

    // Metodo para saber si la lista está vacía
    public boolean estaVacia() {
        return inicio == null;
    }

    // Metodo para agregar un nodo al inicio
    public void agregandoAlInicio(String d) {
        if (estaVacia()) {
            inicio = new Nodo(d, inicio);
            fin = inicio;
            logger.info("Nodo agregado al inicio: " + d);
        } else {
            inicio = new Nodo(d, inicio);
            logger.info("Nodo agregado al inicio: " + d);
        }
    }

    // Metodo para eliminar el primer nodo de la lista
    public void eliminarAlInicio() {
        if (estaVacia()) {
            logger.error("La lista está vacía, no hay nada que eliminar.");
        } else {
            logger.info("Eliminado: " + inicio.dato);
            inicio = inicio.siguiente; // Mueve el puntero de inicio al siguiente nodo
            if (inicio == null) { // Si después de eliminar queda vacía, actualizar 'fin'
                fin = null;
            }
        }
    }

    // Metodo para mostrar la lista
    public void mostrarLista() {
        Nodo aux = inicio;
        while (aux != null) {
            logger.info("[" + aux.dato + "] ----> ");
            aux = aux.siguiente;
        }
    }
}

