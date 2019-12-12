package UserInterface;
import Squad.*;
import Player.*;
import java.util.Scanner;

public class UserInterface {
    private Scanner reader;
    private Squad squad;
    private int user_input;

    public UserInterface(Scanner reader, Squad squad){
        this.reader = reader;
        this.squad = squad;
    }

    public void start() {
        System.out.println("Bem-vindo ao Football Manager!");

        while(true){
            System.out.println("Menu Principal");
            System.out.println("1 - Menu de jogadores");
            System.out.println("2 - Menu de staff");
            System.out.println("3 - Relatorios");
            System.out.println("4 - Sair");

            user_input = readInput("O que deseja?");

            switch(user_input) {
                case 1:
                    showPlayersMenu();
                    break;
                case 2:
                    showStaffMenu();
                    break;
                case 3:
                    showReportsMenu();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Opcao invalida!");
            }
        }
    }

    public int readInput(String question) {
        System.out.print(question);
        int input = reader.nextInt();
        return input;
    }

    public void showPlayersMenu(){
        while(true){
            System.out.println("Menu de Jogadores");
            System.out.println("1 - Adicionar jogador");
            System.out.println("2 - Remover jogador");
            System.out.println("3 - Procurar jogador");
            System.out.println("4 - Mostrar todos os jogadores");
            System.out.println("5 - Sair");

            user_input = readInput("O que deseja?");

            switch(user_input) {
                case 1:
                    Player new_player = new Player("Leonardo", 21, 900, "Atacante");
                    squad.addPlayer(new_player);
                    break;
                case 2:
                    Integer remove_player_id = reader.nextInt();
                    squad.deletePlayer(remove_player_id);
                    break;
                case 3:
                    Integer search_player_id = reader.nextInt();
                    squad.showPlayer(search_player_id);
                    break;
                case 4:
                    squad.showAllPlayers();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Opcao invalida!");
            }
        }
    }

    public void showStaffMenu(){
        // showAllStaff();
    }

    public void showReportsMenu(){
        // Mostrar opcoes de relatorio
    }
}
