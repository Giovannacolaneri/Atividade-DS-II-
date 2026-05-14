import java.util.ArrayList;

public class SistemaTarefas {

    public static String adicionarTarefa(ArrayList<String> lista, String tarefa) {
        if (tarefa.trim().isEmpty()) {
            return "Digite uma tarefa válida";
        }

        lista.add(tarefa);
        return "Tarefa adicionada com sucesso";
    }

    public static void main(String[] args) {
        ArrayList<String> tarefas = new ArrayList<>();

        System.out.println(adicionarTarefa(tarefas, "Estudar testes de software"));
        System.out.println(tarefas);
    }
}
