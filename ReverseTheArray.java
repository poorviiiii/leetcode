import java.util.*;
public class ReverseTheArray {
	public static void reverseArray(int arr[]) {
		int start=0;
		int end=arr.length-1;
		while(start<end) {
		   swap(arr,start,end);
		   start++;
		   end--;
		}
	}
	public static void swap(int arr[],int i,int j ) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static void main(String args[]) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		reverseArray(arr);
		System.out.println(Arrays.toString(arr));
		
	}

}