package lr1;

import java.util.Scanner;
public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int current_year = java.time.Year.now().getValue();
        System.out.println("Input the year of birth: ");
        int birth_year = in.nextInt();
        int age1 = current_year - birth_year;
        int age2 = age1 - 1;
        System.out.printf("Your age: %d-%d", age2, age1);
        in.close();
    }
}