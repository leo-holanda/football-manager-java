package Squad;

import Player.*;
import java.util.HashMap;
import java.util.Random;

public class Squad {
    HashMap<Integer, Player> players = new HashMap<Integer, Player>();

    public void addPlayer(Player player) {
        players.put(generateRandomNumber(), player);
    }

    public void deletePlayer(Integer id) {
        if (players.containsKey(id)) {
            players.remove(id);
            System.out.println("O jogador foi removido com sucesso!");
        }
        else {
            System.out.println("O jogador nao foi encontrado!");
        }
    }

    public void showPlayer(int id) {
        if (players.containsKey(id)) {
            players.get(id).showPlayer();
        }
        else {
            System.out.println("O jogador nao foi encontrado!");
        }
    }

    public void showAllPlayers() {
        System.out.println();
        for (Integer key : players.keySet()) {
            System.out.print("ID : " + key + " | ");
            players.get(key).showPlayer();
        }
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
