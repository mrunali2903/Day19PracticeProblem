package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Uc3 {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("^[a-z]*.[a-z]+@[a-z]+.[a-z]{2,3}(.[a-z]{2})*$");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Mail");
        String keyName = scanner.nextLine();

        Matcher matcher = pattern.matcher(keyName);
        if (matcher.matches()) {
            System.out.println("Mail is valid");
        } else {
            System.out.println("Mail is Not valid");
        }
    }
}

