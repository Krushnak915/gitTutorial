package practice;

public class dog {
    String name;
    String size;
    int age;
    String color;
    public String getInfo(){
   return ("name is "+name+"\nsize is "+size+"\nage is "+age+"\ncolor "+color);
    }
	public static void main(String[] args) {
	dog maltese=new dog();
		maltese.name="moti";
		maltese.size="small";
		maltese.age=3;
		maltese.color="black";
		System.out.println(maltese.getInfo());
				
	}
	}