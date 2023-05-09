package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class ForSample {

    public void sum1To10(){
        int sum = 0;
        for(int i = 1; i <= 10; i++ ){
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
    
    public void sumEven1To100(){
        int sum = 0;
        for(int i = 1; i < 100 ; i++){
            if(i % 2 == 0){
                sum += i;
            }
        }
        System.out.println("sum = " + sum);
    }
    public void oneGugudan(){
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 입력하세요: ");
        int num = sc.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

    }
    public void sumMinToMax(){
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 정수를 입력하세요: ");
        int a = sc.nextInt();

        System.out.println("두 번째 정수를 입력하세요: ");
        int b = sc.nextInt();

        int min = Math.min(a, b);
        int max = Math.max(a, b);
        int sum = 0;

        for (int i = min; i <= max; i++) {
            sum += i;
        }

        System.out.println("sum = " + sum);
    }
    public void printStar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("출력할 줄 수를 입력하세요: ");
        int rows = sc.nextInt();

        System.out.println("출력할 칸 수를 입력하세요: ");
        int cols = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void printNumberStar(){
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (j == i) {
                    System.out.print(i);
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
    public void printTriangleStar(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("출력할 줄 수를 입력하세요: ");
        int rows = scanner.nextInt();

        if (rows > 0) {
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        } else {
            for (int i = rows; i <= -1; i++) {
                for (int j = 1; j <= -i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
    public void guguDan(){
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
            System.out.println();
        }
    }
}
