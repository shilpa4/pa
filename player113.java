package guvi;

public class player113 {
	public static void main(String args[]) {
	String str="01/07/2000";int count=0;
	for(int i=0;i<str.length();i++){
		char c=str.charAt(i);
	if(c>=48 && c<=57){	
	count++;
	}
	else if(c==47){	
		if(i==2 || i==5){
		count++;
		}
		}
	else{
		
	}
	}
	
	if(count==10){
		System.out.println("true");
	}
	else{
		System.out.println("false");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
