package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class WhileSample {

    public void printUniCode(){
        Scanner sc = new Scanner(System.in);
        System.out.println("========== 유니코드 출력 ==========");
        char c = sc.next().charAt(0);
        int uni = 0;
        while(c != '0') {
            uni = c;
            System.out.println("입력한 문자 " + c +"의 유니코드 : " + uni);
            c = sc.next().charAt(0);
        }
        System.out.println("==================================");
        System.out.println();
    }
    public void sum1To100(){
        System.out.println("========== 100까지의 합 ==========");
        int i = 1;
        int sum = 0;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println("결과 : " + sum);
        System.out.println("==================================");
        System.out.println();
    }
    public void numberGame(){
        Scanner sc = new Scanner(System.in);

        System.out.println("========== 숫자 알아맞추기 ==========");
        int answer = (int)((Math.random() * 100) + 1);
        int input = 0;

        while(input != answer){
            System.out.println("숫자를 입력하세요");
            input = sc.nextInt();

            if (input == answer) {
                System.out.println("정답입니다!");
            } else {
                System.out.println("틀렸습니다.");
            }
        }
        System.out.println("====================================");
        System.out.println();
    }
    public void countCharacter(){
        Scanner sc = new Scanner(System.in);

        System.out.println("=========== 글자 갯수 알아내기 ===========");
        System.out.println("문자열을 입력하세요.");
        String s = sc.nextLine();
        System.out.println("글자의 갯수는 " + s.length() + "입니다.");
        System.out.println("=======================================");
        System.out.println();
    }

    public void countInChar(){
        Scanner sc = new Scanner(System.in);

        System.out.println("====== 문자개수 확인하기 ======");
        System.out.println("문자열을 입력하세요. : ");
        String s = sc.nextLine();

        System.out.println("문자를 입력하세요. : ");
        char c = sc.next().charAt(0);

        int count = 0;
        int i = 0;

        while (i < s.length()) {
            if (s.charAt(i) == c) {
                count++;
            }
            i++;
        }

        System.out.println("문자열 \"" + s + "\"에는 문자 \'" + c + "\'가 " + count + "개 있습니다.");
        System.out.println("==============================");
        System.out.println();
    }
}
