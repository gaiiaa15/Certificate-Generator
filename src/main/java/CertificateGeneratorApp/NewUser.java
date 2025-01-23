//SID2309752
//Team WAG

package CertificateGeneratorApp;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Random;

import static CertificateGeneratorApp.ExistingUser.userExistingEmail;

public class NewUser {

    public  String signup() {
        //title of the page
        System.out.println("-----------------Sign Up---------------\n");
        boolean correctEmail = false;
        //String email That will store the user input
        String email;
        do {
            Scanner enteremail = new Scanner(System.in);

            //entering and validating the email
            System.out.print("Enter your email below:\n");
            // this means that whatever the user input is it is stored in the variable email
            email = enteremail.nextLine();
            //System.out.println("Email:" + email);

            //isValidEmail is a method that checks if the email entered by the user has te right requirements
            // and prints out
            if (isValidEmail(email)) {
                if (userExistingEmail(email)) {
                    System.out.println("Email already exists...");
                    LogIn goback = new LogIn();
                    goback.log();
                }
                correctEmail = true;
                //the email is valid so the boolean is switched to true.

            } else {
                //if the email is invalid it prints out the following...
                System.out.println("Invalid email address please try again: ");
            }
            //the do while loop keeps going until correct email is true, therefore when the user enters the email with all the right requirements
        } while (!correctEmail);



        boolean correctPassword = false;
        //variable that will have the entered password byt hte user stored in it
        String password;

        do {
            //entering and validating password
            Scanner enterPassword = new Scanner(System.in);

            //created an array list that has all teh requirements for the password
            ArrayList<String> passwordRequirements = new ArrayList<String>();
            passwordRequirements.add("1.Password should at last have 8 characters");
            passwordRequirements.add("2.Password should include at least one lower case letter and upper case letter");
            passwordRequirements.add("3.Password should contain at least one digit");
            passwordRequirements.add("4.Password should include at least one special character");

            //the for loop loops through the array list and prints out the text at each index
            for (int i = 0; i < passwordRequirements.size(); i++) {
                System.out.println(passwordRequirements.get(i));
            }

            //entering the password
            System.out.println("Create Password: ");
            //stores the user input in variable password
            password = enterPassword.nextLine();


            if (isValidPassword(password)) {
                //the password matches the requirements
               //System.out.println("Valid Password !\n");
                correctPassword = true;


            } else {
                //the password doesn't match the requirements
                System.out.println("Please make sure that password meets all the requirements");
            }
            //loop keeps going until user enters the right password format
        } while (!correctPassword);

        boolean correctPassword2 = false;
        do {

            Scanner enterPassword2 = new Scanner(System.in);
            System.out.println("Repeat Password: ");
            //stores the user input in the variable password2
            String password2 = enterPassword2.nextLine();
            //the if statement checks if the password entered passes the requirements
            if (isValidPassword(password2)) {
                //checks if the password2 is thr same as password are identical
                if (validatingPassword(password2, password)) {
                    System.out.println("Passwords are identical\n");
                    System.out.println("ACCOUNT HAS BEEN CREATED\n");
                    //they are, so then it calls the functions that generated 4-digit code
                    int verificationCode = generateVerificationCode();
                    System.out.println("Here is your 4-digit code: " + verificationCode);
                    //calls the function which checks if the code the user entered is the same as the user generated
                    validateCodeToLogIn(verificationCode);
                    correctPassword2 = true;
                } else {
                    //they aren't, so it prompts the user to retry to be able to log in
                    System.out.println("Please make sure the passwords match to move on.\n");
                }


            } else {
                //the password doesn't match all the requirements
                System.out.println("Please make sure it has all characteristics");
            }
            //the do while keeps going until user inputs the correct password
        } while (!correctPassword2);


        CertificateGeneratorApp.UserInputDatabase users = new CertificateGeneratorApp.UserInputDatabase();
        users.store(email, password);

        return email;

    }
    //this will check if the email entered by the user has all the characters and symbols needed
    public static boolean isValidEmail(String email) {
        //regular expression pattern for a valid email address
        String emailRegex = "^[a-zA-Z0-9_+.-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

        //compile the pattern
        Pattern pattern = Pattern.compile(emailRegex);

        //create a Matcher object
        Matcher matcher = pattern.matcher(email);

        //return true if the email matches the patter, false otherwise
        return matcher.matches();
    }



    public static boolean isValidPassword(String password) {
        //check the length of the password
        if(password.length() < 8){
            System.out.println("Please make sure your password has at least 8 characters!\n");
            System.out.println("---TRY AGAIN---");
            return false;

        }

        //check for at least on uppercase letter
        if(!password.matches(".*[A-Z].*")) {
            System.out.println("Please make sure you include an upper case letter in your password!\n");
            System.out.println("---TRY AGAIN---");
            return false;
        }

        //checks if the user included lowe case letters
        if(!password.matches(".*[a-z].*")){
            System.out.println("Please make sure you have at least 1 lower case letter in your password!\n");
            System.out.println("---TRY AGAIN---");
            return false;
        }
        //checks for at least one digit
        if(!password.matches(".*\\d.*")){
            System.out.println("Please make sure that you have at least one digit included");
            System.out.println("---TRY AGAIN---");
            return false;
        }
        //checks for the least one special character
        if(!password.matches(".*[!@#$%^&*()-+=?].*")) {
            System.out.println("Please make sure you have at least one special character");
            System.out.println("---TRY AGAIN---");
            return false;
        }
        //if all the criteria is met
        return true;

    }

    public static int generateVerificationCode(){
        //Generating a 4-digit code
        Random random = new Random();
        //will return a 4 digit code
        return random.nextInt(9000) + 1000;// this gives it the boundaries of generating a number between 1000 and 9999
    }

    //this will check if password is equal to the second password2 when entered by the user
    public static boolean validatingPassword(String password, String password2){
        return password2.equals(password);
    }

    //this will check if the code entered by the user is the same as the code that has been generated.
    public static void validateCodeToLogIn(int verificationCode) {
        //allows the user to enter the code
        Scanner userCode = new Scanner(System.in);
        boolean codeCorrect = false;
        do {
            //prompts the user to enter the code
            System.out.print("Please enter the code given: ");
            //stored the user inout in the inputCode variable
            int inputCode = userCode.nextInt();
            // checks if the verification code genertated in the generateverificationcode method is the same as the one entered by the user
            if (verificationCode == inputCode) {
                codeCorrect = true;
                System.out.println("You have logged in");
            } else {
                System.out.println("Invalid Code !");
            }
        }while(!codeCorrect);
    }
}




