package Sum;

import java.util.*;       

public class SumOfNumber
{
	public static void main(String[] args)   
	{
		
		int IN;      
//It is a int variable which store number input by User 
		int n = 0;    
//It is a int variable to count aliquot sum of input numbers given by user
		
		System.out.println("Please Enter the number to find Aliquot Sum:-");
		
		Scanner sc=new Scanner(System.in);       
		
		IN=sc.nextInt();  
//Initializing input number variable by user 
		
		for(int i = 1 ; i < IN/2 + 1 ; i++) 
// Start of for loop to count sum
		{
			if(IN % i == 0)         
			{
				n+=i;        
			}
		}
		
		if(n == IN)
		{
		       System.out.println("The value of aliquot Sum is "+n+" :- A perfect number");
		}
		else 
		{
			System.out.println("The value of aliquot Sum "+n+" :- Not A perfect number");
			{
		System.out.println("Perfect numbers between 1 and 100 are :-");
		{
		for(int i = 2 ; i < 100 ; i++)  
//For loop to iterate through 1-100
		{
			int N=0;   
//It is a int variable to count the aliquot sum of given numbers
			
			for(int j=1 ; j <= i/2 + 1 ; j++)      
			{
				if(i % j == 0)
					N += j;        
			}
			
			if(N == i)        
				System.out.println(i);
		}
		
		sc.close();           
	}   
} 
		       }
}
}		



