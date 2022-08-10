package java_two;

import java.util.Random;

public class ServerNameGenerator {
    public static void main(String[] args) {
        String[] noun = {"Actor", "Gold", "Painting", "Tiger", "Grass", "Parrot", "Afternoon", "Greece", "Pencil", "Airport"};

        String[] adjective = {"Rambunctious", "Aggressive", "Bewildered", "Bright", "Giddy", "Dangerous", "Disturbed", "Fierce", "Grumpy", "Mysterious"};

        System.out.println("Here is your server name: ");
        System.out.println(randomElement(adjective) + "-" + randomElement(noun));
    }

    public static String randomElement(String[] array) {
        Random random = new Random();
        return array[random.nextInt(array.length)];
    }
}
