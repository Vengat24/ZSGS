package Workouts;

import java.util.*;

public class sample {
    public static void main(String[] args) {
    	int arr[] = new int[] {9,7,8,6,4,5,3,2,1};
    	for(int num:arr) {
    		System.out.print(num+" ");
    	}
    	System.out.println();
    	quickSort(arr,0,arr.length-1);
    	for(int num:arr) {
    		System.out.print(num+" ");
    	}
//    	int n = arr.length;
//    	Scanner obj = new Scanner(System.in);
//        System.out.println(sub(0,"abc","abc",new StringBuilder()));
        }
    
    
    public static void diamondPattern(String[] args) {
		Scanner obj = new Scanner(System.in);
		int n=obj.nextInt();
		int mid = n;
		for(int i=0;i<n*2;i++) {
			int x=i%n;
			for(int j=0;j<n*2;j++) {
				if(i<n &&j>mid-x-1 && j<mid+x) {
					System.out.print(" ");
				}else if(i>=n ){
						if(j<=x || n*2-x<=j+1) {
							System.out.print("*");
						}else {
							System.out.print(" ");
						}
					
				}else
					System.out.print("*");
			}
			System.out.println();
		}
		
	}
    public static void selectionSort(int arr[]) {
    	for(int i=0;i<=arr.length-2;i++) {
    		int mini = i;
    		for(int j=i+1;j<arr.length;j++) {
    			if(arr[j]<arr[mini]) {
    				mini=j;
    			}
    		}
    		int temp = arr[i];
    		arr[i] = arr[mini];
    		arr[mini] = temp;
    	}
    }
    public static void bubbleSort(int arr[])
    {
        for(int i=arr.length-1;i>=1;i--){
            int swap=0;
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap=1;
                }
            }
            if(swap==0){
                break;
            }
        }
    }
    public void insertionSort(int arr[])
    {
        for(int i=0;i<arr.length;i++){
            int j=i;
            while(j>0&&arr[j-1]>arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
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
    static void quickSort(int arr[], int low, int high)
    {
        if(low>high){
            return;
        }
        int partition = partition(arr,low,high);
        quickSort(arr,low,partition-1);
        quickSort(arr,partition+1,high);
    }
    static int partition(int arr[], int low, int high)
    {
        int i=low;
        int j=high;
        int pivet= low;
        while(i<j){
            while(i<=high && arr[i]>arr[pivet]) {
                i++;
            }
            while(j>=low && arr[j]<arr[pivet]) {
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
    
    public static boolean sub(int i,String s,String t,StringBuilder check){
        if(i>=t.length()){
            return false;
        }
        if(s.equals(new String(check))){
            return true;
        }
        check.append(t.charAt(i));
        if (sub(i + 1, s, t, check)) {
            return true;
        }
        check.deleteCharAt(check.length()-1);
        return sub(i+1,s,t,check);

    }
    public static void powerSet(int n,int arr[], List<List<Integer>> list) {
    	for(int i=0;i<n*n-1
    			;i++) {
    		List<Integer> out = new ArrayList<>();
    		for(int num=0;num<n;num++) {
    			if((i&(1<<num)) !=0) {
    				out.add(arr[num]);
    			}
    		}
    		list.add(out);
    	}
    	System.out.println(list);
    }
    public static void subSq(int i,int arr[],List<Integer> list,int n) {
    	if(i>=n) {
    		System.out.println(list);
    		return;
    	}
    	list.add(arr[i]);
    	subSq(i+1,arr,list,n);
    	list.remove(list.size()-1);
    	subSq(i+1,arr,list,n);
    }
    
    public static int fibo(int n) {
    	if(n<=1)
    		return n;
    	return fibo(n-1)+fibo(n-2);
    }
    public static boolean isPalin(int i,String str) {
    	if(i>=str.length()/2)
    		return true;
    	if(str.charAt(i) != str.charAt(str.length()-i-1))
    		return false;
    	return isPalin(i+1,str);
    }
    
    public static void rev(int i,int[] arr,int n) {
    	if(i>n/2)
    		return;
    	int temp = arr[i];
    	arr[i] = arr[n-i-1];
    	arr[n-i-1] = temp;
    	rev(i+1,arr,n);
    }
    
    
    
    public static int sum(int n) {
    	if(n==0)
    		return 0;
    	return n + sum(n-1);
    }
    public static int fact(int n) {
    	if(n==1)
    		return 1;
    	return n * fact(n-1);
    }
    public static void fact(int i,int prod) {
    	if(i==0) {
    		System.out.println(prod);
    		return;
    	}
    	fact(i-1,prod*i);
    }
    public static void sum(int i,int sum) {
    	if(i==0) {
    		System.out.println(sum);
    		return;
    	}
    	sum(i-1,sum+i);
    }
}
