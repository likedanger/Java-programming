package day03;

import java.util.Scanner;

public class mini_project {

	public static void main(String[] args) {
			
		double F;
		double C;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("화씨 온도를 입력하시오 : ");
		F = sc.nextDouble();
		C = 5*(F-32)/9;
		System.out.print("섭씨 온도는 : " + C);
	}

}
