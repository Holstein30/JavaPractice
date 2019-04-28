public class SwitchStatement {

    public static void switchChars(char letter) {
        switch (letter) {
            case 'a':
                System.out.println("A");
                break;
            case 'b':
                System.out.println("B");
                break;
            case 'c':
                System.out.println("C");
                break;
            case 'd':
                System.out.println("D");
                break;
            default:
                System.out.println("Not A, B, C, or D");
                break;
        }
    }
}
