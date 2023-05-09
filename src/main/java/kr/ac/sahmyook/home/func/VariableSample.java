package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class VariableSample {

    public void myProfile(){
        String name = "홍길동";
        int age = 20;
        String[] hobby = {"축구", "농구", "독서"};

        System.out.println("======= My Profile =======");
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.print("hobby = ");
        for (String s : hobby){
            System.out.print(s+ " ");
        }
        System.out.println();
        System.out.println("===========================");
        System.out.println();
    }


    public void empInformation(){
        Scanner sc = new Scanner(System.in);
        String name = "";
        int age = 0;

        System.out.println("이름을 입력하세요. ");
        name = sc.nextLine();
        System.out.println("나이를 입력하세요. ");
        age = sc.nextInt();

        System.out.println("======== employ Information ======== ");
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("======================================");
        System.out.println();
    }
}
