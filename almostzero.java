package guvi;

import java.util.Scanner;

public class almostzero {
	public static void main(String arg[]){
		int arr[]=new int[5];
		Scanner ff=new Scanner(System.in);
		for(int i=0;i<5;i++){
			arr[i]=ff.nextInt();
		}
		int a=0;
		int c[]=new int[50];
		int ch[]=new int[15];

	for(int j=0;j<5;j++){
		for(int k=0;k<5;k++){
			if(arr[j]!=arr[k]){
				c[a]=arr[j]+arr[k];
				
				a++;
			}
		}
	}
	
	
	for(int h=0;h<a;h++){
		//System.out.println("aaaa"+c[h]);
	}
	
	for(int q=0;q<a;q++){
		for(int w=q+1;w<a;w++){
			if(c[q]>c[w]){
				int tmp=c[q];
				c[q]=c[w];
				c[w]=tmp;
			}
		}
	}
	int output=0,output1=0,output2=0;
	for(int h=0;h<a;h++){
		//System.out.println("aaaa"+c[h]);
		if(c[h]>=-6 && c[h]<=5){
			output=c[h];
			//System.out.println(output);
		}
	}
	for(int j=0;j<5;j++){
		for(int k=0;k<5;k++){
			if(arr[j]!=arr[k]){
				c[a]=arr[j]+arr[k];
				if(c[a]==output){
					output1=arr[j];
					output2=arr[k];
					//System.out.println(output1);
					//System.out.println(output2);

				}
				a++;
			}
		}
	}
	System.out.println(output1+" "+output2);
	}
}
