package practice;

//import java.util.Arrays;

public class arraypract {

	public static void main(String[] args) {
		int n=5;
		int alphbet=65;
System.out.println("---alphabet sandglass---");
		for(int i=1;i<=n;i++) 
		{
		for(int j=1;j<=i;j++) 
		{
		System.out.print(" ");
		}
		for(int j=i;j<=n;j++) 
		{
		System.out.print((char)(alphbet+i)+" ");
		}
		System.out.println();
		} 
		for(int i=1;i<=n;i++) {
		for (int j=i;j<=n;j++)
		 {
		System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
		System.out.print((char)(alphbet+j)+" ");	
		}
		System.out.println();

		}

		System.out.println("----squre--------------"); 
       //int n=5; 
		for(int i=1;i<=n;i++) {
			for (int j=1;j<=n;j++)
			 {
				if(i==1 ||j==n||i==j) {
	
					System.out.print("* ");
	}else {
		System.out.print("  ");	
			
	}}
				System.out.println();
		}

	}
	}