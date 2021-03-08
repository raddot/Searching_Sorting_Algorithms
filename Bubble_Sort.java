import java.util.*;

public class Bubble_Sort {
	public static void main(String[] args)
	{
		int i,choice,size;
		int[] array = new int[40];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array - ");
		size = sc.nextInt();
		System.out.println("Enter the elements - ");
		for(i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
		}
		Bubble_Sort bubb = new Bubble_Sort();
		bubb.sort(array,size);
		System.out.println("Ascending order of array is - ");
		bubb.print(array,size);
	}
	
	void sort(int array[], int size)
	{
		int i,j,temp;
		for(i=0;i<size-1;i++)
		{
			for(j=0;j<size-i-1;j++)
			{
				if(array[j] > array[j+1])
				{
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
	void print(int array[],int size)
	{
		for(int i=0;i<size;++i)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
}