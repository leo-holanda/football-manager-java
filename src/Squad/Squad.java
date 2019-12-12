package Squad;
import Player.*;
import Staff.*;

import java.util.HashMap;
import java.util.Random;

public class Squad {
    HashMap<Integer, Player> players = new HashMap<Integer, Player>();
    HashMap<Integer, Staff> staff = new HashMap<Integer, Staff>();

    public void addPlayer(Player player) {
        players.put(generateRandomNumber(), player);
    }

    public void deletePlayer(Integer id) {
        if (players.containsKey(id)) {
            players.remove(id);
        }
    }

    public void showPlayer(int id) {
        if (players.containsKey(id)) {
            players.get(id).showPlayer();
        }
    }

    public void showAllPlayers() {
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
