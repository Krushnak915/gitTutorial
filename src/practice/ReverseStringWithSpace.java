package practice;

public class ReverseStringWithSpace 
{
public static void main(String[] args)
{
String s="this program are reverse string with Space";
String s1=s;
String result=new String();
int chr=0;
for(int i=s.length()-1;i>=0;i--) 
{
	if(s1.charAt(chr)==' ') 
	{
	result +=" ";	
	chr++;
	}
	if(s.charAt(i)==' ') 
	{
	--i;	
	}
	result=result+s.charAt(i);
	chr++;}
System.out.println(" "+result);
	}

}
