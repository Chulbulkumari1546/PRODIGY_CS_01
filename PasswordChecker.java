//PASSWORD COMPLEXITY CHECKER
import java.util.Scanner;
public class PasswordChecker {
        public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    boolean resumeChecking;
                    do {
                        System.out.println("Enter a password to check its strength:-");
                        String password = sc.nextLine();

                        int strength = checkingPasswordStrength(password);

                        switch (strength) {
                            case 1:
                                System.out.println("Password is weak.");
                                break;
                            case 2:
                                System.out.println("Password is moderate.");
                                break;
                            case 3:
                                System.out.println("Password is strong.");
                                break;
                            case 4:
                                System.out.println("Password is very strong");
                            default:
                                System.out.println("Invalid password.");
                        }

                        System.out.println("Do you want to check another password? (yes/no)");
                        String choice = sc.nextLine();
                        resumeChecking = choice.equalsIgnoreCase("yes");

                    } while (resumeChecking);

                    System.out.println("Thank you for using this Password Strength Checker.");
                    sc.close();
                }
                public static int checkingPasswordStrength(String password) {
                    // Simple logic to check password strength
                    if (password.length() < 6) {
                        return 1; // Weak password
                    } else if (password.length() < 8) {
                        return 2; // Moderate password
                    } else if (password.length() < 10) {
                        return 3; // Strong password
                    } else {
                        return 4;// Very Strong password
                    }
                }}

