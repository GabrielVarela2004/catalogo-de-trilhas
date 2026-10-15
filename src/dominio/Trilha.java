package dominio;

public class Trilha {
    private String nomeTrilha;
    private String localizacao;
    private double distancia;
    private String dificuldade;
    private int duracao;

    public Trilha(String nomeTrilha, String localizacao, double distancia, String dificuldade, int duracao){
        this.nomeTrilha = nomeTrilha;
        this.localizacao = localizacao;
        this.distancia = distancia;
        this.dificuldade =dificuldade;
        this.duracao = duracao;

    }

    public String getNomeTrilha(){
        return this.nomeTrilha;
    }

    public String getLocalizacao(){
        return this.localizacao;
    }

    public double getDistancia(){
        return this.distancia;
    }

    public String getDificuldade(){
        return this.dificuldade;
    }

    public int getDuracao(){
        return this.duracao;
    }
}
