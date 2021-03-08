import java.util.*;

public class Binary_Search {
	public static void main(String[] args)
	{
		Binary_Search bin = new Binary_Search(); 
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
		result = bin.search(arr,0,size-1,x);
		if(result == -1)
		{
			System.out.println("Element not found");
		}
		else
		{
			System.out.print("Element found at "+result);
		}
	}
	
	int search(int arr[], int left, int right, int x)
	{
		if(right >= left)
		{
			int mid = left + (right - left)/2;
			if(arr[mid] == x)
				return mid;
			if(arr[mid] > x)
				return search(arr,left,mid-1,x);
			else
				return search(arr,mid+1,right,x);
		}
		return -1;
	}
}
