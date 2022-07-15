package javacode;

public class SomeOtherClass {

    private static int privateVar = 6;

    public static void main(String[] args) {
        new SomeClass().someOtherMethod();
    }

    public static void accesivePrivateVar() {
        System.out.println("Heey: " + privateVar);
    }

}
