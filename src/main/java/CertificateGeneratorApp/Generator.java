//SID2309752
//Team WAG

package CertificateGeneratorApp;

import okhttp3.*;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
//SID2309752
//Team WAG

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Generator {
    public void specificationForm() {
        System.out.println("-----This is the Specification form-----");
        //this will include all the questions and the answers
        ArrayList<HashMap<String, String>> questionAndAnswerList = new ArrayList<>();
        HashMap<String, String> questionMap1 = new HashMap<String, String>();
        //adding the keys and the values
        boolean answerMap1 = false;
        String answer1;
        do {
            //scanner will check the user input
            Scanner question1 = new Scanner(System.in);
            //questions is the key and the whatever is after the , is the value
            questionMap1.put("question", "Purpose of the Certificate ?\n");
            //outputs the key
            System.out.print(questionMap1.get("question"));
            certificateTypes();
            //this will make sure that the user enters the right answer
            answer1 = question1.nextLine().toLowerCase();
            if (checkingAnswerIsInArrayList(answer1, returnCertificateType())) {
                answerMap1 = true;
                answer1 = upperCase(answer1);
                questionMap1.put("answer", answer1);
            } else {
                System.out.println("Invalid input, try typing one of the examples given");
            }

        } while (!answerMap1);
        questionAndAnswerList.add(questionMap1);


        HashMap<String, String> questionMap2 = new HashMap<String, String>();
        boolean answerMap2 = false;
        String[] names = new String[100];
        int counter = 0;
        String answer2;
        do {
            Scanner question2 = new Scanner(System.in);

            questionMap2.put("question", "Enter Full Name(s) ");
            System.out.print(questionMap2.get("question"));
            // answer of this question is stored in the variable answer2
            answer2 = question2.nextLine();
            //makes sure taken into the system as upper case by calling the upper case methode
            answer2 = upperCase(answer2);
            //each time the user enetrs a name it stores it in the counter and therefore creating a limit of 100 certificates
            names[counter] = answer2;
            //stores the user input
            Scanner input = new Scanner(System.in);
            System.out.println("would you like to enter another name ? (yes/no)");
            //sotres the user input in response variable as lowercase and goes to the next line
            String response = input.nextLine().toLowerCase();
            System.out.println("response:" + response);
            //if the user chooses to enter more names then it increases the counter value by 1
            if (response.equals("yes")) {
                counter = counter + 1;
                //if not then it takes the names and stores them in the answer2 variable
            } else if (response.equals("no")) {
                answerMap2 = true;
                questionMap2.put("answer", answer2);
            }
        } while (!answerMap2);
        //adding this to the array list so we can access the aquestions and the answers
        questionAndAnswerList.add(questionMap2);


        HashMap<String, String> questionMap9 = new HashMap<String, String>();
        boolean answerMap9 = false;
        do {
            Scanner question9 = new Scanner(System.in);
            //prompts the user to tneter the date
            questionMap9.put("question", "Enter the Date (yyyy-MM-dd): \n");
            //prints out the question
            System.out.println(questionMap9.get("question"));
            //stores the answer inputed by the user in the answer9 variable
            String answer9 = question9.nextLine();

            //defining the date format
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            LocalDate dateObject = LocalDate.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String formattedDate = dateObject.format(formatter);

            //parsing the user input as a date and checking if it is in the right format otherwise it will output an error
            try {
                Date date = dateFormat.parse(answer9);
                questionMap9.put("answer", dateObject.toString());
            } catch (ParseException e) {
                System.out.println("Invalid date format. Please enter the date in yyyy-MM-dd format\n");

            }
            answerMap9 = true;


        } while (!answerMap9);
        //adding this to the array list so we can access the questions and the answers
        questionAndAnswerList.add(questionMap9);

        HashMap<String, String> questionMap10 = new HashMap<String, String>();
        boolean answerMap10 = false;
        do {
            Scanner question10 = new Scanner(System.in);
            questionMap10.put("question", "Enter your signature: \n");
            System.out.println(questionMap10.get("question"));
            String answer10 = question10.nextLine();
            if (nameIsValid(answer10)) {
                questionMap10.put("answer", answer10);
                answerMap10 = true;
            } else {
                System.out.println("Please make sure your name doesnt have any numbers or symbols in it, example(John)");
                System.out.println("-------TRY AGAIN-------");
            }

        } while (!answerMap10);
        //adding this to the array list so we can access the questions and the answers
        questionAndAnswerList.add(questionMap10);


// this allows the user to input the name of the pdf to have it saved on their device
        HashMap<String, String> questionMap11 = new HashMap<String, String>();
        boolean answerMap11 = false;
        do {
            Scanner question11 = new Scanner(System.in);
            questionMap11.put("question", "Enter name of file: \n");
            System.out.println(questionMap11.get("question"));
            String answer11 = question11.nextLine();
            //checks if the user left the file name empty and if true outputs an error
            if (answer11.equals("")) {
                System.out.println("make sure that the name is not empty");
            } else {
                questionMap11.put("answer", answer11);
                answerMap11 = true;
            }

        } while (!answerMap11);
        //adding this to the array list so we can access the questions and the answers
        questionAndAnswerList.add(questionMap11);

        System.out.println("Generating certificate.....");
        menu.accessMenu();

// this chekcs if the names array enetred by the user is not empty and if not then it will take the answers and add them to certificates
        for(int i = 0; i < names.length; i++){
           if (names[i] != null) {
               generateCertificate(names[i], questionMap1.get("answer"), questionMap9.get("answer"), questionMap10.get("answer"),questionMap11.get("answer"));
           }

        }
    }

    //i have created this mehtod to convert the string entered by the user into upper case
public String upperCase(String userInput){
        // split the input string into words
      String[] words = userInput.split("\\s+");
      StringBuilder capitalizedString = new StringBuilder();

      //capitalizes the first letter of each word
    for (String word : words){
        if (!word.isEmpty()){
            String capitalizedWord = word.substring(0,1).toUpperCase() + word.substring(1);
            capitalizedString.append(capitalizedWord).append(" ");
        }
    }
return capitalizedString.toString().trim();
}

// this will make sure that the answer of the user is in the array list answer array list
    public boolean checkingAnswerIsInArrayList(String answer, ArrayList<String> arrayList) {

        boolean found = false;
        for (String data : arrayList) {
            if (data.equalsIgnoreCase(answer)) {
                found = true;
                break;
            }
        }
        return found;

    }


    //this checks if a name entered is only letters and is a valid input
    public boolean nameIsValid(String answer) {
        return answer.matches(".*[a-z].*" );
    }

    //this is the list of the different certificates
    public ArrayList<String> returnCertificateType() {
        ArrayList<String> type = new ArrayList<String>();
        type.add("Financial");
        type.add("Medical");
        type.add("Educational");
        type.add("Business");

        return type;
    }
//this will print out the different certificates
    public void certificateTypes() {
        ArrayList<String> certificateBorders = returnCertificateType();
        for (int i = 0; i < certificateBorders.size(); i++) {
            System.out.println(certificateBorders.get(i));
        }
    }


    //this links the certificate templates to the API converting them in PDFs for the user to have on their device
    public void generateCertificate(String name, String purpose, String date, String signature, String certificateName) {
        String templateHTML = "";
        String templateString = "";
        String certifiedImage = "";
        String frameImage = "";



        Templates templates = new Templates();
        switch (purpose.toLowerCase()) {
            case "financial":
                templateHTML = "template4";
                templateString = templates.getFinancialCertificateTemplate(name, purpose, date);
                certifiedImage = "certified";

                break;
            case "educational":
                templateHTML = "template1";
                templateString = templates.getEducationalCertificateTemplate(name, purpose, date, signature);
                certifiedImage ="certified";
                break;
            case "business":
                templateHTML = "template2";
                templateString = templates.getBusinessCertificateTemplate(name, purpose, date, signature);
                certifiedImage = "certified";
                frameImage = "fblue";

                break;
            case "medical":
                templateHTML = "template3";
                templateString = templates.getMedicalCertificateTemplate(name, purpose, date, signature);
                certifiedImage = "certified";
                frameImage = "gFrame";
                break;

        }


        try {
            Files.write(Paths.get("HTMLtemplates/" + templateHTML + ".html" ), templateString.getBytes(), StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.CREATE);



            MultipartBody.Builder builder = new MultipartBody.Builder();
            builder.setType(MultipartBody.FORM);

            builder.addFormDataPart(
                    templateHTML + ".html" ,
                    templateHTML+".html",


                    RequestBody.create(
                            new File("HTMLtemplates/" + templateHTML + ".html"),
                            MediaType.parse("text/html")
                    )

            ).addFormDataPart(
                    certifiedImage + ".png",
                    certifiedImage + ".png",
                    RequestBody.create(
                            new File("HTMLtemplates/" + certifiedImage + ".png"),
                            MediaType.parse("image/png")
                    )

            );

            if (!Objects.equals(frameImage, "")) {
                builder.addFormDataPart(
                        frameImage + ".png",
                        frameImage + ".png",
                        RequestBody.create(
                                new File("HTMLtemplates/" + frameImage + ".png"),
                                MediaType.parse("image/png")
                        )
                );
            }


            JSONArray instructionAssets =  new JSONArray()
                    .put(certifiedImage + ".png");

            if (!Objects.equals(frameImage, "")) {
                instructionAssets.put(frameImage + ".png");
            }
            builder.addFormDataPart(
                    "instructions",
                    new JSONObject()
                            .put("parts", new JSONArray()
                                    .put(new JSONObject()
                                            .put("html", templateHTML +".html")
                                            .put("assets", instructionAssets)
                                    )
                            ).toString()
            );

            final RequestBody body = builder.build();







            final Request request = new Request.Builder()
                    .url("https://api.pspdfkit.com/build")
                    .method("POST", body)
                    .addHeader("Authorization", "Bearer pdf_live_O0UFzhygJ6jF67sy797rrEQ0AG5goApTLGvOhtMhfpj")
                    .build();

            final OkHttpClient client = new OkHttpClient()
                    .newBuilder()
                    .build();

            final Response response = client.newCall(request).execute();

            if (response.isSuccessful()) {
                Files.copy(
                        response.body().byteStream(),
                        FileSystems.getDefault().getPath(certificateName + "-" + name + ".pdf"),
                        StandardCopyOption.REPLACE_EXISTING
                );


                System.out.println("Certificate successfully generated!");
            } else {
                // Handle the error.
                throw new IOException(response.body().string());
            }
       } catch (IOException e) {
           e.printStackTrace();
        }

    }

}


