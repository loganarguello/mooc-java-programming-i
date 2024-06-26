public class Multiplier {
    private int number;

    public Multiplier(int number) {
        this.number = number;
    }

    public int multiply(int number) {
        return this.number * number;
    }

}

// Example of the class in use.

// Multiplier multiplyByThree = new Multiplier(3);

// System.out.println("multiplyByThree.multiply(2): " +
// multiplyByThree.multiply(2));

// Multiplier multiplyByFour = new Multiplier(4);

// System.out.println("multiplyByFour.multiply(2): " +
// multiplyByFour.multiply(2));
// System.out.println("multiplyByThree.multiply(1): " +
// multiplyByThree.multiply(1));
// System.out.println("multiplyByFour.multiply(1): " +
// multiplyByFour.multiply(1));