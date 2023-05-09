package kr.ac.sahmyook.home.func;

public class BreakSample {

    public void sumBreak(){
        int sum = 0;
        int i = 1;
        while(true) {
            if (i != 101){
                sum += i;
                i++;}
            else break;
        }
        System.out.println("sum = " + sum);
    }
    public void guguDanBreak(){
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++) {
                if(j == 5) break;
                System.out.println(i + " x " + j + " = " + i*j);
            }
            System.out.println();
        }
    }
}
