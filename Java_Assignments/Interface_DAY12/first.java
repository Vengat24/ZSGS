package Interface_DAY12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*1. Define an interface named Sortable with a method sort().
 *Implement this interface in classes representing different
 *sorting algorithms such as bubble sort, quicksort, and merge
 *sort. Allow the user to input an array, select a sorting 
 *algorithm, and display the sorted array.*/

interface Sortable{
	void sort(int[] nums);
}
class BubbleSort implements Sortable{
	public void sort(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i] > nums[j]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
	}
}
class SelectionSort implements Sortable{
	public void sort(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			int minIndex = i;
			for(int j=i+1;j<nums.length;j++) {
				if(nums[minIndex] > nums[j]) {
					minIndex = j;
				}
			}
			if(minIndex!=i) {
				int temp = nums[i];
				nums[i] = nums[minIndex];
				nums[minIndex] = temp;
			}
		}
		
		
	}
}
class InsertionSort implements Sortable{
	public void sort(int[] nums) {
		for(int i=1;i<nums.length;i++) {
			int j=i;
			while(j>0 && nums[j] < nums[j-1]) {
				int temp = nums[j];
				nums[j] = nums[j-1];
				nums[j] = temp;
				j--;
			}
		}
		
	}
}
class QuickSort implements Sortable{
	public void sort(int[] nums) {
		quickSort(nums,0,nums.length-1);
	}
    void quickSort(int arr[], int low, int high)
	    {
	        if(low>high){
	            return;
	        }
	        int partition = partition(arr,low,high);
	        quickSort(arr,low,partition-1);
	        quickSort(arr,partition+1,high);
	    }
	int partition(int arr[], int low, int high)
	    {
	        int i=low;
	        int j=high;
	        int pivet= low;
	        while(i<j){
	            while(i<=high && arr[i]<arr[pivet]) {
	                i++;
	            }
	            while(j>=low && arr[j]>arr[pivet]) {
	                j--;
	            }
	            if(i<j){
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }
	        int temp = arr[j];
	        arr[j] = arr[pivet];
	        arr[pivet] = temp;
	        return j;
	    }
	
}
class MergeSort implements Sortable{
	public void sort(int[] nums) {
		mergeSort(nums,0,nums.length-1);
		
	}
	void merge(int arr[], int l, int m, int r)
    {
        int left=l;
        int right=m+1;
        List<Integer> list = new ArrayList<>();
        while(left<=m&&right<=r){
            if(arr[left]<=arr[right])
                list.add(arr[left++]);
            else
                list.add(arr[right++]);
        }
        while(left<=m){
            list.add(arr[left++]);
        }
        while(right<=r){
            list.add(arr[right++]);
        }
        for(int i=l;i<=r;i++){
            arr[i] = list.get(i-l);
        }
    }
    void mergeSort(int arr[], int l, int r)
    {
        if(l==r)
            return;
        int mid=(l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
}

public class first {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter No of Elements : ");
		int n = obj.nextInt();
		System.out.print("Enter the Elements : ");
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = obj.nextInt();
		}
		System.out.println("---------------------------------------");
		System.out.println("1)Bubble Sort");
		System.out.println("2)Selection Sort");
		System.out.println("3)Insertion Sort");
		System.out.println("4)Quick Sort");
		System.out.println("5)Merge Sort");
		System.out.println("Choose the Sorting Algorithm : ");
		int ch = obj.nextInt();
		switch(ch) {
			case 1: new BubbleSort().sort(arr);
					break;
			case 2: new SelectionSort().sort(arr);
				break;
			case 3: new InsertionSort().sort(arr);
				break;
			case 4: new QuickSort().sort(arr);
				break;
			case 5: new MergeSort().sort(arr);
				break;
			default :
				System.out.println("Invalid Option!");
		}
		for(int num:arr) {			
			System.out.print(num +" ");
		}
		int a=10;
		int b=8;
		int c=2;
		System.out.println(a - (b+c));
		System.out.println(a - b+c);
		
		
	}

}
