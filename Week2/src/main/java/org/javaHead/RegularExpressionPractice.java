package org.javaHead;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionPractice {
    public static void main(String[] args) {
        String email = "ssmadhumitha@";
        String phone = "(612)-124-123";


//       String pattern1 = "^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$";
        String pattern1 = "^[(][0-9][0-9][0-9][)]-[0-9][0-9][0-9]-[0-9][0-9][0-9][0-9]";
        Pattern pattern = Pattern.compile(pattern1);
        Matcher match = pattern.matcher(phone);
        if(match.find()) {
            System.out.println("Valid");
        } else {
            System.out.println("Not valid");
        }

    }
}
