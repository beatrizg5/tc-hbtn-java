import java.util.ArrayList;
public class ProcessadorVideo {

    private ArrayList<CanalNotificacao>canais;
    public ProcessadorVideo() {
        this.canais = new ArrayList<CanalNotificacao>();
    }

    public void registrarCanal(CanalNotificacao canal){
        canais.add(canal);
    }

    public void processar(Video videos){
        for (int i = 0; i < canais.size(); i++) {
            Mensagem mensagem = new Mensagem(videos.getArquivo() + " - " + videos.getFormato(), TipoMensagem.LOG);
            canais.get(i).notificar(mensagem);
        }

    }
}
