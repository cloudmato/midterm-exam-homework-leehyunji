package kr.ac.sahmyook.home.func;

import java.util.HashMap;
import java.util.Scanner;

public class IfSample {

    public void maxNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("=========== 큰 값 구하기 ===========");

        System.out.println("비교할 숫자 중 첫번째 숫자를 입력해 주세요 : ");
        int a = sc.nextInt();
        System.out.println("비교할 숫자 중 두번째 숫자를 입력해 주세요 : ");
        int b = sc.nextInt();
        System.out.println("두 수 중 큰 값 : " + Math.max(a, b));
        System.out.println("===================================");
        System.out.println();
    }

    public void minNumber(){
        Scanner sc = new Scanner(System.in);

        System.out.println("=========== 작은 값 구하기 ===========");
        System.out.println("비교할 숫자 중 첫번째 숫자를 입력해 주세요 : ");
        int a = sc.nextInt();
        System.out.println("비교할 숫자 중 두번째 숫자를 입력해 주세요 : ");
        int b = sc.nextInt();
        System.out.println("두 수 중 작은 값 : " + Math.min(a, b));
        System.out.println("===================================");
        System.out.println();
    }

    public void threeMaxMin(){
        Scanner sc = new Scanner(System.in);

        System.out.println("=========== 세 개의 정수 비교하기 ===========");
        System.out.println("비교할 숫자 중 첫번째 숫자를 입력해 주세요 : ");
        int a = sc.nextInt();
        System.out.println("비교할 숫자 중 두번째 숫자를 입력해 주세요 : ");
        int b = sc.nextInt();
        System.out.println("비교할 숫자 중 세번째 숫자를 입력해 주세요 : ");
        int c = sc.nextInt();
        System.out.println("큰 값 : " + Math.max(Math.max(a, b) , c));
        System.out.println("작은 값 : " + Math.min(Math.min(a, b) , c));
        System.out.println("============================================");
        System.out.println();
    }
    public void checkEven(){
        Scanner sc = new Scanner(System.in);

        System.out.println("============== 홀/짝 구분하기 ==============");
        System.out.println("홀/짝을 구분할 정수를 입력하세요. ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("짝수입니다.");
        }else System.out.println("홀수입니다.");
    }

    public void isPassFail(){
        HashMap<String, Integer> sH = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("========== 합/불합 확인하기 ==========");
        System.out.print("국어 점수를 입력하세요 : ");
        sH.put("국어", Integer.parseInt(sc.nextLine()));

        System.out.print("영어 점수를 입력하세요 : ");
        sH.put("영어", Integer.parseInt(sc.nextLine()));

        System.out.print("수학 점수를 입력하세요 : ");
        sH.put("수학", Integer.parseInt(sc.nextLine()));

        int sum = sH.values().stream().reduce(0, Integer::sum);
        if ((sum / 3) < 60) System.out.println("평균 점수 미달로 불합격입니다.");

        for(String s : sH.keySet()){
            sum += sH.get(s);
            if(sH.get(s) < 40) {
                System.out.println(s + "점수 미달로 불합격입니다.");
            }
        }
        System.out.println("===================================");
        System.out.println();
    }

    public void scoreGrade(){
        Scanner sc = new Scanner(System.in);

        System.out.println("========== 학점 확인하기 ==========");
        System.out.println("점수를 입력해 주세요. : ");
        int score = sc.nextInt();
        String grade = "";
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >=60) {
            grade ="D";
        } else grade = "F";

        System.out.println("해당 점수에 대한 등급은 " + grade + "입니다.");
        System.out.println("====================================");
        System.out.println();
    }

    public void checkPlusMinusZero(){
        Scanner sc = new Scanner(System.in);

        System.out.println("============ 양수, 0, 음수 확인하기 ============");
        System.out.println("확인할 정수를 입력하세요. : ");

        int num = sc.nextInt();

        if(num > 0){
            System.out.println("양수입니다.");
        } else if (num < 0) {
            System.out.println("음수입니다.");
        } else if (num == 9) {
            System.out.println("0입니다.");
        }

        System.out.println("==============================================");
        System.out.println();
    }

    public void whatCaracter (){
        Scanner sc = new Scanner(System.in);

        System.out.println("========== 문자 확인하기 ==========");
        System.out.println("확인할 문자를 입력하세요. : ");
        char c = sc.nextLine().charAt(0);

        if (c >= 97 && c <= 122){
            System.out.println("소문자입니다.");
        } else if (c >= 65 && c<= 90) {
            System.out.println("대문자입니다.");
        } else System.out.println("기타문자입니다.");
        System.out.println("=================================");
        System.out.println();
    }
}
