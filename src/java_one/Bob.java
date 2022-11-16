package java_one;

import java.util.Scanner;

public class Bob {

    public static <function> void main(String[] args) {
        //create a scanner
        Scanner scanner = new Scanner(System.in);
        //store responses
        //Hard coded responses
        String quesResponse = "Sure";
        // another hard coded response to be added into the function
        String exclamResponse = "Whoa, chill out!";
        String noResponse = "Fine. Be that way!";
        String otherResponse = "Whatever";
        boolean confirmation;
        //Prompt user to type something for java_one.Bob to respond to
        do {
            System.out.println("Type something to speak with java_one.Bob :");
            String userInput = scanner.nextLine();
            //Produce output of stored responses based on users response
            if (userInput.endsWith("?")) {
                //new commit for the githubsss
                System.out.println(quesResponse);
            } else if (userInput.endsWith("!")) {
                System.out.println(exclamResponse);
            } else if (userInput.isEmpty()) {
                System.out.println(noResponse);
            } else System.out.println(otherResponse);

            //time to push
            System.out.print("Would you like to continue speaking with java_one.Bob? [y/n] ");
            String userResponse = scanner.nextLine();
            confirmation = userResponse.equalsIgnoreCase("y");
        }while (confirmation);

    }
}
