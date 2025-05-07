package Pilas;
public class ColaPrioridad<T extends Comparable> extends Cola {
    public void offer(T dato){
        if(cola.isEmpty()){
            cola.add(dato);
        }else{
            boolean bb = false;
            for(int i = 0 ; i < cola.size() && !bb ; i++){
                T actual = (T)cola.get(i);
                if(dato.compareTo(actual) == 1){
                    cola.add(dato,i);
                    bb = true;
                }
            }
            if(!bb){
                cola.add(dato);
            }
        }
    }
}
