import java.util.Scanner;

// Couper Corbett week 1 notes
public class Main {
    public static void main(String[] args) {

        int age = 17;
        double gpa = 3.8;
        boolean isRaining = false;
        System.out.println(age + "|" + gpa +"|" + isRaining);

        String city = "Columbus";
        int zip = 43123;
        double avgHigh = 0;


        double dailyHighs[] = {23, 15, 30, 12, 20};
        System.out.println(dailyHighs.length);

        for(int i = 0; i < dailyHighs.length; i++) {
            avgHigh += dailyHighs[i];
        }
        avgHigh /= dailyHighs.length;
        System.out.println("city: " + city);
        System.out.println("zip code: " + zip);
        System.out.println("average high temp: " + avgHigh);

    }
}