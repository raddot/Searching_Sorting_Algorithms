import java.util.*;
public class Selection_Sort {
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
		Selection_Sort sel = new Selection_Sort();
		sel.sort(array,size);
		System.out.println("Ascending order sort is - ");
		sel.print_asc(array,size);
	}
	
	void sort(int array[],int size)
	{
		int i;
		for(i=0;i<size-1;i++)
		{
			int min_index = i;
			for(int j=i+1;j<size;j++)
			{
				if(array[j] < array[min_index])
					min_index = j;
			}
			int temp = array[min_index];
			array[min_index]=array[i];
			array[i]=temp;
		}
	}
	
	void print_asc(int array[],int size)
	{
		for(int i=0;i<size;++i)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
}
