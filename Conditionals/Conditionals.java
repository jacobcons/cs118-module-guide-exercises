public class Conditionals {
    public static void main(String[] args) {
        //Ex11
        byte a = 4;
        switch(a) {
            case 1:
            case 2:
                System.out.println("a is one or two");
                break;
            case 3:
                System.out.println("a is three");
                break;
            default:
                System.out.println("a is neither one, two or three");
        }

        //Ex12
        if (a == 5 || a == 7 || a == 8) {
            System.out.println("a is five, seven or eight");
        } else if (a == 1) {
            System.out.println("a is 1");
        } else if (a == 2) {
            System.out.println("a is 2");
        } else {
            System.out.println("a is something else");
        }
    }
}