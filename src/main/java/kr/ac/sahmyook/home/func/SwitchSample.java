package kr.ac.sahmyook.home.func;

import java.util.HashMap;
import java.util.Scanner;

public class SwitchSample {
    public void calculator(){
        Scanner sc = new Scanner(System.in);

        System.out.println("=========== 계산기 ============");

        System.out.println("첫 번째 숫자를 입력하세요. : ");
        int fistNum = sc.nextInt();

        System.out.println("두 번째 숫자를 입력하세요. : ");
        int secondNum = sc.nextInt();

        System.out.println("연산자를 입력하세요. : ");
        String operator = sc.next();

        System.out.print("결과 : ");

        switch (operator) {
            case "+" :
                System.out.println(fistNum + secondNum);
                break;
            case "-" :
                System.out.println(fistNum - secondNum);
                break;
            case "/" :
                System.out.println(fistNum / secondNum);
                break;
            case  "%" :
                System.out.println(fistNum % secondNum);
                break;
            case "*" :
                System.out.println(fistNum * secondNum);
                break;
            default:
                System.out.println("입력하신 연산은 없습니다. ");
        }
        System.out.println("============================");
        System.out.println();
    }
    public void fruitPrice(){
        System.out.println("======== 과일 가격 학인하기 ========");
        HashMap<String, Integer> sH = new HashMap<>();
        sH.put("사과", 1000);
        sH.put("바나나", 3000);
        sH.put("복숭아", 2000);
        sH.put("키위", 5000);

        Scanner sc = new Scanner(System.in);

        System.out.print("과일 이름을 입력하세요 : ");
        String inputFruit = sc.nextLine();

        if(sH.containsKey(inputFruit)){
            System.out.println(inputFruit + "의 가격은 " + sH.get("바나나") + "원 입니다.");
        }
        else System.out.println("준비된 상품이 없습니다."); System.exit(0);
        System.out.println("========================");
        System.out.println();
    }
}
