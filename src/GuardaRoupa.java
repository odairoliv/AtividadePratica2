import java.util.ArrayList;
import java.util.List;

public class GuardaRoupa {

    private static List<Vesturario> listaRoupas = new ArrayList<>();

    public static void cadastrar(Vesturario fun){
        listaRoupas.add(fun);
    }

    public static List<Vesturario> getlistaRoupas(){
        return listaRoupas;
    }

    public static List<Vesturario> getAcessorio(){
        List<Vesturario> tempList = new ArrayList<>();

        for (Vesturario tempRoupa: listaRoupas) {
            if (tempRoupa instanceof Acessorio) {
                tempList.add(tempRoupa);
            }
        }

        return tempList;
    }

    public static List<Vesturario> getCalca(){
        List<Vesturario> tempList = new ArrayList<>();

        for (Vesturario tempRoupa: listaRoupas) {
            if (tempRoupa instanceof Calca) {
                tempList.add(tempRoupa);
            }
        }

        return tempList;
    }

    public static List<Vesturario> getCamisa(){
        List<Vesturario> tempList = new ArrayList<>();

        for (Vesturario tempRoupa: listaRoupas) {
            if (tempRoupa instanceof Camisa) {
                tempList.add(tempRoupa);
            }
        }

        return tempList;
    }

    public static boolean excluir(int id){
        for (Vesturario tempVesturario : listaRoupas) {
            if (tempVesturario.getId() == id) {
                listaRoupas.remove(tempVesturario);
                return true;
            }
        }

        return false;
    }

    public static void excluirTodos() {
        listaRoupas.clear();
        System.out.println("Todos os itens foram excluídos.");
    }
}
