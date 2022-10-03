package gangoffour.structural.flyweight;

import java.util.Random;

public class Client {

    // Weapons (used by getRandWeapon(). Also, we could create Enum class)
    private static final String[] weapons = {"AK-47", "Maverick", "Gut Knife", "Desert Eagle"};

    public static void main(String[] args) {

        // Assume that we have a total of 10 players in the game.
        for (int i = 0; i < 10; i++) {
            // getPlayer() is called simply using the class name since the method is a static one
            Player player = PlayerFactory.getPlayer(getRandomPlayerType());

            // Assign a weapon chosen randomly from the weapon array
            player.assignWeapon(getRandomWeapon());

            // Send this player on a mission
            player.mission();
        }

    }

    // Utility methods to get a random player type and weapon
    public static String getRandomPlayerType() {
        Random random = new Random();

        // Random between Terrorist and Counter-Terrorist
        int randInt = random.nextInt(PlayerSide.values().length);

        // Return the player stored at index 'randInt'
        return PlayerSide.of(randInt).toString();
    }

    public static String getRandomWeapon() {
        Random random = new Random();
        int randInt = random.nextInt(weapons.length);

        // Return the weapon stored at index 'randInt'
        return weapons[randInt];
    }

}