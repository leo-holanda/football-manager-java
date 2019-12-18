package com.leonardo.transfer;

import com.leonardo.person.Person;
import com.leonardo.player.Player;
import com.leonardo.staff.Staff;

import java.util.ArrayList;

public class Transfer {
    ArrayList<Person> transferList = new ArrayList<Person>();

    public void add(Person person){
        transferList.add(person);
    }

    public void showAll(){
        Person person;
        for (int i = 0; i < transferList.size(); i++){
            person = transferList.get(i);

            if(person instanceof Player){
                System.out.print("ID: " + i + " | ");
                ((Player) person).showPlayer();
            }
            else if(person instanceof Staff){
                System.out.print("ID: " + i + " | ");
                ((Staff) person).showStaff();
            }
            else{
                System.out.println("Erro! Tente novamente");
            }
        }
    }

    public void delete(int id){
        try {
            transferList.remove(id);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("ID invalido!");
        }
    }
}
