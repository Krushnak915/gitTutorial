package practice;

public class construct {
int id;
String name;
int age;
	   construct(int i,String n) {
		id=i;
		name=n;
	
}
 construct(int i,String n,int j) {
	 id=i;
	 name=n;
	 age=j;
}
 void display() {
 System.out.println(id+" "+name+" "+age);}
	public static void main(String[] args) {
	construct kk=new construct(11,"ram");
	construct kk2=new construct(11,"ram",25);
		kk.display();
		kk2.display();
		}

	}

