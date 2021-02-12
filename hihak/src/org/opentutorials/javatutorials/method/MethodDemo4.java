package org.opentutorials.javatutorials.method;
 
public class MethodDemo4 {
    public static void numbering(long limit) {
        long i = 0;
        while (i < limit) {
            System.out.println(i);
            i++;
        }
    }
 
    public static void main(String[] args) {
        // 넘버링이라는 입력 메소드를 호출.
    	// 입력에 따른 출력값도 달라진다.
    	numbering(1111111111);
        
    }
}