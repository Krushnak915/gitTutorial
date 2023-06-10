 package practice;
import java.util.Arrays;
//import java.util.Arrays;
import java.util.Scanner;
public class pracice_array {

	public static void main(String[] args) {
	int a[]=new int[5];
		System.out.println("enter array element");
		Scanner k=new Scanner(System.in);
			for(int i=0;i<5;i++) {
				a[i]=k.nextInt();}
			
			System.out.println("Array element");
			for(int b:a) {
				System.out.println(b+" ");
			Arrays.sort(a);
			}
			k.close();
	System.out.println("number length "+a.length);
		}
	
		}	
    