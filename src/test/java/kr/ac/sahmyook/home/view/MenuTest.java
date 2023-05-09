package kr.ac.sahmyook.home.view;
import java.util.Scanner;


class MenuTest {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int no = 0;
    char isExit = 'y';

    do {
        System.out.println("***** 프로그래밍 기본 기능 테스트 프로그램 *****");
        System.out.println(
                "1. 변수 테스트\n" +
                        "2. 기본 자료형 테스트\n" +
                        "3. if문 테스트\n" +
                        "4. switch문 테스트\n" +
                        "5. for문 테스트\n" +
                        "6. while문 테스트\n" +
                        "7. do~while문 테스트\n" +
                        "8. break문 테스트\n" +
                        "9. continue문 테스트\n" +
                        "10. static 메소드 사용 테스트\n" +
                        "11. non-static 메소드 사용 테스트\n" +
                        "12. 프로그램 종료\n" +
                        "메뉴 번호 입력 : ");
        no = sc.nextInt();

        switch (no) {
            case 1:
                System.out.println("1");
                break;

            case 12:
                System.out.println("정말로 종료하시겠습니까? (예:y/아니오:n)");
                isExit = sc.next().charAt(0);
                if (isExit == 'y' || isExit == 'Y') {
                    System.out.println("안녕히가세요");
                    System.exit(0);

                } else if (isExit == 'n' || isExit == 'N') {
                    break;
                }

            default:


        }
    } while(true);


}}