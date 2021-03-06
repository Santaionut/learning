package C03;

import java.util.Random;

public class BitManipulation {

    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt();
        int j = random.nextInt();

        printBinaryInt("-1", -1);
        printBinaryInt("+1",+1);

        int maxpos = 2147483647;
        printBinaryInt("maxpos", maxpos);
        int maxneg = -2147483648;
        printBinaryInt("maxneg", maxneg);

        printBinaryInt("i", i);
        printBinaryInt("~i", ~i);
        printBinaryInt("-i", -i);
        printBinaryInt("j", j);
        printBinaryInt("i & j", i & j);
        printBinaryInt("i | j", i | j);

        printBinaryInt("i ^ j", i ^ j);
        printBinaryInt("i << 5", i << 5);
        printBinaryInt("i >> 5", i >> 5);
        printBinaryInt("(~i) >> 5", (~i) >> 5);
        printBinaryInt("i >>> 5", i >>> 5);
        printBinaryInt("(~i) >>> 5", (~i) >>> 5);

        long l = random.nextLong();
        long m = random.nextLong();
        printBinaryLong("-1L", -1L);
        printBinaryLong("+1L", +1L);
        long ll = 9223372036854775807L;
        printBinaryLong("maxpos", ll);
        long lln = -9223372036854775808L;
        printBinaryLong("maxneg", lln);
        printBinaryLong("l", l);
        printBinaryLong("~l", ~l);
        printBinaryLong("-l", -l);
        printBinaryLong("m", m);
        printBinaryLong("l & m", l & m);
        printBinaryLong("l | m", l | m);
        printBinaryLong("l ^ m", l ^ m);
        printBinaryLong("l << 5", l << 5);
        printBinaryLong("l >> 5", l >> 5);
        printBinaryLong("(~l) >> 5", (~l) >> 5);
        printBinaryLong("l >>> 5", l >>> 5);
        printBinaryLong("(~l) >>> 5", (~l) >>> 5);




    }

    static void printBinaryInt(String s, int i){
        System.out.println( s+ ", int: "+ i+ ", binary: ");
        for (int j = 31; j >= 0 ; j++) {
            if(((1 << j) & i) != 0)
                System.out.print("1");
            else
                System.out.print("0");
            System.out.println();
        }
    }

    static void printBinaryLong(String s, long l){
        System.out.println( s+ ", long: "+ l+ ", binary: ");

        for (int i = 63; i >=0 ; i++) {
            if(((1L << i) & l ) !=0)
                System.out.print("1");
            else
                System.out.print("0");
            System.out.println();
        }
    }

}
