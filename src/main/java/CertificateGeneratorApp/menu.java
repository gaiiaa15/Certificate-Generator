//SID2309752
//Team WAG

package CertificateGeneratorApp;
import java.util.ArrayList;
import java.util.Scanner;

// in the menu i have not added an option for the user to be able to subscribe as i did not find that it was necessary for the project
//simply because it does not have a GUI
public class menu {
    public static void accessMenu() {
        //an array list that contains the different main menu options
        ArrayList<String> menuContent = new ArrayList<String>();
        menuContent.add("a. Certificate Generator");
        menuContent.add("b. Profile");
        menuContent.add("c. Contact us");
        menuContent.add("d. About us");
        menuContent.add("e. Help Page");
        menuContent.add("x. Exit");
        for (int i = 0; i < menuContent.size(); i++) {
            System.out.println(menuContent.get(i));
        }
        String menuChoice;
        boolean correctOption = false;
        do {


            //user input
            Scanner scanInput = new Scanner(System.in);
            System.out.println("Select one of the pages:");
            menuChoice = scanInput.nextLine().trim();
            //string contains the different main menu options limiting the user error
            String[] options = {"a","b","c","d","e","x"};
            //checks if the user input is included int he options array
            for(int i = 0; i < options.length; i++){
                if(menuChoice.equals(options[i])){
                    correctOption = true;
                }
            }


        }while(!correctOption);

//the switch contains all the options in the menu and when the user selects it it takes them to the different parts of the program kjnhbvbnmnmnbnmnbnmjnbnmjnbnbnbvbv bn
        switch (menuChoice) {
            case "a":
                Generator CG = new Generator();
                CG.specificationForm();
                break;
            case "b":
                Profile accessingProfile = new Profile();
                accessingProfile.accessingProfile();
                break;
            case "c":
                ContactUs contactUs = new ContactUs();
                contactUs.contactUs();
                break;
            case "d":
                AboutUs aboutUs = new AboutUs();
                aboutUs.aboutUs();
                break;
            case "e":
                Help help = new Help();
                help.help();
                break;
            case "x":
                System.out.println("You have Exited...");
                break;


        }
    }



}
