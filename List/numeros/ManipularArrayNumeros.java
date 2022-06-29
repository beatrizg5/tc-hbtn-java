import java.util.List;

public class ManipularArrayNumeros {

    //Esse método deve retornar a posicao do número na lista, se número não for encontrado retorna -1
    public static void buscarPosicaoNumero(List<Integer> numeros, int i) {

    }


    //Esse método verifica se o número já existe na lista, se sim, lança uma exceção com a mensagem
    // Numero jah contido na lista, se não, adiciona o item na lista, utilize o método buscarPosicaoNumero
    public static void adicionarNumero(List<Integer> numeros, int i) {
        if (numeros.contains(i)) {
            throw new RuntimeException("Numero jah contido na lista");

        } else {
            numeros.add(i);
        }

    }

    //Se o número não for encontrado na lista deve-se lançar uma exceção com a mensagem Numero nao encontrado
    // na lista, utilize o método buscarPosicaoNumero.
    public static void removerNumero(List<Integer> numeros, int i) {
        if (numeros.contains(i)) {
            numeros.remove(i);
        } /*else {
            throw new RuntimeException("Numero nao encontrado na lista");
        }*/
    }

    //deve buscar o produto e substituí-lo. Caso o número a ser substituído não exista, apenas adicione
    // o número substituto.
    public static void substituirNumero(List<Integer> numeros, int numeroSubstituir, int numeroSubstituto) {
        if (numeros.contains(numeroSubstituir)) {
            //numeros.set(numeroSubstituir, numeroSubstituto);
        }else{
            numeros.add(numeroSubstituto);
        }
    }
}

