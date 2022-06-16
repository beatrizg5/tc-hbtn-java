public class PersonagemGame {
    private int saudeAtual;
    private String nome;
    private String status;


    public PersonagemGame(int saudeAtual, String nome) {
        this.saudeAtual = saudeAtual;
        this.nome = nome;
        setSaudeAtual(saudeAtual);
    }

    public String getStatus() {

        if( getSaudeAtual() > 0){
            status = "vivo";
        }else{
            status = "morto";
        }
        return status;
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
        if(nome != null && !nome.isEmpty()){
            this.nome = nome;
        }
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