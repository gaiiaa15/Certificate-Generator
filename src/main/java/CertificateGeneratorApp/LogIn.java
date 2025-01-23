//SID2309752
//Team WAG

package CertificateGeneratorApp;
import java.util.Scanner;

public class LogIn {
//declaration of the method log

    public static String log() {

        String email;
            //creates a new Existing user and then outputs the existing() method
            ExistingUser ExistingUser = new ExistingUser();
            email = ExistingUser.existing();
        return email;

    }

}


