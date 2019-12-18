package com.leonardo.squad;

import com.leonardo.person.Person;
import com.leonardo.player.*;
import java.util.HashMap;
import java.util.Random;
import com.leonardo.action.*;

public class Squad implements Action<Player>{
    HashMap<Integer, Player> players = new HashMap<Integer, Player>();

    @Override
    public void add(Player player) {
        players.put(generateRandomNumber(), player);
    }

    @Override
    public void delete(int id) {
        if (players.containsKey(id)) {
            players.remove(id);
            System.out.println("O jogador foi removido com sucesso!");
        }
        else {
            System.out.println("O jogador nao foi encontrado!");
        }
    }

    @Override
    public boolean show(int id) {
        if (players.containsKey(id)) {
            players.get(id).showPlayer();
            return true;
        }
        else {
            System.out.println("O jogador nao foi encontrado!");
            return false;
        }
    }

    @Override
    public void showAll() {
        System.out.println();
        for (Integer key : players.keySet()) {
            System.out.print("ID : " + key + " | ");
            players.get(key).showPlayer();
        }
    }

    @Override
    public Player get(int id) { return players.get(id); }

    @Override
    public Person searchByName(String name) {
        for (Person person : players.values()) {
            if (person.getName().contains(name)){
                return person;
            }
        }

        return null;
    }

    private int generateRandomNumber() {
        Random random = new Random();
        int random_value = random.nextInt(999);
        while (players.containsKey(random_value)) {
            random_value = random.nextInt(999);
        }
        return random_value;
    }
}
