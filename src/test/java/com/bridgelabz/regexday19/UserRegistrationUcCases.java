package com.bridgelabz.regexday19;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistrationUcCases {

    public static boolean isValidUsername(String name)
    {
        String regex = "^[A-Za-z]{3,24}$";
        Pattern p = Pattern.compile(regex);
        if (name == null) {
            return false;
        }
        Matcher m = p.matcher(name);
        return m.matches();
    }
    public static boolean isValidEmail(String email) {
        String regex = "^(.+)@(.+)$";
        Pattern p = Pattern.compile(regex);
        if (email == null) {
            return false;
        }
        Matcher m = p.matcher(email);
        return m.matches();
    }
    public static boolean isValidMobileFormat(String mobileNumber) {
        String regex =   "(0|91)?[6-9][0-9]{9}$";
        Pattern p = Pattern.compile(regex);
        if (mobileNumber == null){
            return false;
        }
        Matcher m = p.matcher(mobileNumber);
        return m.matches();
    }
    public static boolean isValidPassword(String password) {
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[@#!$%^&()+-])(?=\\S+$).{8,20}$";
        Pattern p = Pattern.compile(regex);
        if (password == null){
            return false;
        }
        Matcher m = p.matcher(password);
        return m.matches();
    }
}
