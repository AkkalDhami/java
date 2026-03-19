public class Demo {
    public static void main(String[] args) {

        PaymentStatus s = PaymentStatus.SUCCESS;
        System.out.println(s.name());
        System.out.println(s);

        Direction d = Direction.SOUTH;
        System.out.println(d.getDegree());
        System.out.println(d.toString());
        d.move();

        Direction ds[] = Direction.values();
        for (Direction d1 : ds) {
            System.out.println("Direction: " + d1.name() + " " + d1.getDegree() + " " + d1.ordinal());
        }

        // String s1 = "success";//! ERROR
        String s1 = "SUCCESS";
        PaymentStatus ps = PaymentStatus.valueOf(s1);
        System.out.println(ps);
    }
}

// ? Enum: predefined set of constants
// ? values(): Returns an array of enum constants
// ? valueOf(): Convert a string to an enum constant
// ? name(): Returns the name of the enum constant
// ? ordinal(): Returns the index of the enum constant

//* cannot extends an enum but implements

enum PaymentStatus {
    SUCCESS,
    FAILED,
    PENDING
}

enum Direction {
    NORTH(0) {
        @Override
        public void move() {
            System.out.println("Moving North");
        }
    },
    SOUTH(180) {
        @Override
        public void move() {
            System.out.println("Moving South");
        }
    },
    EAST(90) {
        @Override
        public void move() {
            System.out.println("Moving East");
        }
    },
    WEST(270) {
        @Override
        public void move() {
            System.out.println("Moving West");
        }
    };

    public int degree;

    Direction(int degree) {
        this.degree = degree;
    }

    public int getDegree() {
        return this.degree;
    }

    public abstract void move();

    @Override
    public String toString() {
        return "Direction{" +
                "degree=" + degree +
                '}';
    }
}