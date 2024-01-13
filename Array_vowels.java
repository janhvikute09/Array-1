//q 1:-
import java.util.*;
public  class Array_vowels
{
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	char char_arr[]=new char[5];
	System.out.println(" enter elements");
	for(int i=0;i<char_arr.length;i++)
	{
		char_arr[i]=sc.next().charAt(0);
	}

	int count=0;

	for(int i=0;i<char_arr.length;i++)
	{
		if (char_arr[i]=='a'||char_arr[i]=='e'||char_arr[i]=='i'||char_arr[i]=='o'||char_arr[i]=='u')
		{
		count++;	
		}
	}



	System.out.println("the number of vowels in  given array is  :" +count);
	
}



}