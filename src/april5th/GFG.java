package april5th;
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc= new Scanner(System.in);
		int noTestCases=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<noTestCases;i++){
			String x=sc.nextLine();
			int count=0;
			boolean flag=true;
			for(int k=1;k<x.length();k++){
				if(!(x.charAt(k-1)==x.charAt(k))){
					flag=false;
					break;
				}
			}
			
			if(!flag){
				for(int i1=x.length()/2-1, j=x.length()-1;i1>=0 && j>=0;i1--){
					
					if(x.charAt(i1)==x.charAt(j)){
						j--;
						count++;
						
					}
					else{
						count=0;
						j=x.length()-1;
					}
					
					
				}
				
				System.out.println(count);
				
			}
			
			else
				System.out.println(x.length()-1);
			
			
			
			
		}
	}
}