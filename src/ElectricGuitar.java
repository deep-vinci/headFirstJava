class ElectricGuitar {

    String brand;
    int numOfPickups;
    boolean rockStarUsesIt;

    String getBrand() {
        return brand;
    }

    void setBrand(String brandSetter) {
        brand = brandSetter;
    }

    int getNumOfPickups() {
        return numOfPickups;
    }

    void setNumOfPickups(int numOfPickupsSetter) {
        numOfPickups = numOfPickupsSetter;
    }

    boolean getRockStarUsesIt () {
        return rockStarUsesIt;
    }

    void setRockStarUsesIt(boolean rockStarUsesItSetter) {
        rockStarUsesIt = rockStarUsesItSetter;
    }
}