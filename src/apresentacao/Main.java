package apresentacao;

import dominio.Trilha;
import repositorio.TrilhaRepositorio;
import servico.TrilhaServico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        TrilhaRepositorio repositorio = new TrilhaRepositorio();
        TrilhaServico servico = new TrilhaServico(repositorio);
        Trilha trilhaResultado;
        int resultado = 0;

        Scanner scan = new Scanner(System.in);
       do{
       System.out.println("Escolha uma das opções abaixo:");
       System.out.println();
       System.out.println("[1] Cadastrar Trilha");
       System.out.println("[2] Listar trilhas Cadastradas");
       System.out.println("[3] Buscar trilha Por Nome");
       System.out.println("[4] Sair");
       resultado = scan.nextInt();
       scan.nextLine();



            if (resultado == 1) {
                System.out.println("Digite a duração:");
                int duracao = scan.nextInt();

                System.out.println("Digite a Distância:");
                double distancia = scan.nextDouble();
                scan.nextLine();

                System.out.println("Digite a Dificuldade:");
                String dificuldade = scan.nextLine();

                System.out.println("Digite a Localizção:");
                String localizacao = scan.nextLine();

                System.out.println("Digite o nome da Trilha:");
                String nome = scan.nextLine();

                Trilha trilha = new Trilha(nome, localizacao, distancia, dificuldade, duracao);
                servico.cadastrarTrilha(trilha);

            } else if (resultado == 2) {
                Trilha[] trilhasCadastradas = servico.listarTrilhas();

                for (Trilha trilha : trilhasCadastradas) {
                    if (trilha != null) {
                        System.out.println("Nome: " + trilha.getNomeTrilha());
                        System.out.println("Localização: " + trilha.getLocalizacao());
                        System.out.println("Distância: " + trilha.getDistancia());
                        System.out.println("Dificuladade: " + trilha.getDificuldade());
                        System.out.println("Duração: " + trilha.getDuracao());
                        System.out.println();

                    }
                }
            } else if (resultado == 3) {
                System.out.println("Digite o Nome da Trilha:");
                String nome = scan.nextLine();
                Trilha trilha = servico.buscarTrilhaPorNome(nome);

                if(trilha != null) {
                    System.out.println(trilha.getNomeTrilha());
                    System.out.println(trilha.getLocalizacao());
                    System.out.println(trilha.getDistancia());
                    System.out.println(trilha.getDificuldade());
                    System.out.println(trilha.getDuracao());
                }else{
                    System.out.println("Nenhuma trilha foi encontrada com esse nome.");
                }


            } else if(resultado < 1 || resultado > 4) {
                System.out.println("Opção Inválida!");
                continue;
            }

        }while(resultado != 4);
        System.out.println("Programa encerrado!");
        scan.close();
    }
}
