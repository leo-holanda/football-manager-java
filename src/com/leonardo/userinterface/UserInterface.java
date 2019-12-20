package com.leonardo.userinterface;

import com.leonardo.person.Person;
import com.leonardo.player.*;
import com.leonardo.squad.*;
import com.leonardo.staff.*;
import com.leonardo.backroom.*;
import com.leonardo.helper.*;
import com.leonardo.transfer.Transfer;

public class UserInterface {
    private Squad squad;
    private Backroom backroom;
    private Transfer transfer;

    public UserInterface(Squad squad, Backroom backroom, Transfer transfer){
        this.squad = squad;
        this.backroom = backroom;
        this.transfer = transfer;
    }

    public void start() {
        System.out.println("Bem-vindo ao Football Manager!");

        while(true){
            System.out.println("\n" + "Menu Principal");
            System.out.println("1 - Menu do elenco");
            System.out.println("2 - Menu de staff");
            System.out.println("3 - Busca Rapida");
            System.out.println("4 - Menu de Transferencias");
            System.out.println("5 - Sair");

            switch(Helper.readIntInput("O que deseja?")) {
                case 1:
                    showSquadMenu();
                    break;
                case 2:
                    showBackroomMenu();
                    break;
                case 3:
                    showQuickSearch();
                    break;
                case 4:
                    showTransfersMenu();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Opcao invalida!");
            }
        }
    }

