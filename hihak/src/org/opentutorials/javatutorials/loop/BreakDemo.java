package org.opentutorials.javatutorials.loop;
 
public class BreakDemo {
 
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            if (i == 5)
//                break;
//            System.out.println("Coding Everybody " + i);
    	for(int i = 0; i<100000000; i++) {
    		if (i == 50)
    			break;
    		System.out.println("브레이크 테스트 " + i);
    		
        }
 
    }
 
}