package Pilas;

public class Cola<T>{
    protected ListaSE<T> cola;
    
    public Cola(){
        cola = new ListaSE<T>();
    }
    
    public void offer(T dato){
        cola.add(dato);
    }
    
    public T poll(){
        return cola.remove(0);
    }
    
    public boolean isEmpty(){
        return cola.size() == 0;
    }
}
