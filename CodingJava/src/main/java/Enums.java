/**
 * Created by Bilna on 04-07-2017.
 */
public class Enums {
    //1. enums can have methods, constructors and static fields inside it
    enum Direction {
        LEFT, TOP, NORTH, RIGHT, BOTTOM, SOUTH;

        public Direction getOpposit() {
            return values()[(ordinal() + 3) % values().length];
        }
    }

    public static void main(String[] vars) {
        System.out.println(Direction.LEFT.getOpposit());
    }
}
