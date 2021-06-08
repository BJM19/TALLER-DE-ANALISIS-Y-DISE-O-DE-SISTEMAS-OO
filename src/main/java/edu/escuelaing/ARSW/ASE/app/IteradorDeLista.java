package edu.escuelaing.ARSW.ASE.app;

import java.util.Iterator;


/**
 * Implementación de Iterador para la lista vinculada
 *
 * Autor: BRAYAN JIMÉNEZ
 */
public class IteradorDeLista<T> implements Iterator<T> {
    private Nodo<T> actual;
    public IteradorDeLista(Nodo<T> nodo){
        this.actual= nodo;
    }
    @Override
    public boolean hasNext() {
        return actual!=null;
    }
    @Override
    public T next() {
        T data = this.actual.obtenerData();
        Nodo<T> nodo = this.actual.obtenerNext();
        this.actual= nodo;
        return data;
    }
}
