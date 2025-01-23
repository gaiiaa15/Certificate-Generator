//SID2309752
//Team WAG

package CertificateGeneratorApp;
import CertificateGeneratorApp.NewUser;
import CertificateGeneratorApp.ExistingUser;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class UserInputDatabase {
    public static void store(String email, String password) {
        try {
            //open a FileWriter with append mode (to append new users)
            FileWriter fileWriter = new FileWriter("users.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            //write user data to the file
            bufferedWriter.write(email);
            bufferedWriter.write(" ");
            bufferedWriter.write(password);
            bufferedWriter.newLine();

            //System.out.println("file created");

            //closing the buffer writer
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<HashMap<String, String>> readingFile() {
        ArrayList<HashMap<String, String>> users = new ArrayList<>();
        try {
            //opening a file reader
            FileReader fileReader = new FileReader("users.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            //read each line from the file
            while ((line = bufferedReader.readLine()) != null) {
                //System.out.println(line);
                //empty hashmap
                HashMap<String, String> userData = new HashMap<String, String>();
                String[] lineSplit = line.split(" ");
                userData.put("email", lineSplit[0]);
                userData.put("password", lineSplit[1]);

                users.add(userData);

                // System.out.println(line);
            }

            //close the bufferedReader
            bufferedReader.close();
            return users;

        } catch (IOException e) {
            e.printStackTrace();

            return users;
        }


    }

    public static boolean updating(Integer i, String email, String newPass) {
        try {
            // Read the content of the file into memory
            File file = new File("users.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            StringBuilder contentBuilder = new StringBuilder();
            String line;
            int lineNumber = 1;
            while ((line = reader.readLine()) != null) {
                // Check if this is the line to update
                if (lineNumber == i) {
                    // Update the line content
                    line = email + " " + newPass;
                }
                contentBuilder.append(line).append("\n");
                lineNumber++;
            }
            reader.close();

            // Write the updated content back to the file
            FileWriter writer = new FileWriter(file);
            writer.write(contentBuilder.toString());
            writer.close();
            return true;
        } catch (IOException e) {
            System.out.println("An error occurred while updating the file: " + e.getMessage());
            e.printStackTrace();

            return false;
        }
    }
}
