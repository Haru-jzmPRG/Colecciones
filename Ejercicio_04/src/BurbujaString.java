import java.util.ArrayList;

public class BurbujaString {
    ArrayList<String> lista = new ArrayList<String>();

    public void agregar(int cantidad){
        for(int i = 0; i < cantidad; i++){
            lista.add(System.console().readLine());
        }
    }

    public void ordenar(){
        for(int i = 0; i < lista.size(); i++){
            for(int j = 0; j < lista.size() - 1; j++){
                if(lista.get(j).compareTo(lista.get(j + 1)) > 0){
                    String temp = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, temp);
                }
            }
        }
    }

    public void mostrar(){
        System.out.println(lista);
    }
}
