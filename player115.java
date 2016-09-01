package guvi;

public class player115 {
	public static void main(String args[]) {
	int n=125;
	int tmp,a,b,sum=0;
	tmp=n;
	while(tmp!=0){
		a=tmp%10;
		b=a*a;
		sum=sum+b;
		tmp=tmp/10;
	}
	
	System.out.println(sum);
	
	
	
	
	
	
	
	}
}
