import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Numbers {
	  
	public static int nextLargest(int array[], int n) 
	    { 
	        int nextLargestElement = -1;
	        
	      for (int i = 0; i < array.length; i++)  
	      {
	    	  if (array[i] > n) 
	    	    {
	    		  nextLargestElement = array[i];
	    	break;
	      }
	      }
	       return nextLargestElement;
	       
	      }
	       
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int size;
		int array[];
		int sortedArray[];
				
		System.out.print("Please specify the size of the array you would like");
		size = scan.nextInt();
		array = new int[size];
		sortedArray = new int[size];
		
		System.out.print("Please enter the numbers.");
		
		for(int i = 0; i < size; i++)
		{ array[i] = scan.nextInt();
			sortedArray[i] = array[i];
		}
		
		Arrays.sort(sortedArray);
		int max = Arrays.stream(array).max().getAsInt();
		
		for (int i = 0; i < size; i++)
		{
			int nextLargestElement = nextLargest(sortedArray, array[i]);
		if(nextLargestElement != -1)
		{
			System.out.println(array[i] + " : " + nextLargestElement);
		}
		else
		{
			System.out.println(array[i]);
		}
		if(nextLargestElement > max)
		{
			System.out.print("MAX_VALUE");
		}
		}
	
	}		
	
  }


		
		
		
		
	
		
		
		
		