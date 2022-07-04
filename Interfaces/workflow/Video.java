public class Video {
    public String arquivo;
    public FormatoVideo formato;

    public Video(String arquivo, FormatoVideo formato) {
        this.arquivo = arquivo;
        this.formato = formato;
    }

    public String getArquivo() {
        return arquivo;
    }

    public FormatoVideo getFormato() {
        return formato;
    }

}
