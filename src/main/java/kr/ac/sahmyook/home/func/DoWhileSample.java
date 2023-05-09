package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class DoWhileSample {

    public void addDashToken(){
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요. : ");
        String input = sc.nextLine();
        sc.close();

        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            output.append(input.charAt(i));
            if (i != input.length() - 1) {
                output.append('-');
            }
        }
        System.out.println("결과: " + output.toString());
    }
    public void burgerKingMenu(){

    }
    public void isStringAlphabet(){
        Scanner sc = new Scanner(System.in);
        String input;
        boolean isAllAlpha = true;

        do {
            System.out.print("문자열을 입력하세요: ");
            input = sc.nextLine();

            for (int i = 0; i < input.length(); i++) {
                if (!(input.charAt(i) >= 'a' && input.charAt(i) <= 'z') &&
                        !(input.charAt(i) >= 'A' && input.charAt(i) <= 'Z')) {
                    isAllAlpha = false;
                    break;
                }
            }

            if (!isAllAlpha) {
                System.out.println("모든 글자가 영문자가 아닙니다.");
            }

        } while (!isAllAlpha);

        System.out.println("모든 글자가 영문자입니다.");
        sc.close();
        }
    }
