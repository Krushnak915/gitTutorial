package practice;

public class student {
String stname="john";
int st_name=2;
String st_batch="IT";
public void getst_detail() {
	System.out.println("-----------student detail---------");
	System.out.println("STUDENT NAME "+stname);
	System.out.println("STUDENT ROLL NO "+st_name);
	System.out.println("STUDENT BATCH "+st_batch);
} 
 
	public static void main(String[] args) {
	student ste = new student();
	ste.getst_detail();
	}
 }
	
