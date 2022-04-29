
//Check if question is already in database
//confirm creation of q and a

import java.util.Scanner;

public class addUpdateQuizUI {

    public static void main(String[] args) {

            //Ask user if they want to create a quiz
           //Add input validation later
            Scanner s = new Scanner(System.in);
            System.out.println("Create new quiz?\n y = yes\n n = no");
            String in = s.nextLine();
            String str = String.valueOf(in);
             

            switch (str) {
            case "y":
                //Request input from user for question
                Scanner s2 = new Scanner(System.in);
                System.out.print("Enter Question:  ");
                String question = s2.nextLine();
                

                //Ask user if question is typed correctly
            
                //Request input from user for answer to question
                Scanner s3 = new Scanner(System.in);
                System.out.print("Enter Answer: ");
                String answer = s3.nextLine();

                //Confirm creation and output inputs
                System.out.println("Q&A created!");
                System.out.println("Question :" + question );
                System.out.println("Answer :" + answer );

                //Add update message if case they want to edit or update later
                break;

            case "n":

                // Print statement corresponding case
                System.out.println("Ending program..." );
                break;

            default:

                // Print statement corresponding case
                System.out.println("Invalid input try again");
                //Reset input buffer so it doesnt end program and user can try again
           
    }
}
}
