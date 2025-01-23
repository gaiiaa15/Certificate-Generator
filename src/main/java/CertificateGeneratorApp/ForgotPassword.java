//SID2309752
//Team WAG

package CertificateGeneratorApp;
import CertificateGeneratorApp.UserInputDatabase;
import CertificateGeneratorApp.ExistingUser;
import CertificateGeneratorApp.NewUser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ForgotPassword {
    public static void restore() {
        System.out.println("------Resetting Password------\n");
        boolean correct = false;
        String getEmail;
        do {
            Scanner enter = new Scanner(System.in);
            System.out.print("Please enter email first: ");
            getEmail = enter.nextLine();
            if (ExistingUser.userExistingEmail(getEmail)) {
                correct = true;
            }else {
                System.out.println("Email doesn't exist");
            }
        } while (!correct);

        boolean checking = false;

        do {
            ExistingUser.passwordRequirements();
            Scanner fPswd = new Scanner(System.in);
            System.out.print("Enter new Password:");
            String answer = fPswd.nextLine();
            if (NewUser.isValidPassword(answer)) {
                checking = true;
                resetPassword(answer, getEmail);
                System.out.println("--------Your password has been reset !---------\n");
                CertificateGeneratorApp.LogIn.log();
            }

        }while(!checking);
    }


    public static void resetPassword(String newPass, String userName){
        ArrayList<HashMap<String, String>> users = UserInputDatabase.readingFile();
        boolean userExists = false;

        //this will check if the username entered exists in the user DB
        for(int i = 0; i < users.size(); i++){
            if(userName.equals(users.get(i).get("email")) && !userExists){
                userExists = true;
                users.get(i).put("password", newPass );

                UserInputDatabase.updating(i, users.get(i).get("email"), newPass);
            }
        }
    }

}
