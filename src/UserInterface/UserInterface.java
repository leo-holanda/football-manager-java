package UserInterface;

import Contract.Contract;
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
                    Contract new_contract = new Contract(1, "integral", 900);
                    Player new_player = new Player("Leonardo", 21, new_contract, "Atacante");
                    squad.add(new_player);
                    break;
                case 2:
                    int remove_player_id = Helper.readInput("Digite o ID do jogador que deseja remover: ");
                    squad.delete(remove_player_id);
                    break;
                case 3:
                    int search_player_id = Helper.readInput("Digite o ID do jogador que deseja procurar: ");
                    squad.show(search_player_id);
                    break;
                case 4:
                    squad.showAll();
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
                    Contract new_contract = new Contract(1, "integral", 900);
                    Staff new_staff = new Staff("Chris Coleman", 21, new_contract, "Tecnico", "Continental Pro");
                    backroom.add(new_staff);
                    break;
                case 2:
                    int remove_staff_id = Helper.readInput("Digite o ID do staff que deseja remover: ");
                    backroom.delete(remove_staff_id);
                    break;
                case 3:
                    int search_staff_id = Helper.readInput("Digite o ID do staff que deseja procurar: ");
                    backroom.show(search_staff_id);
                    break;
                case 4:
                    backroom.showAll();
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
