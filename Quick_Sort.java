import java.util.*;

public class Quick_Sort {
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
		Quick_Sort quick = new Quick_Sort();
		quick.sort(array,0,size-1);
		System.out.println("Ascending order of array is - ");
		quick.print(array,size);
	}
	int partition(int array[],int low,int high)
	{
		int pivot = array[high];
		int i = (low-1);
		for(int j=low;j<high;j++)
		{
			if(array[j] <= pivot)
			{
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		int temp = array[i+1];
		array[i+1] = array[high];
		array[high] = temp;
		return i+1;
	}
	void sort(int array[],int low,int high)
	{
		if(low < high)
		{
			int part = partition(array,low,high);
			sort(array,low,part-1);
			sort(array,part+1,high);
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
