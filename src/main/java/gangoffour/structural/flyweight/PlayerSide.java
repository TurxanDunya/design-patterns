package gangoffour.structural.flyweight;

import java.util.stream.Stream;

public enum PlayerSide {

    TERRORIST(1),
    COUNTER_TERRORIST(2);

    private final int side;

    PlayerSide(int side) {
        this.side = side;
    }

    public int value() {
        return this.side;
    }

    public static PlayerSide of(int id) {
        return Stream.of(PlayerSide.values())
                .filter(side -> (side.value() == id))
                .findFirst()
                .orElse(PlayerSide.COUNTER_TERRORIST);
    }
}