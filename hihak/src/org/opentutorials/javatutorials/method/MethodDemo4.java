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
        // �ѹ����̶�� �Է� �޼ҵ带 ȣ��.
    	// �Է¿� ���� ��°��� �޶�����.
    	numbering(1111111111);
        
    }
}