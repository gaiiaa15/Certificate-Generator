//SID2309752
//Team WAG

package CertificateGeneratorApp;

import java.util.ArrayList;
//SID2309752
//Team WAG

import java.util.Scanner;

public class LoginSignupMenu {
    public void firstMenu(){
        //created an array list
        ArrayList<String> content = new ArrayList<String>();
        // adds the text into the list
        content.add("a. Log in");
        content.add("b. Sign up");
//loops through the array list and outputs the data
        for(int i = 0; i < content.size(); i++){
            System.out.println(content.get(i));
        }
//i have created a do while that will lop through and check if the user enters the right input
        String selection;
        boolean choice = false;
        do {
            Scanner user = new Scanner(System.in);
            System.out.print("Choose (a) or (b): ");
            selection = user.nextLine().trim();
            String options[] ={"a","b"};
            for(int i = 0; i < options.length; i++){
                //if the entered selection by the user eists in the array created then the boolean will turn to true and this will allow the do while loop to loop through
                if(selection.equals(options[i])){
                    choice = true;
                }
            }

        }while(!choice);



        switch(selection){
            case "a":
                //when the user types in a it will take them to the log in page
                LogIn log = new LogIn();
                String email = log.log();

                Profile.setEmail(email);
                break;
            case "b":
                // if the user enters b it will take the sign up page
                NewUser signup = new NewUser();
                String userEmail = signup.signup();
                Profile.setEmail(userEmail);
        }

    }



}
