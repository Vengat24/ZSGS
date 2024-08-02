package Test;

import java.util.Scanner;

public class fourth {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter Number of Elements : ");
		int n=obj.nextInt();
		System.out.print("Enter Elements : ");
		int nums[] = new int[n];
		for(int i=0;i<n;i++) {
			nums[i] = obj.nextInt();
		}
		System.out.print("Enter Target : ");
		int target = obj.nextInt();
		System.out.println("Index : " + binary(nums,target));
	}
	static int binary(int[] nums,int target){
		int start = 0;
		int end = nums.length-1;
		while(start<=end) {
			int mid = (start+end)/2;
			if(nums[mid] == target) {
				return mid;
			}else if(nums[mid]<target) {
				start = mid+1;
			}else {
				end = mid-1;
			}
		}
		return start;
	}

}
