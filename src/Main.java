import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите слово или число: ");
        String input = scanner.nextLine();

        String registr = input.replaceAll("\\s", "").toLowerCase();


        boolean Palindroma = true;
        for (int i = 0; i < registr.length() / 2; i++) {
            if (registr.charAt(i) != registr.charAt(registr.length() - 1 - i)) {
                Palindroma = false;
                break;
            }
        }
        if (Palindroma) {
            System.out.println("Это палиндрома");
        } else {
            System.out.println("Это не палиндрома.");
        }
        scanner.close();
    }
}
