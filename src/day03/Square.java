package day03;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
			
		
			int x;
			int y;
			double area;
			double round;
			Scanner sc = new Scanner(System.in);
			System.out.print("사각형의 가로를 입력하시오 : ");
			x = sc.nextInt();
			System.out.print("사각형의 세로를 입력하시오 : ");
			y = sc.nextInt();
			area = x*y;
			round = 2.0*(x+y);
			System.out.print("사각형의 넓이는 : " + area);
			System.out.print("사각형의 둘레는 : " + round);
	}

}
