import java.io.*;
import java.util.*;
import java.lang.*;

public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(bf.readLine().trim());
		long[] arr=new long[n];
		String str=bf.readLine().trim();
		int i=0;
		for(String s : str.split("\\s")) {
			arr[i]=Integer.parseInt(s);
			//System.out.print(arr[i]+" ");
			i++;
		}
		long[][] mat=new long[n][n];
		long max=Long.MIN_VALUE;
		for(i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				//System.out.print(arr[j]*arr[n-i-1]+" ");
				mat[i][j]=arr[j]*arr[n-i-1];
				if(i>0 && j>0) {
					mat[i][j]= Math.max(mat[i][j], mat[i][j]+mat[i-1][j-1]);
				}
				max=Math.max(mat[i][j], max);
				
				
			}
			//System.out.println();
		}
		
		/*for(i=0;i<n;i++) {
			for(int j=0;j<n;j++) { 
				System.out.print(mat[i][j]+" ");
			}
		 System.out.println(); 
		 }
		*/
		System.out.println(max);
		
	}
	

}
