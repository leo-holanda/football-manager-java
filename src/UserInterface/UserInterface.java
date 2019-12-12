package UserInterface;

import Player.*;
import Squad.*;
import Staff.*;
import Backroom.*;
import java.util.Scanner;

public class UserInterface {
    private Scanner reader;
    private Squad squad;
    private Backroom backroom;
    private int user_input;

    public UserInterface(Scanner reader, Squad squad, Backroom backroom){
        this.reader = reader;
        this.squad = squad;
        this.backroom = backroom;
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
        System.out.print(question + " ");
        int input = reader.nextInt();
        System.out.println();
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
        while(true){
            System.out.println("Menu de Staff");
            System.out.println("1 - Adicionar staff");
            System.out.println("2 - Remover staff");
            System.out.println("3 - Procurar staff");
            System.out.println("4 - Mostrar todo o staff");
            System.out.println("5 - Sair");

            user_input = readInput("O que deseja?");

            switch(user_input) {
                case 1:
                    Staff new_staff = new Staff("Chris Coleman", 21, 900, "Tecnico");
                    backroom.addStaff(new_staff);
                    break;
                case 2:
                    Integer remove_staff_id = reader.nextInt();
                    backroom.deleteStaff(remove_staff_id);
                    break;
                case 3:
                    Integer search_staff_id = reader.nextInt();
                    backroom.showStaff(search_staff_id);
                    break;
                case 4:
                    backroom.showAllStaff();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Opcao invalida!");
            }
        }
    }

    public void showReportsMenu(){
        // Mostrar opcoes de relatorio
    }
}
