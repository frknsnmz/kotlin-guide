package section06.javacode06;

public class SwitchExample {

    public static void main(String[] args) {

        int num = 200;
        switch(num) {
            case 100:
                System.out.println("100");
                break;
            case 200:
                System.out.println("200");
                break;
            default:
                System.out.println("not matched");

        }
    }
}
