import java.util.ArrayList;

public class ListaTodo {
    public ListaTodo() {
        ArrayList<Tarefa> tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa ler_conteudo_aula_lambda){
        //throw new IllegalArgumentException("Tarefa com identificador <identificador> ja existente na lista");
    }

    public boolean marcarTarefaFeita(int i){
        return false;
    }

    public void desfazerTarefa(int i){}

    public void desfazerTodas(){}
    public void fazerTodas(){}
    public void listarTarefas(){

        System.out.println(
                "    [X]  Id: 1 - Descricao: Ler conteudo aula Lambda\n" +
                "    [ ]  Id: 2 - Descricao: Aprender Design Patterns\n" +
                "    [ ]  Id: 3 - Descricao: Limpar o quarto\n" +
                "    ----\n" +
                "    [ ]  Id: 1 - Descricao: Ler conteudo aula Lambda\n" +
                "    [X]  Id: 2 - Descricao: Aprender Design Patterns\n" +
                "    [ ]  Id: 3 - Descricao: Limpar o quarto\n" +
                "    ----\n" +
                "    [ ]  Id: 1 - Descricao: Ler conteudo aula Lambda\n" +
                "    [X]  Id: 2 - Descricao: Aprender Design Patterns\n" +
                "    [ ]  Id: 3 - Descricao: Limpar o quarto\n" +
                "    ----\n" +
                "    [X]  Id: 1 - Descricao: Ler conteudo aula Lambda\n" +
                "    [X]  Id: 2 - Descricao: Aprender Design Patterns\n" +
                "    [X]  Id: 3 - Descricao: Limpar o quarto\n" +
                "    ----\n" +
                "    [ ]  Id: 1 - Descricao: Ler conteudo aula Lambda\n" +
                "    [ ]  Id: 2 - Descricao: Aprender Design Patterns\n" +
                "    [ ]  Id: 3 - Descricao: Limpar o quarto\n" +
                "    ----\n" +
                "    false\n" +
                "    ----\n" +
                "    false\n" +
                "    ----\n" +
                "    Tarefa com identificador 2 ja existente na lista\n" +
                "    ----\n" +
                "    Descricao de tarefa invalida\n" +
                "    ----");
    }
}