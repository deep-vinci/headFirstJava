public class BottlesOfBear {
    public static void main(String[] args) {
        int numberOfBearBottles = 99;

        while (numberOfBearBottles != 0) {
            System.out.println(numberOfBearBottles + " Bear Bottle on the wall");
            System.out.println(numberOfBearBottles + " bottle pf bear");
            System.out.println("take one down");
            System.out.println("pass it around");

            --numberOfBearBottles;

            System.out.println(numberOfBearBottles + " Bear Bottle on the wall");
        }
    }
}
