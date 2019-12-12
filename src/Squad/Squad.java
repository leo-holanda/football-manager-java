package Squad;
import Player.*;
import Staff.*;

import java.util.ArrayList;

public class Squad {
    ArrayList<Player> playersList = new ArrayList<Player>();
    ArrayList<Staff> staffList = new ArrayList<Staff>();

    public void addPlayer(Player player) {
        playersList.add(player);
    }

    public void deletePlayer(int id) {

    }

    public void showPlayer(Player player) {

    }

    public void showAllPlayers() {
        for (Player player : playersList) {
            player.showPlayer();
        }
    }
}
