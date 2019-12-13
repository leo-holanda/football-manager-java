package UserInterface;

import Player.*;
import Squad.*;
import Staff.*;
import Backroom.*;
import Helper.*;

public class UserInterface {
    private Squad squad;
    private Backroom backroom;

    public UserInterface(Squad squad, Backroom backroom){
        this.squad = squad;
        this.backroom = backroom;
    }

    public void start() {
        System.out.println("Bem-vindo ao Football Manager!");

        while(true){
            System.out.println("\n" + "Menu Principal");
            System.out.println("1 - Menu de jogadores");
            System.out.println("2 - Menu de staff");
            System.out.println("3 - Relatorios");
            System.out.println("4 - Sair");

            switch(Helper.readInput("O que deseja?")) {
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

    public void showPlayersMenu(){
        while(true){
            System.out.println("\n" + "Menu de Jogadores");
            System.out.println("1 - Adicionar jogador");
            System.out.println("2 - Remover jogador");
            System.out.println("3 - Procurar jogador");
            System.out.println("4 - Mostrar todos os jogadores");
            System.out.println("5 - Sair");

            switch(Helper.readInput("O que deseja?")) {
                case 1:
                    Player new_player = new Player("Leonardo", 21, 900, "Atacante");
                    squad.addPlayer(new_player);
                    break;
                case 2:
                    int remove_player_id = Helper.readInput("Digite o ID do jogador que deseja remover: ");
                    squad.deletePlayer(remove_player_id);
                    break;
                case 3:
                    int search_player_id = Helper.readInput("Digite o ID do jogador que deseja procurar: ");
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
            System.out.println("\n" + "Menu de Staff");
            System.out.println("1 - Adicionar staff");
            System.out.println("2 - Remover staff");
            System.out.println("3 - Procurar staff");
            System.out.println("4 - Mostrar todo o staff");
            System.out.println("5 - Sair");

            switch(Helper.readInput("O que deseja?")) {
                case 1:
                    Staff new_staff = new Staff("Chris Coleman", 21, 900, "Tecnico");
                    backroom.addStaff(new_staff);
                    break;
                case 2:
                    int remove_staff_id = Helper.readInput("Digite o ID do staff que deseja remover: ");
                    backroom.deleteStaff(remove_staff_id);
                    break;
                case 3:
                    int search_staff_id = Helper.readInput("Digite o ID do staff que deseja procurar: ");
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
