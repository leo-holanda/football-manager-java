package Squad;

import Player.*;
import java.util.HashMap;
import java.util.Random;
import Action.*;

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
    public void show(int id) {
        if (players.containsKey(id)) {
            players.get(id).showPlayer();
        }
        else {
            System.out.println("O jogador nao foi encontrado!");
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

    public Player get(int id) {
        return players.get(id);
    }

    private Integer generateRandomNumber() {
        Random random = new Random();
        Integer random_value = random.nextInt(999);
        while (players.containsKey(random_value)) {
            random_value = random.nextInt(999);
        }
        return random_value;
    }
}
