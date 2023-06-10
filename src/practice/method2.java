package practice;
public class method2 {
static  int c;
 static void add() 
{
	int a=2,b=3;
	c=a+b;
	System.out.println(c);
	}

void Disp() 
{
	System.out.println("welcome in method program");
	}
 public static void main(String []a) 
{
    
	int mult=1;
	method2 r=new method2();
	r.Disp();
	
	add();
System.out.println("table");
	for(int i=1;i<=10;i++) {
mult=c*i;
System.out.println(mult);
}
			}

//--------------------------------------------------
/*class B {
 int i=10;}
class method2 extends B{
	int i=40;
	void show(int i) {
		System.out.println(this.i);
	}

public static void  main(String []arg) {
	method2 ob=new method2();
	ob.show(2);
}*/
//--------------------------------------------------
/*	public static void main(String[] args) {
		method2 m=new method2();
		m.Sum();
		}
	void Sum(){
			System.out.println("method");
*/
//---------------------------------------------------
	/*public static void main(String[] arg) {
		int arr[]= {33,3,1,5};
		for( int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);}
	int min=arr[0];
		for( int i=0;i<arr.length;i++) 
			if(min>arr[i]) 
				min=arr[i];
	
	System.out.println("minumum is: "+min);
	}	
	*/
 		}
