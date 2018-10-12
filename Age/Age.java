import java.util.Scanner;
public class Age {
    public static void main(String[] args) {
        //Ex5-6
        Scanner sinput = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sinput.nextInt();
        int doubleAge = age * 2;
        System.out.println(
        "How old? That's half way to " +
        doubleAge + "!");
    }
}