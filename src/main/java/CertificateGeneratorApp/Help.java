//SID2309752
//Team WAG

package CertificateGeneratorApp;
import java.util.ArrayList;
import java.util.Scanner;
public class Help {

    public void help() {
        System.out.println("----Help Page----");
        //created a list of different questions that theu ser might have
        ArrayList<String> helpMenu = new ArrayList<String>();
        helpMenu.add("a. how do i create a certificate?");
        helpMenu.add("b. how do i change my password?");
        helpMenu.add("c. how do i report a problem ?");
        helpMenu.add("x. EXIT");
        // this will loop through the lst and out put all of the entered data
        for (int i = 0; i < helpMenu.size(); i++) {
            System.out.println(helpMenu.get(i));
        }
        //calling the method answeringQueries()
        answeringQueries();

    }

    public void answeringQueries() {
        boolean correctOption = false;
        String helpOpt;
        do {
            //reading the user input
            Scanner input = new Scanner(System.in);
            System.out.println("Please select one of the options: ");
            helpOpt = input.nextLine();
            //created an array that will have all the different options that the user can enter
            String[] options = {"a", "b", "c", "x"};

            //loops through the array and checks if the user input exists in the array then turn the boolean to true
            for (int i = 0; i < options.length; i++) {
                if (helpOpt.equals(options[i])) {
                    correctOption = true;
                }

            }
        } while (!correctOption);

        // a switch method that will take the user input by parsing helpOpt and depending on that it will output the different solutions or exit

        switch (helpOpt) {

            case "a":
                System.out.println("How to Create a Certificate ...\n");
                System.out.println("1. Go to the Certificate Generator (option a)\n");
                System.out.println("2. Go to the specification form (option a)\n");
                System.out.println("3. Answer the questions and the Certificates will be generated as a PDF and downloaded on your device automatically.\n");
                help();
                break;

            case "b":
                System.out.println("How to Change your Password ...\n");
                System.out.println("1. Go to your Profile (option b)\n");
                System.out.println("2. Go to the change password option in the menu\n");
                System.out.println("'3. change your Password\n");
                help();
                break;

            case "c":
                System.out.println("How to Report a Problem ...\n");
                System.out.println("1. Go to contact us (option c)\n");
                System.out.println("2. Enter your  name, email and phone number but only if you already have an account\n");
                System.out.println("3. Otherwise please create an account first before you report a problem\n");
                help();
                break;

            case "x":
                System.out.println("you have exited to the main menu...");
                menu goBackToMenu = new menu();
                goBackToMenu.accessMenu();
                break;



        }



    }
}
