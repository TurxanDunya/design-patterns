package gangoffour.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

// Class used to get a player using HashMap. Returns an existing player if a player of given type exists.
// Else creates a new player and returns it.
public class PlayerFactory {
    private static final Map<String, Player> playerMap = new HashMap<>();

    // Method to get a player
    public static Player getPlayer(String playerSide) {
        Player player = null;

        // If an object for T or CT has already been created simply return its reference
        if (playerMap.containsKey(playerSide)) {
            return playerMap.get(playerSide);
        }

        // So, it doesn't exist, lets create a new one
        if (playerSide.equals(PlayerSide.TERRORIST.name())) {
            player = new Terrorist();
            System.out.println("Terrorist Created");
        } else if (playerSide.equals(PlayerSide.COUNTER_TERRORIST.name())) {
            player = new CounterTerrorist();
            System.out.println("Counter Terrorist Created");
        }

        playerMap.put(playerSide, player);
        return player;
    }
}