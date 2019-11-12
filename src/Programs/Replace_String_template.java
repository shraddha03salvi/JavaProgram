package Programs;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;



public class Replace_String_template {

	public static void ReplaceString(String str, String name, String fullName,String Monum) 
	{
	  SimpleDateFormat simpledateformat = new SimpleDateFormat("dd/MM/yyyy");
	  String date = simpledateformat.format(new Date());
	  
	  String strReplaceAll = str.replaceAll("<<name>>",name);
	  strReplaceAll = strReplaceAll.replaceAll("<<fullName>>",fullName);
	  strReplaceAll = strReplaceAll.replaceAll("xxxxxxxxxx",Monum);
	  strReplaceAll =  strReplaceAll.replaceAll("01/01/2015",date);
	  System.out.println(strReplaceAll);
		
	}
	public static void main(String[] args) {
		String str =  "Hello <<name>>,\nWe have your full name as <<fullName>> in our system."
				+ "\nyour contact number is 91-xxxxxxxxxx. Please,"
				+ " let us know \nin case of any clarification Thank you BridgeLabz 01/01/2015.";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();
		System.out.println("ENter your fullName");
		String fullName = sc.nextLine();
		System.out.println("Enter your Mobile number");
		String Monum = sc.nextLine();
		
		ReplaceString(str,name,fullName,Monum);
	        
	}

}
