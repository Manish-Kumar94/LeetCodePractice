import java.util.Scanner;

class FirstProgram {
    public static void main(String[] args) {
        System.out.print("Enter your Name: ");

        String Name = "";
        try (Scanner sc = new Scanner(System.in)) {
            Name = sc.nextLine();
        }

        System.out.println("\n\nHello "+Name);
    }
}