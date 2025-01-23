//SID2309752
//Team WAG

package CertificateGeneratorApp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class ExistingUser {
    String existing() {
        Scanner entry = new Scanner(System.in);
        Scanner entering = new Scanner(System.in);
        //stores the user's email
        String username;
        //stored the user's password
        String pswd;




        boolean correctpswd = false;
        boolean correctusername = false;

        //calling the method reading files.
        ArrayList<HashMap<String, String>> users = UserInputDatabase.readingFile();

        do {
            System.out.println("-----------------Log In---------------\n");
            //prompts the user to enter their email and then stores it in the username variable
            System.out.println("Enter Email here: ");
            //stored the user input in the username variable
            username = entry.nextLine();

//checks if the username entered by the user is valid and exists in the file users.txt to identify if the user exists already or not
            if (NewUser.isValidEmail(username) && userExistingEmail(username)) {
                //turn correct username to rue for the do while loop to stop
                correctusername = true;
            }
//the do while will keep going until correctusername is true.
        }while(!correctusername);

        // added a counter because the user only has 3 attempts to enter their password if incorrect
          int passCounter = 0;
          do {
            //prompts the user to enter their password and stores it in the pswd variable
            System.out.println("Enter Password here: ");
            pswd = entering.nextLine();
            // if the password doesn't violate the requirements and is existing in the users.txt
            if (NewUser.isValidEmail(username) && userExistingPswd(users, pswd, username)) {
                // the boolean is switched to true
                correctpswd = true;
                System.out.println("You have logged in !\n");
            }else {
                System.out.println("Incorrect Password!");
                // if the password counter is 2 meaning that user inputted their password wrong 2 times it will ask them if they want to reset their password
                if(passCounter == 2){
                    Scanner response = new Scanner(System.in);
                    System.out.println("Would you like to reset you password (yes/no) ?");
                    String user = response.nextLine().toLowerCase();
                    if(user.equals("yes")){
                        ForgotPassword.restore();
                    }
                }
                passCounter++;

            }
            //the do while loop will stop when correctpswd is true
        }while(!correctpswd);

         return username;

    }
    //this will loop through the array list hash map and check if the email entered exists
    public static boolean userExistingEmail(String userName){
        ArrayList<HashMap<String, String>> users = UserInputDatabase.readingFile();
        boolean userExists = false;

        //this will check if the username entered exists in the user DB
        for(int i = 0; i < users.size(); i++) {
            if(userName.equals(users.get(i).get("email")) && !userExists){
                userExists = true;
            }
        }

        return userExists;
    }
    //this will loop through the array list hash map and check if the password entered exists
    public boolean userExistingPswd( ArrayList<HashMap<String, String>> users, String pswd, String userName){
        UserInputDatabase.readingFile();
        boolean pswdcorrect = false;
        boolean userExists = false;

        //this will check if the username entered exists in the user DB
        for(int i = 0; i < users.size(); i++){
            if(userName.equals(users.get(i).get("email")) && !userExists){
                userExists = true;
                if (users.get(i).get("password").equals(pswd)) {
                    pswdcorrect = true;
                }

            }
        }

        return pswdcorrect;
    }
    //this method will loop through the array list and print it out
    public static void passwordRequirements(){
        ArrayList<String> passwordRequirements = new ArrayList<String>();
        passwordRequirements.add("1.Password should at last have 8 characters");
        passwordRequirements.add("2.Password should include at least one lower case letter and upper case letter");
        passwordRequirements.add("3.Password should contain at least one digit");
        passwordRequirements.add("4.Password should include at least one special character");
        for(int i = 0; i <passwordRequirements.size();i++){
            System.out.println(passwordRequirements.get(i));
        }
    }

}


