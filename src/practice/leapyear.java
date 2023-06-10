package practice;
import java.util.Scanner;
public class leapyear {
	public static void main(String[] args) {
	int y;
	System.out.println("enter any year");
	Scanner k=new Scanner(System.in);
	y=k.nextInt();
	if(y%400==0||y%4==0) {
		System.out.println("leap year");
	}else {
		System.out.println("not leap year");
	}
	k.close();
	}
}
