package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class NonStaticMethodSample {

    public void testScanner(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Character : ");
        char c = sc.nextLine().charAt(0);
        System.out.println("Integer : ");
        int i = sc.nextInt();
        System.out.println("short : ");
        short s = sc.nextShort();
        System.out.println("long : ");
        long l = sc.nextLong();
        System.out.println("float : ");
        float f = sc.nextFloat();
        System.out.println("double : ");
        double d = sc.nextDouble();

        System.out.println("c = " + c);
        System.out.println("i = " + i);
        System.out.println("s = " + s);
        System.out.println("l = " + l);
        System.out.println("f = " + f);
        System.out.println("d = " + d);

    }
    public void testRandom(){

        int randomInt = (int) (Math.random() * 10);
        System.out.println("Random Integer: " + randomInt);


        double randomDouble = Math.random();
        System.out.println("Random Double: " + randomDouble);
    }
}