    public void showSquadMenu(){
        while(true){
            System.out.println("\n" + "Menu do Elenco");
            System.out.println("1 - Adicionar jogador");
            System.out.println("2 - Remover jogador");
            System.out.println("3 - Procurar jogador");
            System.out.println("4 - Mostrar todos os jogadores");
            System.out.println("5 - Sair");

            switch(Helper.readIntInput("O que deseja?")) {
                case 1:
                    Player new_player = Helper.readPlayerInput();
                    squad.add(new_player);
                    break;
                case 2:
                    int remove_player_id = Helper.readIntInput("Digite o ID do jogador que deseja remover: ");
                    squad.delete(remove_player_id);
                    break;
                case 3:
                    int search_player_id = Helper.readIntInput("Digite o ID do jogador que deseja procurar: ");
                    if(squad.show(search_player_id)) { showPlayerMenu(search_player_id);}
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

    public void showBackroomMenu(){
        while(true){
            System.out.println("\n" + "Menu de Comissao Tecnica");
            System.out.println("1 - Adicionar staff");
            System.out.println("2 - Remover staff");
            System.out.println("3 - Procurar staff");
            System.out.println("4 - Mostrar todo o staff");
            System.out.println("5 - Sair");

            switch(Helper.readIntInput("O que deseja?")) {
                case 1:
                    Staff new_staff = Helper.readStaffInput();
                    backroom.add(new_staff);
                    break;
                case 2:
                    int remove_staff_id = Helper.readIntInput("Digite o ID do staff que deseja remover: ");
                    backroom.delete(remove_staff_id);
                    break;
                case 3:
                    int search_staff_id = Helper.readIntInput("Digite o ID do staff que deseja procurar: ");
                    if(backroom.show(search_staff_id)) { showStaffMenu(search_staff_id);}
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

    public void showPlayerMenu(int id) {
        while(true){
            System.out.println("\n" + "Menu de Jogador");
            System.out.println("1 - Editar nome");
            System.out.println("2 - Editar idade");
            System.out.println("3 - Editar posicao");
            System.out.println("4 - Editar numero de gols");
            System.out.println("5 - Editar numero de assistencias");
            System.out.println("6 - Editar duracao de contrato");
            System.out.println("7 - Editar tipo de contrato");
            System.out.println("8 - Editar salario");
            System.out.println("9 - Sair");

            switch(Helper.readIntInput("O que deseja?")) {
                case 1:
                    squad.get(id).setName(Helper.readTextInput("Digite o nome correto do jogador: "));
                    break;
                case 2:
                    squad.get(id).setAge(Helper.readIntInput("Digite a idade correta do jogador: "));
                    break;
                case 3:
                    squad.get(id).setPosition(Helper.readTextInput("Digite a nova posicao do jogador: "));
                    break;
                case 4:
                    squad.get(id).setGoals(Helper.readIntInput("Digite a quantidade de gols do jogador: "));
                    break;
                case 5:
                    squad.get(id).setAssists(Helper.readIntInput("Digite a quantidade de assistencias do jogador: "));
                    break;
                case 6:
                    squad.get(id).getContract().setLength(Helper.readIntInput("Digite a nova duracao do contrato do jogador: "));
                    break;
                case 7:
                    squad.get(id).getContract().setType(Helper.readTextInput("Digite o novo tipo de contrato do jogador: "));
                    break;
                case 8:
                    squad.get(id).getContract().setWage(Helper.readDoubleInput("Digite o novo salario do jogador: "));
                    break;
                case 9:
                    return;
                default:
                    System.out.println("Opcao invalida!");
            }
        }
    }

    public void showStaffMenu(int id) {
        while(true){
            System.out.println("\n" + "Menu de com.leonardo.staff");
            System.out.println("1 - Editar nome");
            System.out.println("2 - Editar idade");
            System.out.println("3 - Editar funcao");
            System.out.println("4 - Editar qualificacao");
            System.out.println("5 - Editar duracao de contrato");
            System.out.println("6 - Editar tipo de contrato");
            System.out.println("7 - Editar salario");
            System.out.println("8 - Sair");

            switch(Helper.readIntInput("O que deseja?")) {
                case 1:
                    backroom.get(id).setName(Helper.readTextInput("Digite o nome correto do staff: "));
                    break;
                case 2:
                    backroom.get(id).setAge(Helper.readIntInput("Digite a idade correta do staff: "));
                    break;
                case 3:
                    backroom.get(id).setRole(Helper.readTextInput("Digite a nova funcao do staff: "));
                    break;
                case 4:
                    backroom.get(id).setQualification(Helper.readTextInput("Digite a nova qualificacao do staff: "));
                    break;
                case 5:
                    backroom.get(id).getContract().setLength(Helper.readIntInput("Digite a nova duracao do contrato do staff: "));
                    break;
                case 6:
                    backroom.get(id).getContract().setType(Helper.readTextInput("Digite o novo tipo de contrato do staff: "));
                    break;
                case 7:
                    backroom.get(id).getContract().setWage(Helper.readDoubleInput("Digite o novo salario do staff: "));
                    break;
                case 8:
                    return;
                default:
                    System.out.println("Opcao invalida!");
            }
        }
    }

    public void showQuickSearch(){
        String name = Helper.readTextInput("Digite o nome da pessoa que deseja procurar: ");

        Person person = squad.searchByName(name);
        if(person instanceof Player) {
            ((Player) person).showPlayer();
            return;
        }

        person = backroom.searchByName(name);
        if(person instanceof Staff){
            ((Staff) person).showStaff();
            return;
        }

        System.out.println("O nome nao foi encontrado!");
    }

    public void showTransfersMenu(){
        while(true){
            System.out.println("\n" + "Menu de Transferencia");
            System.out.println("1 - Adicionar alvo de transferencia");
            System.out.println("2 - Remover alvo de transferencia");
            System.out.println("3 - Mostrar todos os alvos");
            System.out.println("4 - Sair");

            switch(Helper.readIntInput("O que deseja?")) {
                case 1:
                    String choice = Helper.readChoice();
                    if(choice.equalsIgnoreCase("J")){
                        Player new_player = Helper.readPlayerInput();
                        transfer.add(new_player);
                    }
                    else if(choice.equalsIgnoreCase("S")){
                        Staff new_staff = Helper.readStaffInput();
                        transfer.add(new_staff);
                    }
                    else{
                        System.out.println("Entrada invalida!");
                    }
                    break;
                case 2:
                    transfer.delete(Helper.readIntInput("Digite a ID do alvo de transferencia: "));
                    break;
                case 3:
                    transfer.showAll();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Opcao invalida!");
            }
        }
    }
}