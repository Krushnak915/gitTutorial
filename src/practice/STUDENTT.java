package practice;

import java.util.Arrays;

class STUDENTT{
	public static void main(String []args) {
	int n[]= {1,3,5,2,4,6};
	
	for(int i=0;i<n.length;i++) {	
	System.out.print(n[i]+" ");
	}
	System.out.println();
	
	System.out.println("assending ");
	for(int i=0;i<n.length;i++) {	
	Arrays.sort(n);
	System.out.print(n[i]+" ");
	
	}System.out.println();
	
	int temp=0;
	for(int i=0;i<n.length;i++) {	
	for(int j=i+1;j<n.length;j++) {
		if(n[i]<n[j]) {
			temp=n[i];
			n[i]=n[j];
			n[j]=temp;
	}	}}System.out.println("descending"); 
	
	    for(int i=0;i<n.length;i++) {
	System.out.print( n[i]+" ");  
	    }
		}
}