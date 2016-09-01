package guvi;

public class player154 {
	public static void main(String args[]) {
	String s="shilpa";
	String sub=s.substring(1,2);
	String out="";
	for(int i=0;i<s.length();i++){
		char c=s.charAt(i);
		String c1=String.valueOf(c);
		if(i==1){
			out=out+(c1.toUpperCase());
		}
		else{
			out=out+c1;
		}
	}
	System.out.println(out);
	}
}
