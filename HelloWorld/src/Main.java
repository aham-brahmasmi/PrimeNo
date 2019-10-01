import java.util.Scanner;
public class Main{    
	 
	public static void main(String args[]){    
	  int i,m=0,flag=0;      
	  int n=in.nextInt();//it is the number to be entered by the user
	  m=(n/2)+1;      
	  
	  if(n==0||n==1)
	  {  
	   System.out.println(n+" is not the prime number");      
	  }
		else
		{  
	   for(i=2;i<=m;i++)
	   {      
	    if(n%i==0){      
	     System.out.println(n+" is prime number");      
	     flag=1;      
	     break;      
	    
	   }      
	   if(flag==0)  { System.out.println(n+" is the prime number"); }  
	  }//end of else  
} 
