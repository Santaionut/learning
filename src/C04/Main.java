package C04;

import static java.lang.System.gc;

public class Main {

    public static void main(String[] args) {

        System.out.println("helolo");
        Apple apple = new Apple("rosu", true);
        apple.checkIn();

        new Apple("verde",true);

        gc();

    }
}
