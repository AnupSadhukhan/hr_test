
import java.util.*;
import java.lang.*;
import java.io.*;

public class CandidateCode{
	public static void  main(String[] args) throws Exception{
		/*
		 * int end=128; int bit=7 ; for(int i=0;i<end;i++) { String
		 * bin=Integer.toBinaryString(i); //String.format("%0"+ (6 - bin.length()
		 * )+"d",0 ); String format=""; if(bin.length()!=bit) {
		 * format=String.format("%0"+ (bit - bin.length() )+"d",0 ); }
		 * System.out.println(i+" -> "+format+bin); }
		 */
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] vmx=br.readLine().trim().split("\\s");
		int v=Integer.parseInt(vmx[0]);
		int m=Integer.parseInt(vmx[1]);
		int x=Integer.parseInt(vmx[2]);
		long endWithZero[]=new long[x+1];
		long endWithOne[] = new long[x+1];
		endWithOne[0]=1;
		endWithZero[0]=1;
		long withoutCons1[]=new long[x];
		long sum=0;
		if(v==1 ) {
			System.out.println("1");
			return;
		}
		for(int i=1;i<x+1;i++) {
			endWithZero[i] = (endWithZero[i-1] + endWithOne[i-1]);
	        endWithOne[i] = endWithZero[i-1];
	        withoutCons1[i-1]=(endWithZero[i-1] + endWithOne[i-1]);
	        //System.out.println(withoutCons1[i-1]);
		}
		while(m<=x) {
			long n=(withoutCons1[m-1]-v+1);
			sum=sum+(n*(n+1)/2);
			sum%=1000000007;
			m++;
		}
		System.out.println(sum);
		//adding comment
		 
	}
	
}