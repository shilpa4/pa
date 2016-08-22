package guvi;

import java.util.Scanner;

public class oddstring {
	public static void main(String arg[]){

		String str,str1="";
		Scanner ff=new Scanner(System.in);
	str=ff.nextLine();
	String s1[]=str.split(" ");

	String out[]=new String[s1.length];
System.out.println(s1.length);
	for(int i=0;i<s1.length;i++){
		if(i==0 || i%2==0){ 
		StringBuffer rr=new StringBuffer(s1[i]);
		rr.reverse();
		String aa=new String(rr);
		out[i]=aa;
		//System.out.println(out[i]);
		}
		else{
			out[i]=s1[i];
		}
	}
	for(int k=0;k<s1.length;k++){
		str1=str1+" "+out[k];
	}
	
	System.out.println(str1);
	
	
	
	
	
	
	}
}
