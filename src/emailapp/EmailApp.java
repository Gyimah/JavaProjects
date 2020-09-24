package emailapp;

public class EmailApp {

  public static void main(String[] args) {
    Email email1 = new Email("John", "Gyimah");

    email1.setAlternateEmail("john.gee@jeezy.com");
    System.out.println("Alternate Email is: " + email1.getAlternateEmail());
  }
}

