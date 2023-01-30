package com.bridgelabz.regexday19;
import java.util.Scanner;
import java.util.*;
public class RegestrationMain {

    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        UserRegistrationUcCases person = new UserRegistrationUcCases();

        System.out.println("Enter the First Name: " );
        String FirstName = sc.next();
        System.out.println(person.isValidUsername(FirstName));

        System.out.println("Enter the Last Name: " );
        String LastName = sc.next();
        System.out.println(person.isValidUsername(LastName));

        System.out.println("Enter the Email: " );
        String email = sc.next();
        System.out.println(person.isValidEmail(email));

        System.out.println("Enter the Mobile number: " );
        String mobileNumber = sc.next();
        System.out.println(person.isValidMobileFormat(mobileNumber));

        System.out.println("Enter the password: " );
        String password = sc.next();
        System.out.println(person.isValidPassword(password));
    }
}
