import java.util.*;

public class Insertion_Sort {
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
		Insertion_Sort ins = new Insertion_Sort();
		ins.sort(array,size);
		System.out.println("Ascending order of array is - ");
		ins.print(array,size);
	}
	void sort(int array[],int size)
	{
		int i,j;
		for(i=1;i<size;++i)
		{
			int key = array[i];
			j = i-1;
			while(j >= 0 && array[j] > key)
			{
				array[j+1] = array[j];
				j = j-1;
			}
			array[j+1] = key;
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
