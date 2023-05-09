package kr.ac.sahmyook.home.func;

public class StaticMethodSample {

    public void testMathRandom(){
        int random = (int)((Math.random()*45)+1);
        System.out.println("random = " + random);
    }
    
    public void testMathAbs(){
        double num = Math.abs(-12.77);
        System.out.println("num = " + num);
    }
    public void testMathMax(){
        System.out.println("Math.max(120, 54) = " + Math.max(120, 54));
    }
}
