import java.util.*;

public class Loops {
    public static void main(String[] args) {
        //Ex13
        int i = 10;
        while (i > 0) {
            System.out.println("i is: " + i);
            i -= 2;
        }

        //Ex14
        String s = "This is a string";
        char c[] = new char[s.length()];

        int a = 0;
        while (a < s.length()) {
            c[a] = s.charAt(a);
            a++;
        }

        System.out.println(new String(c));

        c = new char[s.length()];

        for (int b = 0; b < s.length(); b++) {
            c[b] = s.charAt(b);
        }

        System.out.println(new String(c));
        
        //Ex15
        double sum = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter double: ");
            if (sc.hasNextDouble()) {
                sum += sc.nextDouble();
            } else {
                break;
            }
        }
        

        System.out.printf("The total of the doubles entered was: %f", sum);
    }
}