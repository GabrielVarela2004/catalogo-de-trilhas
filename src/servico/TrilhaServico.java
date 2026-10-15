package servico;

import dominio.Trilha;
import repositorio.TrilhaRepositorio;

public class TrilhaServico {
    private TrilhaRepositorio trilhaRepositorio;

    public TrilhaServico(TrilhaRepositorio trilhaRepositorio){
        this.trilhaRepositorio = trilhaRepositorio;
    }

    public boolean cadastrarTrilha(Trilha trilha){
        String nome = trilha.getNomeTrilha();
        String localizacao = trilha.getLocalizacao();
        double distancia = trilha.getDistancia();
        String dificuldade = trilha.getDificuldade();
        int duracao = trilha.getDuracao();

        if(!validarDuracao(duracao)){
            return false;
        }

        if(!validarDificuldade(dificuldade)){
            return false;
        }

        if(!validarDistancia(distancia)){
            return false;
        }

       if(!validarLocalizacao(localizacao)){
           return false;
       }

      if(!validarNome(nome)){
          return false;
      }

        if(trilhaRepositorio.consultar(nome)){
            return false;
        }
        return trilhaRepositorio.adicionar(trilha);
    }

    public boolean validarLocalizacao(String localizacao){

        if(localizacao == null){
            return false;
        }

        if(localizacao.trim().isEmpty()){
            return false;
        }
        return true;
    }

    public boolean validarDistancia(double distancia){

        if(distancia == 0 || distancia < 0){
            return false;
        }
        return true;
    }

    public boolean validarDificuldade(String dificuldade){

        if(dificuldade == null || dificuldade.trim().isEmpty()){
            return false;
        }

        if(dificuldade.equalsIgnoreCase("Fácil")){
            return true;
        }
        if(dificuldade.equalsIgnoreCase("Mediano")){
            return true;
        }
        if(dificuldade.equalsIgnoreCase("Difícil")){
            return true;
        }
        return false;
    }

    public boolean validarDuracao(int duracao){

        if(duracao == 0 || duracao < 0){
            return false;
        }
        return true;
    }

    public boolean validarNome(String nome){
        if(nome == null || nome.trim().isEmpty()){
            return false;
        }
        return true;
    }

    public Trilha[] listarTrilhas(){
        return trilhaRepositorio.getTrilhas();
    }

    public Trilha buscarTrilhaPorNome(String nome){
        if(!validarNome(nome)){
            return null;
        }
        return trilhaRepositorio.buscarPorNome(nome);


    }
}
