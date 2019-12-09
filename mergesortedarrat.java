package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class mergearray {
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of 1st array");
		int n=sc.nextInt();
		int arr[]=new int [n];
		System.out.println("Enter the size of 2nd array");
		int m=sc.nextInt();
		int arr1[]=new int[m];
		System.out.println("Enter the elements of 1st array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the Elements of 2nd array");
		for(int i=0;i<m;i++) {
			arr1[i]=sc.nextInt();
		}
		int arr2[]=new int[n+m];
		int k=0;
		int s=n+m;
		for(int i=0;i<n;i++) {
			arr2[k]=arr[i];
			k++;
		}
		for(int i=0;i<m;i++) {
			arr2[k]=arr1[i];
			k++;
		}
		Arrays.sort(arr2);
		for(int i=0;i<s;i++) {
			System.out.println(arr2[i]);
		}
	}
}
