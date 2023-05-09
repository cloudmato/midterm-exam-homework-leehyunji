package kr.ac.sahmyook.home.func;

public class ContinueSample {

    public void sumJumpThree(){
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                continue; 
            }
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
    public void rowColJump(){
        int[][] arr = new int[3][5];
        for(int i = 0; i < 3; i++ ){
            for (int j = 0; j < 5; j ++){
                if(j == 1 && j >=2 && j <= 4 ){
                    continue;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
