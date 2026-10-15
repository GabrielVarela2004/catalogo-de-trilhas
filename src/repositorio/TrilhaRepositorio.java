package repositorio;

import dominio.Trilha;

public class TrilhaRepositorio {
    private Trilha[] trilhas;

    public TrilhaRepositorio(){
        this.trilhas = new Trilha[5];
    }

    public boolean adicionar(Trilha trilha){
        for(int i=0; i < this.trilhas.length; i++){
            if(this.trilhas[i] == null){
                this.trilhas[i] = trilha;
                return true;
            }
        }
        return false;
    }

    public boolean consultar(String nome){
        for(int i=0; i <this.trilhas.length; i++){
            Trilha trilhaCadastrada = this.trilhas[i];

            if(trilhaCadastrada != null && trilhaCadastrada.getNomeTrilha().equalsIgnoreCase(nome)){
                return true;
            }
        }
        return false;
    }

    public int contar(){
        int cont = 0;
        for(int i=0; i<this.trilhas.length; i++){
            if(this.trilhas[i] != null){
                cont = cont + 1;
            }
        }
        return cont;
    }

    public Trilha[] getTrilhas(){
        return this.trilhas;
    }

    public Trilha buscarPorNome(String nome){
        if(nome == null || nome.trim().isEmpty()){
            return null;
        }
        String nomeBusca = nome.trim();
        for(int i=0; i<this.trilhas.length;i++){
            Trilha t = this.trilhas[i];
            if(t == null) continue;
            String nomeCadastrado = t.getNomeTrilha();
            if(nomeCadastrado != null && nomeCadastrado.equalsIgnoreCase(nomeBusca)){
                return t;
            }
        }

        return null;
    }

}
