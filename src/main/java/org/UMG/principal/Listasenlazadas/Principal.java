package org.UMG.principal.Listasenlazadas;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Principal {
    private static final Logger logger = LogManager.getLogger(Principal.class); //para utilizar logger

    public static void main(String[] args) {
        Lista miLista = new Lista();

        // Agregar elementos
        miLista.agregandoAlInicio("Juan");
        miLista.agregandoAlInicio("Ana");
        miLista.agregandoAlInicio("Lupita");
        miLista.agregandoAlInicio("Maria");

        // Mostrar lista
        logger.info("LISTA INICIAL:");
        miLista.mostrarLista();

        // Eliminar al inicio
        miLista.eliminarAlInicio();
        logger.info("LISTA AL ELIMINAR EL ELEMENTO DEL INICIO:");
        miLista.mostrarLista();

        // Eliminar otra vez
        miLista.eliminarAlInicio();
        logger.info("LISTA CON OTRA ELIMINACION:");
        miLista.mostrarLista();
    }
}


