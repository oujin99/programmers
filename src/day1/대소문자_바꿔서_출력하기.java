package day1;

import java.util.Scanner;

public class 대소문자_바꿔서_출력하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";
        
        char[] charArr = a.toCharArray();
        System.out.println("charArr .. " + charArr);
        for(char i: charArr) {
        	System.out.println("i" + i);
            if(Character.isUpperCase(i)){
            	result += Character.toLowerCase(i);
            } else {
            	result += Character.toUpperCase(i);
            }
        }
        
        System.out.println("결과@" + result);

	}

}
