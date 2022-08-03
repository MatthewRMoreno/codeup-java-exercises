import java.util.Scanner;

public class Bob {

    public static <function> void main(String[] args) {
        //create a scanner
        Scanner scanner = new Scanner(System.in);
        //store responses
        String quesResponse = "Sure";
        String exclamResponse = "Whoa, chill out!";
        String noResponse = "Fine. Be that way!";
        String otherResponse = "Whatever";
        boolean confirmation2;
        //Prompt user to type something for Bob to respond to
        do {
            System.out.println("Type something to speak with Bob :");
            String userInput = scanner.nextLine();
            //Produce output of stored responses based on users response
            if (userInput.endsWith("?")) {
                System.out.println(quesResponse);
            } else if (userInput.endsWith("!")) {
                System.out.println(exclamResponse);
            } else if (userInput.isEmpty()) {
                System.out.println(noResponse);
            } else System.out.println(otherResponse);

            System.out.print("Would you like to continue speaking with Bob? [y/n] ");
            String userResponse = scanner.nextLine();
            confirmation2 = userResponse.equalsIgnoreCase("y");
        }while (confirmation2);

    }
}
