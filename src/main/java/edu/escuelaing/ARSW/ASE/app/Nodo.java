package edu.escuelaing.ARSW.ASE.app;

/**
 * Implementación del nodo para la lista vinculada
 *
 * Autor: BRAYAN JIMÉNEZ
 */
public class Nodo<T> {
    private Nodo<T> next;
    private T data;
    public Nodo(T e) {
        this.data = e;
    }
    public void cambiarNext(Nodo<T> next) {
        this.next = next;
    }
    public T obtenerData() {
        return data;
    }
    public Nodo<T> obtenerNext(){
        return next;
    }
    public boolean hasNext() {
        return next!=null;
    }
}
