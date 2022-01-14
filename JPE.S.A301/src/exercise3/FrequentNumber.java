package exercise3;

import java.util.Scanner;

/**
 *@author AnhNT241
 */
public class FrequentNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner sn = new Scanner(System.in);
		System.out.print("Nhập n: ");
		int n=sn.nextInt();
		int a[] = new int[n];
		System.out.println("Nhập mảng : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print("a["+i+"] =");
			a[i]= sn.nextInt();
		}
		System.out.print("Các phần tử trong mảng: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] +" ");
		}
		System.out.println();
		int dem=0;
		System.out.print("Nhập x: ");
		int x=sn.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(x==a[i])
			{
				dem++;
				System.out.println("Vị trí xuất hiện: "+i);
			}
		}
		System.out.println(" Số lần xuất hiện của là:"+dem);
		
	}

}
