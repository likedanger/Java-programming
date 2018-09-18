package day03;
import java.util.*;
public class InputString {

	public static void main(String[] args) {
				String name;
				int age;
				String phone_number;
				
				Scanner sc = new Scanner(System.in);
				System.out.print("이름을 입력하시오:");
				name = sc.nextLine();
				
				
				System.out.print("나이를 입력하세요 : ");
				age = sc.nextInt();
				
				Scanner sv = new Scanner(System.in);
				System.out.print("번호를 입력하시오 : ");
				phone_number = sv.nextLine();
				
				System.out.println(name + "님 안녕하세요 !" + (age) + "살이시네요! 연락처는 : " + phone_number + "입니다");
	}

}
