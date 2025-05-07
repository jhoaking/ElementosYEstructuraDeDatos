package Pilas;
public class Pilas<T>{
    private NodoSE<T> tope;
    public Pilas(){
        tope = null;
    }
    
    public boolean isEmpty(){
        return tope == null;
    }
    
    public void push(T dato){
        if(tope == null){
            tope = new NodoSE<T>(dato);
        }else{
            NodoSE<T> nuevo = new NodoSE<T>(dato);
            nuevo.setSig(tope);
            tope = nuevo;
        }
    }
    
    public T pop(){
        T res = null;
        if(tope != null){
            res = tope.getDato();
            tope = tope.getSig();
        }
        return res;
    }
}
