//SID2309752
//Team WAG

package CertificateGeneratorApp;
//In this document I have copied and parsed the different HTML templates to ba enable to implement the user input into the actual certificates.
//I have parsed the need variables into the templated to be able to execute the users input into the certificate
public class Templates {
    public String getEducationalCertificateTemplate(String name, String purpose, String date, String signature ) {
        return "<!DOCTYPE html>\n" +
                "  <html lang=\"en\">\n" +
                "  <head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Document</title>\n" +
                "    <style>\n" +
                "        @import url('https://fonts.googleapis.com/css?family=Open+Sans|Pinyon+Script|Rochester');\n" +
                "        @import url('https://fonts.googleapis.com/css2?family=Lora:ital,wght@0,400..700;1,400..700&family=Playfair+Display:ital,wght@0,400..900;1,400..900&family=Roboto:ital,wght@0,100;0,300;0,400;0,500;0,700;0,900;1,100;1,300;1,400;1,500;1,700;1,900&display=swap');\n" +
                "\n" +
                "\n" +
                "\n" +
                ".bold {\n" +
                "  font-weight: bold;\n" +
                "}\n" +
                "\n" +
                "\n" +
                "body {\n" +
                "  padding: 20px 0;\n" +
                "  background: #ccc;\n" +
                "}\n" +
                "\n" +
                ".pm-certificate-container {\n" +
                "  position: relative;\n" +
                "  width: 800px;\n" +
                "  height: 600px;\n" +
                "  background-color: #d1af81;\n" +
                "  padding: 30px;\n" +
                "  color: #333;\n" +
                "  font-family: 'Open Sans', sans-serif;\n" +
                "  box-shadow: 0 0 5px rgba(0, 0, 0, .5);\n" +
                "\n" +
                "  .outer-border {\n" +
                "    width: 794px;\n" +
                "    height: 594px;\n" +
                "    position: absolute;\n" +
                "    left: 50%;\n" +
                "    margin-left: -397px;\n" +
                "    top: 50%;\n" +
                "    margin-top:-297px;\n" +
                "    border: 2px solid #fff;\n" +
                "  }\n" +
                "\n" +
                "  .inner-border {\n" +
                "    width: 730px;\n" +
                "    height: 530px;\n" +
                "    position: absolute;\n" +
                "    left: 50%;\n" +
                "    margin-left: -365px;\n" +
                "    top: 50%;\n" +
                "    margin-top:-265px;\n" +
                "    border: 2px solid #fff;\n" +
                "  }\n" +
                "\n" +
                "  .pm-certificate-border {\n" +
                "    position: relative;\n" +
                "    width: 720px;\n" +
                "    height: 520px;\n" +
                "    padding: 0;\n" +
                "    border: 1px solid #E1E5F0;\n" +
                "    background-color: rgba(255, 255, 255, 1);\n" +
                "    background-image: none;\n" +
                "    left: 50%;\n" +
                "    margin-left: -360px;\n" +
                "    top: 50%;\n" +
                "    margin-top: -260px;\n" +
                "\n" +
                "\n" +
                "    .pm-certificate-header {\n" +
                "      margin-bottom: 10px;\n" +
                "    }\n" +
                "\n" +
                "    .pm-certificate-title {\n" +
                "      position: relative;\n" +
                "\n" +
                "      h1 {\n" +
                "          font-family: \"Lora\", sans-serif;\n" +
                "        text-align: center;\n" +
                "        font-size: 40px !important;\n" +
                "          margin: 20px 0 0 ;\n" +
                "      }\n" +
                "        h3 {\n" +
                "            font-family: \"Lora\", sans-serif;\n" +
                "            text-align: center;\n" +
                "            font-size: 30px !important;\n" +
                "            margin: .5rem 0;\n" +
                "            color: #b2973a ;\n" +
                "        }\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "    .pm-certificate-body {\n" +
                "      padding: 20px;\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "    .pm-certificate-footer {\n" +
                "      width: 650px;\n" +
                "      height: 100px;\n" +
                "      position: relative;\n" +
                "      left: 50%;\n" +
                "      margin-left: -325px;\n" +
                "    }\n" +
                "\n" +
                "    .footer-list{\n" +
                "        display: flex;\n" +
                "        align-items: center;\n" +
                "        justify-content: center;\n" +
                "    }\n" +
                "\n" +
                "    .data-value{\n" +
                "        font-size: 1rem;\n" +
                "        text-align: center;\n" +
                "    }\n" +
                "\n" +
                "    .separator-line{\n" +
                "        width: 100%;\n" +
                "        height:1px;\n" +
                "        background: #000;\n" +
                "        margin: .4rem 0 1rem;\n" +
                "    }\n" +
                "\n" +
                "    .data-label{\n" +
                "        font-size: 1.1rem;\n" +
                "        text-align: center;\n" +
                "        text-transform: uppercase;\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "    .logo-section{\n" +
                "        width: 100px;\n" +
                "        height: 100px;\n" +
                "        margin: 0 .5rem;\n" +
                "    }\n" +
                "\n" +
                "        .logo-section img{\n" +
                "            width: 100%;\n" +
                "            height: 100%;\n" +
                "        }\n" +
                "\n" +
                "    .date-section,\n" +
                "    .instructor-section{\n" +
                "        width: calc(50% - 100px);\n" +
                "    }\n" +
                "\n" +
                "    .recipient{\n" +
                "        text-align: center;\n" +
                "        font-family:\"Lora\", sans-serif; ;\n" +
                "        font-size: 30px !important;\n" +
                "    }\n" +
                "\n" +
                "    .Title{\n" +
                "        text-align: center;\n" +
                "        font-szie: 20px !important;\n" +
                "        font-family:\"Lora\", sans-serif;\n" +
                "    }\n" +
                "\n" +
                "    p{\n" +
                "        text-align: center;\n" +
                "        font-family: \"Lora\", sans-serif;\n" +
                "        color:#b2973a;\n" +
                "    }\n" +
                "\n" +
                "    .courseName{\n" +
                "        text-align: center;\n" +
                "        font-family: \"Lora\", sans-serif;\n" +
                "        font-size:30px !important;\n" +
                "        color: black;\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "\n" +
                "    </style>\n" +
                "  </head>\n" +
                "  <body>\n" +
                "    <div class=\"container pm-certificate-container\">\n" +
                "      <div class=\"outer-border\"></div>\n" +
                "      <div class=\"inner-border\"></div>\n" +
                "\n" +
                "      <div class=\"pm-certificate-border col-xs-12\">\n" +
                "        <div class=\"row pm-certificate-header\">\n" +
                "          <div class=\"pm-certificate-title cursive col-xs-12 text-center\">\n" +
                "            <h1>CERTIFICATE</h1>\n" +
                "              <h3>OF COMPLETION</h3>\n" +
                "          </div>\n" +
                "        </div>\n" +
                "\n" +
                "        <div class=\"row pm-certificate-body\">\n" +
                "\n" +
                "          <div class=\"pm-certificate-block\">\n" +
                "\n" +
                "              <div class=\"col-xs-12\">\n" +
                "                <div class=\"row\">\n" +
                "                    <div class = \"col-xs-2 Title\">THIS CERTIFICATE IS PROUDLY PRESENTED TO:</div>\n" +
                "                  <div class=\"col-xs-2 recipient \">" + name + "</div>\n" +
                "                  <div class=\"pm-earned col-xs-8 text-center\">\n" +
                "                    <p>HAS SUCCESSFULLY COMPLETED</p>\n" +
                "                  </div>\n" +
                "                    <div class=\"\">\n" +
                "                        <p class=\"courseName\">" + purpose + "</p>\n" +
                "                    </div>\n" +
                "                  <div class=\"col-xs-2\"><!-- LEAVE EMPTY --></div>\n" +
                "                  <div class=\"col-xs-12\"></div>\n" +
                "                </div>\n" +
                "              </div>\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "          </div>       \n" +
                "          \n" +
                "          <div class=\"col-xs-12\">\n" +
                "            <div class=\"row\">\n" +
                "              <div class=\"pm-certificate-footer\">\n" +
                "                  <div class=\"footer-list\">\n" +
                "                      <div class=\"date-section\">\n" +
                "                          <div class=\"data-value\">\n" +
                "                              " + date + "\n" +
                "                          </div>\n" +
                "\n" +
                "                          <div class=\"separator-line\"></div>\n" +
                "                          <div class=\"data-label bold\">\n" +
                "                              Date\n" +
                "                          </div>\n" +
                "                      </div>\n" +
                "                      <div class=\"logo-section\">\n" +
                "                          <img src=\"certified.png\">\n" +
                "                      </div>\n" +
                "                      <div class=\"instructor-section\">\n" +
                "                          <div class=\"data-value\">\n" +
                "                              "+ signature + "\n" +
                "                          </div>\n" +
                "\n" +
                "                          <div class=\"separator-line\"></div>\n" +
                "                          <div class=\"data-label bold\">\n" +
                "                             Instructor\n" +
                "                          </div>\n" +
                "                      </div>\n" +
                "                  </div>\n" +
                "              </div>\n" +
                "            </div>\n" +
                "          </div>\n" +
                "  \n" +
                "        </div>\n" +
                "  \n" +
                "      </div>\n" +
                "    </div>\n" +
                "  </body>\n" +
                "  </html>";

    }

    public String getBusinessCertificateTemplate(String name, String purpose, String date, String signature){
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "       <title>Document</title>\n" +
                "     <style>\n" +
                "         @import url('https://fonts.googleapis.com/css2?family=Lobster&display=swap');\n" +
                ".frame {\n" +
                "    width:1000px;\n" +
                "    height:800px;\n" +
                "    position: relative;\n" +
                "}\n" +
                "    .frame img{\n" +
                "        width:100%;\n" +
                "        height:100%;\n" +
                "    }\n" +
                "\n" +
                "    .certificate-container{\n" +
                "        position: absolute;\n" +
                "        top: 75px;\n" +
                "        left: 50%;\n" +
                "        width: calc(100% - 150px);\n" +
                "        transform: translateX(-50%);\n" +
                "    }\n" +
                "\n" +
                "    h1{\n" +
                "        color: black;\n" +
                "        text-align:center;\n" +
                "        text-transform: uppercase;\n" +
                "        font-family: \"Lobster\", 'Pinyon Script', cursive;\n" +
                "    }\n" +
                "\n" +
                "    h2{\n" +
                "        color:#5b62f2;\n" +
                "        text-align:center;\n" +
                "        text-transform: uppercase;\n" +
                "        font-family: \"Lobster\", 'Pinyon Script', cursive;\n" +
                "\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "    h3{\n" +
                "        text-transform: uppercase;\n" +
                "        font-family: \"Lobster\", 'Pinyon Script', cursive;\n" +
                "        color: black;\n" +
                "    }\n" +
                "\n" +
                "    p{\n" +
                "        color: black;\n" +
                "        text-align:center;\n" +
                "        text-transform: uppercase;\n" +
                "        font-size: 50px;\n" +
                "        font-family: \"Lobster\", 'Pinyon Script', cursive;\n" +
                "    }\n" +
                "\n" +
                "    h3.sentence{\n" +
                "        color:#5b62f2;\n" +
                "        font-family: \"Lobster\",'Pinyon Script', cursive;\n" +
                "        text-align: center;\n" +
                "        text-transform: uppercase;\n" +
                "    }\n" +
                "\n" +
                "    .name{\n" +
                "        text-align: center;\n" +
                "    }\n" +
                "\n" +
                "    h1.courseName{\n" +
                "        color: black;\n" +
                "        text-align:center;\n" +
                "        text-transform: uppercase;\n" +
                "        font-family: \"Lobster\", 'Pinyon Script', cursive;\n" +
                "    }\n" +
                "\n" +
                "         .certificate-footer{\n" +
                "             display: flex;\n" +
                "             align-items: center;\n" +
                "             justify-content: center;\n" +
                "         }\n" +
                "\n" +
                "         .data-value1{\n" +
                "             font-size: 1rem;\n" +
                "             text-align: center;\n" +
                "\n" +
                "         }\n" +
                "\n" +
                "         .data-value2{\n" +
                "             font-size: 1rem;\n" +
                "             text-align: center;\n" +
                "         }\n" +
                "\n" +
                "\n" +
                "\n" +
                "         .data-label{\n" +
                "             font-size: 1.1rem;\n" +
                "             text-align: center;\n" +
                "             text-transform: uppercase;\n" +
                "\n" +
                "         }\n" +
                "         .separator-line1{\n" +
                "             width: 100%;\n" +
                "             height:1px;\n" +
                "             background: #000;\n" +
                "         }\n" +
                "\n" +
                "         .separator-line2{\n" +
                "             width: 100%;\n" +
                "             height:1px;\n" +
                "             background: #000;\n" +
                "         }\n" +
                "\n" +
                "\n" +
                "         .logo-section{\n" +
                "             width: 100px;\n" +
                "             height: 100px;\n" +
                "             margin: 0 .5rem;\n" +
                "         }\n" +
                "\n" +
                "         .logo-section img{\n" +
                "             width: 100%;\n" +
                "             height: 100%;\n" +
                "         }\n" +
                "\n" +
                "\n" +
                "         .date-section,\n" +
                "         .instructor-section{\n" +
                "             width: calc(50% - 100px);\n" +
                "         }\n" +
                "\n" +
                "\n" +
                "     </style>\n" +
                "</head>\n" +
                "    <body>\n" +
                "    <div class=\"frame\">\n" +
                "        <img src=\"fblue.png\">\n" +
                "\n" +
                "       <div class=\"certificate-container\">\n" +
                "           <div class=\"title\">\n" +
                "               <h1>certificate</h1>\n" +
                "               <h2>of completion</h2>\n" +
                "           </div>\n" +
                "\n" +
                "           <div class=\"name\">\n" +
                "               <h3> this certificate is proudly presented to</h3>\n" +
                "               <p>\n" +
                "                   "+ name +
                "               </p>\n" +
                "\n" +
                "           </div>\n" +
                "           <div>\n" +
                "               <h3 class=\"sentence\">\n" +
                "                   has successfully completed\n" +
                "               </h3>\n" +
                "           </div>\n" +
                "\n" +
                "           <div>\n" +
                "               <h1 class=\"courseName\">\n" +
                "                   " + purpose+
                "               </h1>\n" +
                "           </div>\n" +
                "\n" +
                "           <div class=\"certificate-footer\">\n" +
                "               <div class=\"date-section\">\n" +
                "                   <div class=\"data-value1\">\n" +
                "                       " + date +
                "                   </div>\n" +
                "\n" +
                "                   <div class=\"separator-line1\">\n" +
                "                       <div class=\"data-label\">\n" +
                "                           Date\n" +
                "                       </div>\n" +
                "                   </div>\n" +
                "\n" +
                "               </div>\n" +
                "\n" +
                "\n" +
                "               <div class=\"logo-section\">\n" +
                "                   <img src=\"certified.png\">\n" +
                "\n" +
                "               </div>\n" +
                "\n" +
                "               <div class=\"instructor-section\">\n" +
                "                   <div class =\"data-value2\">\n" +
                "                      "+ signature +
                "                   </div>\n" +
                "\n" +
                "                   <div class=\"separator-line2\">\n" +
                "                       <div class=\"data-label\">\n" +
                "                           Instructor\n" +
                "                       </div>\n" +
                "                   </div>\n" +
                "\n" +
                "               </div>\n" +
                "           </div>\n" +
                "       </div>\n" +
                "\n" +
                "\n" +
                "\n" +
                "     </div>\n" +
                "\n" +
                " </body>\n" +
                "</html>";
    }

    public String getMedicalCertificateTemplate(String name, String purpose, String date, String signature){
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Document</title>\n" +
                "    <style>\n" +
                "        @import url('https://fonts.googleapis.com/css2?family=Lobster&display=swap');\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "        .frame {\n" +
                "            width:1000px;\n" +
                "            height:800px;\n" +
                "            position:relative;\n" +
                "\n" +
                "        }\n" +
                "        .frame img{\n" +
                "            width:100%;\n" +
                "            height:100%;\n" +
                "        }\n" +
                "\n" +
                "        .certificate-container{\n" +
                "            position: absolute;\n" +
                "            top:75px;\n" +
                "            left:50%;\n" +
                "            width:calc(100% - 250px);\n" +
                "            transform: translateX(-50%);\n" +
                "        }\n" +
                "\n" +
                "        h1{\n" +
                "            color: black;\n" +
                "            text-align:center;\n" +
                "            text-transform: uppercase;\n" +
                "            font-family: \"Lobster\", 'Pinyon Script', cursive;\n" +
                "        }\n" +
                "\n" +
                "        h2{\n" +
                "            color:#349932;\n" +
                "            text-align:center;\n" +
                "            text-transform: uppercase;\n" +
                "            font-family: \"Lobster\", 'Pinyon Script', cursive;\n" +
                "\n" +
                "\n" +
                "        }\n" +
                "\n" +
                "        h3{\n" +
                "            text-transform: uppercase;\n" +
                "            text-align: center;\n" +
                "            font-family: \"Lobster\", 'Pinyon Script', cursive;\n" +
                "            color: black;\n" +
                "        }\n" +
                "\n" +
                "        p{\n" +
                "            color: black;\n" +
                "            text-align:center;\n" +
                "            text-transform: uppercase;\n" +
                "            font-size: 50px;\n" +
                "            font-family: \"Lobster\", 'Pinyon Script', cursive;\n" +
                "        }\n" +
                "\n" +
                "        h3.sentence{\n" +
                "            color:#349932;\n" +
                "            font-family: \"Lobster\",'Pinyon Script', cursive;\n" +
                "            text-align: center;\n" +
                "            text-transform: uppercase;\n" +
                "        }\n" +
                "\n" +
                "        h1.courseName{\n" +
                "            color: black;\n" +
                "            text-align:center;\n" +
                "            text-transform: uppercase;\n" +
                "            font-family: \"Lobster\", 'Pinyon Script', cursive;\n" +
                "        }\n" +
                "\n" +
                "        .certificate-footer{\n" +
                "            display: flex;\n" +
                "            align-items: center;\n" +
                "            justify-content: center;\n" +
                "        }\n" +
                "\n" +
                "        .data-value1{\n" +
                "            font-size: 1rem;\n" +
                "            text-align: center;\n" +
                "        }\n" +
                "\n" +
                "        .data-value2{\n" +
                "            font-size: 1rem;\n" +
                "            text-align: center;\n" +
                "        }\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "        .data-label{\n" +
                "            font-size: 1.1rem;\n" +
                "            text-align: center;\n" +
                "            text-transform: uppercase;\n" +
                "\n" +
                "\n" +
                "        }\n" +
                "        .separator-line1{\n" +
                "            width: 100%;\n" +
                "            height:1px;\n" +
                "            background: #000;\n" +
                "            margin: .6rem 0;\n" +
                "\n" +
                "        }\n" +
                "\n" +
                "        .separator-line2{\n" +
                "            width: 100%;\n" +
                "            height:1px;\n" +
                "            background: #000;\n" +
                "            margin: .6rem 0;\n" +
                "        }\n" +
                "\n" +
                "\n" +
                "        .logo-section{\n" +
                "            width: 100px;\n" +
                "            height: 100px;\n" +
                "            margin: 0 .5rem;\n" +
                "        }\n" +
                "\n" +
                "        .logo-section img{\n" +
                "            width: 100%;\n" +
                "            height: 100%;\n" +
                "        }\n" +
                "\n" +
                "\n" +
                "        .date-section,\n" +
                "        .instructor-section{\n" +
                "            width: calc(50% - 30px);\n" +
                "        }\n" +
                "\n" +
                "\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "    <div class=\"frame\">\n" +
                "        <img src=\"gFrame.png\">\n" +
                "\n" +
                "        <div class=\"certificate-container\">\n" +
                "        <div class=\"title\">\n" +
                "            <h1>certificate</h1>\n" +
                "            <h2>of completion</h2>\n" +
                "        </div>\n" +
                "\n" +
                "        <div class=\"name\">\n" +
                "            <h3> this certificate is proudly presented to</h3>\n" +
                "            <p>\n" +
                "                "+ name  +
                "            </p>\n" +
                "\n" +
                "        </div>\n" +
                "        <div>\n" +
                "            <h3 class=\"sentence\">\n" +
                "                has successfully completed\n" +
                "            </h3>\n" +
                "        </div>\n" +
                "\n" +
                "        <div>\n" +
                "            <h1 class=\"courseName\">\n" +
                "                "+ purpose  +
                "            </h1>\n" +
                "        </div>\n" +
                "\n" +
                "        <div class=\"certificate-footer\">\n" +
                "            <div class=\"date-section\">\n" +
                "                <div class=\"data-value1\">\n" +
                "                        " + date +
                "\n" +
                "                </div>\n" +
                "                <div class=\"separator-line1\">\n" +
                "\n" +
                "                </div>\n" +
                "\n" +
                "                <div class=\"data-label\">\n" +
                "                    Date\n" +
                "                </div>\n" +
                "\n" +
                "            </div>\n" +
                "\n" +
                "            <div class=\"logo-section\">\n" +
                "                <img src=\"certified.png\">\n" +
                "\n" +
                "            </div>\n" +
                "\n" +
                "           <div class=\"instructor-section\">\n" +
                "               <div class =\"data-value2\">\n" +
                "                 "+ signature +
                "               </div>\n" +
                "               <div class=\"separator-line2\">\n" +
                "\n" +
                "               </div>\n" +
                "\n" +
                "               <div class=\"data-label\">\n" +
                "                   Instructor\n" +
                "               </div>\n" +
                "\n" +
                "           </div>\n" +
                "       </div>\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "        </div>\n" +
                "\n" +
                "\n" +
                "\n" +
                "    </div>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "</body>\n" +
                "</html> ";
    }

    public String getFinancialCertificateTemplate(String name, String purpose, String date){
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Certificate</title>\n" +
                "    <style>\n" +
                "        @page{\n" +
                "    size:A4 landscape;\n" +
                "    margin:10mm;\n" +
                "}\n" +
                "\n" +
                ".border-pattern{\n" +
                "    position:absolute;\n" +
                "    left:4mm;\n" +
                "  top:-6mm;\n" +
                "  height:200mm;\n" +
                "  width:267mm;\n" +
                "  border:1mm solid #991B1B;\n" +
                "    /* http://www.heropatterns.com/ */\n" +
                "    background-color: #d6d6e4;\n" +
                "    background-image: url(\"data:image/svg+xml,%3Csvg width='16' height='16' viewBox='0 0 16 16' xmlns='http://www.w3.org/2000/svg'%3E%3Cpath d='M0 0h16v2h-6v6h6v8H8v-6H2v6H0V0zm4 4h2v2H4V4zm8 8h2v2h-2v-2zm-8 0h2v2H4v-2zm8-8h2v2h-2V4z' fill='%23991B1B' fill-opacity='1' fill-rule='evenodd'/%3E%3C/svg%3E\");\n" +
                "}\n" +
                "\n" +
                ".content{\n" +
                "    position:absolute;\n" +
                "    left:10mm;\n" +
                "    top:10mm;\n" +
                "  height:178mm;\n" +
                "  width:245mm;\n" +
                "  border:1mm solid #991B1B;\n" +
                "    background:white;\n" +
                "}\n" +
                "\n" +
                ".inner-content{\n" +
                "    border:1mm solid #991B1B;\n" +
                "    margin:4mm;\n" +
                "    padding:10mm;\n" +
                "  height:148mm;\n" +
                "    text-align:center;\n" +
                "}\n" +
                "\n" +
                "h1{\n" +
                "    text-transform:uppercase;\n" +
                "    font-size:48pt;\n" +
                "    margin-bottom:0;\n" +
                "}\n" +
                "\n" +
                "h2{\n" +
                "    font-size:24pt;\n" +
                "    margin-top:0;\n" +
                "    padding-bottom:1mm;\n" +
                "    display:inline-block;\n" +
                "    border-bottom:1mm solid #991B1B;\n" +
                "}\n" +
                "\n" +
                "h2::after{\n" +
                "    content:\"\";\n" +
                "    display:block;\n" +
                "    padding-bottom:4mm;\n" +
                "    border-bottom:1mm solid #991B1B;\n" +
                "}\n" +
                "\n" +
                "h3{\n" +
                "    font-size:20pt;\n" +
                "    margin-bottom:0;\n" +
                "    margin-top:10mm;\n" +
                "}\n" +
                "\n" +
                "p{\n" +
                "    font-size:16pt;\n" +
                "}\n" +
                "\n" +
                ".badge{\n" +
                "    width:40mm;\n" +
                "    height:40mm;\n" +
                "    position:absolute;\n" +
                "    right:10mm;\n" +
                "    bottom:10mm;\n" +
                "    background-image:url(\"data:image/svg+xml,%3Csvg xmlns='http://www.w3.org/2000/svg' fill='none' viewBox='0 0 24 24' stroke='currentColor'%3E%3Cpath stroke-linecap='round' stroke-linejoin='round' stroke-width='2' d='M9 12l2 2 4-4M7.835 4.697a3.42 3.42 0 001.946-.806 3.42 3.42 0 014.438 0 3.42 3.42 0 001.946.806 3.42 3.42 0 013.138 3.138 3.42 3.42 0 00.806 1.946 3.42 3.42 0 010 4.438 3.42 3.42 0 00-.806 1.946 3.42 3.42 0 01-3.138 3.138 3.42 3.42 0 00-1.946.806 3.42 3.42 0 01-4.438 0 3.42 3.42 0 00-1.946-.806 3.42 3.42 0 01-3.138-3.138 3.42 3.42 0 00-.806-1.946 3.42 3.42 0 010-4.438 3.42 3.42 0 00.806-1.946 3.42 3.42 0 013.138-3.138z' /%3E%3C/svg%3E\");\n" +
                "}\n" +
                "    </style>\n" +
                "\n" +
                "</head>\n" +
                "<body>\n" +
                "  <div class=\"border-pattern\">\n" +
                "      <div class=\"content\">\n" +
                "          <div class=\"inner-content\">\n" +
                "              <h1>Certificate</h1>\n" +
                "              <h2>of Excellence</h2>\n" +
                "              <h3>This Certificate Is Proudly Presented To</h3>\n" +
                "              <p>" + name + "</p>\n"+
                "              <h3>Has Completed</h3>\n" +
                "              <p>"+ purpose + "</p>\n" +
                "              <h3>On</h3>\n" +
                "              <p>" + date +"</p>\n" +
                "              <div class=\"badge\">\n" +
                "              </div>\n" +
                "          </div>\n" +
                "      </div>\n" +
                "  </div>\n" +
                "</body>\n" +
                "</html>";
    }
}
