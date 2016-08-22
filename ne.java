package guvi;

import java.util.Scanner;

public class ne {
	public static void main(String arg[]){
		int arr[]=new int[6];
		Scanner ff=new Scanner(System.in);
		for(int i=0;i<6;i++){
			arr[i]=ff.nextInt();
		}
		int b=6,a=0;
		int ss[]=new int[6];
		int out[]=new int[6];
	for(int i=0;i<5;i++){
		for(int j=i+1;j<b;j++){
			ss[a]=arr[j];
			a++;
		}
		for(int h=0;h<a;h++){
			//System.out.println("aaaa"+ss[h]);
		}
		for(int q=0;q<a;q++){
			for(int w=q+1;w<a;w++){
				if(ss[q]>ss[w]){
					int tmp=ss[q];
					ss[q]=ss[w];
					ss[w]=tmp;
				}
			}
		}
		out[i]=ss[a-1];
		
		a=0;
		
	}
	
	for(int s=0;s<6;s++){
	System.out.println(out[s]);
	}
	
	
	
	}
}
