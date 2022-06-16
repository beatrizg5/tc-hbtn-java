public class PersonagemGame {

    int quantidadeDeDano;

    int quantidadeDeCura;

    private int saudeAtual;
    private String nome;

    public PersonagemGame(int saudeAtual, String nome) {
        this.saudeAtual = saudeAtual;
        this.nome = nome;
    }

    public PersonagemGame() {
    }

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public PersonagemGame(int quantidadeDeDano, int quantidadeDeCura) {
        this.quantidadeDeDano = quantidadeDeDano;
        this.quantidadeDeCura = quantidadeDeCura;
    }

    public PersonagemGame(int quantidadeDeDano) {
        this.quantidadeDeDano = quantidadeDeDano;
    }

    public int getQuantidadeDeDano() {
        return quantidadeDeDano;
    }

    public void setQuantidadeDeDano(int quantidadeDeDano) {
        this.quantidadeDeDano = quantidadeDeDano;
    }

    public int getQuantidadeDeCura() {
        return quantidadeDeCura;
    }

    public void setQuantidadeDeCura(int quantidadeDeCura) {
        this.quantidadeDeCura = quantidadeDeCura;
    }

    public void tomarDano(int quantidadeDeDano) {
        int dano = getSaudeAtual() - quantidadeDeDano;
        if( dano < 0){
            this.saudeAtual = 0;
        }else{
            this.saudeAtual = dano;
        }

    }

    public void receberCura(int quantidadeDeCura){
        int cura = getSaudeAtual() + quantidadeDeCura;
        if(cura > 100){
            this.saudeAtual = 100;
        }else{
            this.saudeAtual = cura;
        }
    }

}