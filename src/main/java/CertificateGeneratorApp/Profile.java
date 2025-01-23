//SID2309752
//Team WAG

package CertificateGeneratorApp;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

import static java.lang.Integer.parseInt;
//In the presentation we had planned on having a my orders page, as the Certificates are downloaded on the device as PDFs the users do not need to see their previous orders
// however if the project has a GUI then that would be an option as the user can see the certificates they previously made which would be more useful.

public class Profile {

    public static String email;

    public static void setEmail(String emailValue){
        email = emailValue;
    }


    public int accessingProfile() {
         boolean choices = false;
        do {
            //creating an array lost that has all the submenus of the profile
            ArrayList<String> subMenu = new ArrayList<>();
            subMenu.add("a. View Profile");
            subMenu.add("b. Change Password");
            subMenu.add("c. Log Out");
            //looping through the array list and prints them out
            for (int i = 0; i < subMenu.size(); i++) {
                System.out.println(subMenu.get(i));
            }
            boolean correctOption = false;
            //variable for the user's input
            String inputOpt;
            do {
                //lets the user enter an input
                Scanner input = new Scanner(System.in);
                System.out.print("Please select an option:");
                //storing the user input into the variable inputOpt
                inputOpt = input.nextLine();
                // an array that as all the options that user can enter
                String[] options = {"a", "b", "c"};
                for (int i = 0; i < options.length; i++) {
                    if (inputOpt.equals(options[i])) {
                        correctOption = true;
                    }
                }
            } while (!correctOption);

// the switch will tke the user input and check which case it is and then outputs the right information
            String userInput;
            switch (inputOpt) {
                //profile option
                case "a":
                    System.out.println("This is your Profile\n");
                    System.out.println("your email: " + email);
                    //choices = true;
                    break;
                    //change password
                case "b":
                    Scanner scan = new Scanner(System.in);
                    System.out.print("If you want to change your password press 'y'");
                    userInput = scan.nextLine().toLowerCase();
                    checkChangePassword(userInput);
                   // choices = true;
                    break;

                 //log out
                case "c":
                    Scanner logout = new Scanner(System.in);
                    System.out.print("Press 'x' to log out: ");
                    String user = logout.nextLine().toLowerCase();

                    if (Objects.equals(user, "x")) {
                        choices = true;
                        System.out.println("You've been logged out...\n");
                    }
                    break;
            }
        }while(!choices);

        return 0;
    }

    //checks if the user entered y for yes if when they were asked to change their password
    public void checkChangePassword (String userInput){
        if(userInput.equals('y')){
            ForgotPassword.restore();
        }else{
            System.out.println("Please enter the letter 'y' to change password");
        }

    }
}