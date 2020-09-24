package emailapp;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Email {
    private String firstname;
    private String lastname;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private String companySuffix = "mycompany.com";

    // Constructor to receive first name and last name

    public Email (String firstName, String lastName){
        this.firstname = firstName;
        this.lastname = lastName;
        System.out.println("Email Created is :" + this.firstname + " " + this.lastname);

        // Call a method asking for a department to return the department
        this.department = setDepartment();
        System.out.println("Department is: " + this.department);

        // Call a method to return a random password
        this.password = setRandomPasssowrd(8);
        System.out.println("Password is: " + this.password);

        // Combine element to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." +companySuffix;
        System.out.println("Your Email is: " + email);

    }

    // Ask for department
    private String setDepartment(){
        System.out.print("DEPARTMENTS CODES\n 1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter Department\n");
        Scanner inp = new Scanner(System.in);
        int depChoice = inp.nextInt();

        switch (depChoice){
            case 1:
                return "Sales";
            case 2:
                return "Development";
            case 3:
                return "Accounting";
            default:
                return "";

        }
    }

    // Generate random password
    private String setRandomPasssowrd(int length){
        String passwordSet = "qazxswedcvfrtgbnhyujmkilop1234567890!@#$%&*(";
        char[] password = new char[length];
        for (int i=0; i<length; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);

    }

    // set mailbox capacity
    public void setCapacity (int capacity){
        this.mailboxCapacity = capacity;
    }

    // set alternate email
    public void setAlternateEmail (String altemail){
        this.alternateEmail = altemail;
    }

    // reset password
    public void changePassword (String password){
        this.password = password;
    }

    public int getMailboxCapacity(){
        return mailboxCapacity;
    }

    public String getAlternateEmail(){
        return alternateEmail;
    }

    public String getPassword(){

        return password;
    }
}
