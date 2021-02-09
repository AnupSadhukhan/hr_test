package com.wipro;
import java.io.*;
import java.util.*;
import java.lang.*;

class Stock{
	float price;
	float profit;
	Stock(float price,float profit){
		this.price=price;
		this.profit=profit;
	}
}
public class Solution {

	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    int n=Integer.parseInt(br.readLine().trim());
		    String[] arr=br.readLine().trim().split("\\s");
		    printNotFunny(arr,n);
		}
	}
	public static void printNotFunny(String[] arr,int n){
	    HashSet<String> set=new HashSet<String>();
	    int count=0;
	    for(int i=0;i<n;i++){
	        set.add(arr[i]);
	    }
	    for(int i=0;i<n;i++){
	        for(int j=i+1;j<n;j++){
	            if(arr[i].charAt(0)==arr[j].charAt(0)){
	                continue;
	            }
	            else{
	                String s1=arr[i].charAt(0)+arr[j].substring(1,arr[j].length());
	                String s2=arr[j].charAt(0)+arr[i].substring(1,arr[i].length());
	                if(!set.contains(s1) && !set.contains(s2)){
	                    count+=2;
	                }
	            }
	        }
	    }
	    System.out.println(count);
	    
	} 
	
	 
}
