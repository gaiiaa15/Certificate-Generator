import CertificateGeneratorApp.*;
//SID2309752
//Team WAG

public class Main {
    public static void main(String[] args){
        //Creates a new loginSignupMEnu object and then calls the first menu method
        LoginSignupMenu loginSignupMenu = new LoginSignupMenu();
        loginSignupMenu. firstMenu();

//Creates a new accessMenu object and then calls the first menu method
        CertificateGeneratorApp.menu accessMenu = new CertificateGeneratorApp.menu();
        accessMenu.accessMenu();


    }
}