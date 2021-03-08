import java.util.*;

public class Linear_Search 
{
	public static void main(String[] args)
	{
		int i=0,size,result;
		int[] arr = new int[40];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array - ");
		size = sc.nextInt();
		System.out.println("Enter the elements - ");
		for(i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the element to find - ");
		int x = sc.nextInt();
		result = search(arr,size,x);
		if(result == -1)
		{
			System.out.println("Element not found");
		}
		else
		{
			System.out.print("Element found at "+result);
		}
	}

	static int search(int arr[], int size, int x)
	{
		for(int i=0;i<size;i++)
		{
			if(arr[i] == x)
				return i;
		}
	return -1;
	}
}
