import java.util.ArrayList;
import java.util.List;

public  class Main {
    public static void main(String[] args) {
        //Creamos una lista (List) de nombres
        List<String> nombres = new ArrayList<String>();
        //Añadimos varios nombres
        nombres.add("Juan");
        nombres.add("Marco");
        nombres.add("Pedro");
        nombres.add("Juan");
        nombres.add("Marco");

        //Eliminamos algunos nombres
        nombres.remove("Pedro");
        nombres.remove("Marco");

        //Con un for-each recorremos la lista y mostramos los nombres por pantalla
        for(String nombre : nombres){
            System.out.println(nombre);
        }
    }
}