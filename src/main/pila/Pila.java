package main.pila;

import main.nodo.Nodo;

public class Pila {
    public Nodo cima=null;
    public int size=0;
    
    
    public Object push(Object valor){
        if (cima==null) {
            cima=new Nodo(valor);
        } else {
            Nodo nuevo=new Nodo(valor);
            nuevo.siguiente=cima;
            cima=nuevo;
        }
        size++;
        return valor;
    }
    
    
    public boolean IsEmpty(){
        return cima==null;
    }
    
    public int size(){
        return size;
    }
    
    public Object peek(){
        Object result=null;
        if (cima!=null) {
            result=cima.valor;
        }
        return result;
    }
    
    public Object pop(){
        if (cima==null) {
            return null;
        } else {
            Nodo temp=cima;
            Object valor=cima.valor;
            cima=cima.siguiente;
            this.size--;
            temp=null;
            return valor;
        }
    }
    

    public void listarPila(){
        Nodo temp=cima;
        while (temp!=null) {
            System.out.println(temp.valor);
            temp=temp.siguiente;
        }
    }
    
    public void clear(){
        while (!IsEmpty()) {
           this.pop();
        }
    }
}

