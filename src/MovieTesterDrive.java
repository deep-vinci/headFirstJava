import java.util.Arrays;

class MovieTesterDrive {
    public static void main (String[] args) {
        Movie pixels = new Movie();

        pixels.title = "Pixels";
        pixels.genre = "fantasy";
        pixels.rating = 8;

        System.out.println(pixels);

        pixels.playIt();
        System.out.println(Arrays.toString(args));
    }
}