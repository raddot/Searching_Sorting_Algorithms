import java.util.*;

public class Heap_Sort {
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
		Heap_Sort heap = new Heap_Sort();
		heap.sort(array,size);
		System.out.println("Ascending order of array is - ");
		heap.print(array,size);
	}
	void sort(int array[],int size)
	{
		int i;
		for(i=size/2-1;i>=0;i--)
			heapify(array,size,i);
		for(i=size-1;i>=0;i--)
		{
			int temp = array[0];
			array[0] = array[i];
			array[i] = temp;
			heapify(array,i,0);
		}
	}
	void heapify(int array[],int size,int i)
	{
		int largest = i;
		int l = 2*i + 1;
		int r = 2*i + 2;
		if(l < size && array[l] > array[largest])
			largest = l;
		if(r < size && array[r] > array[largest])
			largest = r;
		if(largest != i)
		{
			int swap = array[i];
			array[i] = array[largest];
			array[largest] = swap;
			heapify(array,size,largest);
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
