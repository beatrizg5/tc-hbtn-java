import java.util.ArrayList;


public class Celular {

    private ArrayList<Contato> contatos;

    public Celular() {
        this.contatos = new ArrayList<Contato>();
    }

    public int obterPosicaoContato(String nomeContato) {
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).getNome().equals(nomeContato)) {
                return i;
            }
        }
        return -1;
    }

    public void adicionarContato(Contato contatoNovo) {
        if(obterPosicaoContato((contatoNovo.getNome()))==-1){
            contatos.add(contatoNovo);
        }else {
            throw new IllegalArgumentException("Nao foi possivel adicionar contato. Contato jah existente com esse nome");
        }
    }

    public void atualizarContato(Contato contatoAntigo, Contato novoContato) {
        if(obterPosicaoContato((contatoAntigo.getNome()))==-1){
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato nao existe");
        }else {
            if(obterPosicaoContato(novoContato.getNome()) != -1 && !novoContato.getNome().equals(contatoAntigo.getNome())){
                throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato jah existente com esse nome");
            }
            int i = contatos.indexOf(contatoAntigo);
            contatos.set(i, novoContato);
        }
    }

    public void removerContato(Contato contato) {
        if(obterPosicaoContato(contato.getNome())==-1){
            throw new IllegalArgumentException("Nao foi possivel remover contato. Contato nao existe");
        }
        contatos.remove(contato);
    }

    public void listarContatos() {
        for (int i = 0; i < contatos.size(); i++) {
            String nomes = contatos.get(i).getNome();
            String numeroTelefone = contatos.get(i).getNumero();
            TipoNumero tipo = contatos.get(i).getTipoNumero();
            System.out.printf("%s -> %s (%s)\n", nomes, numeroTelefone, tipo);

        }
    }
}
