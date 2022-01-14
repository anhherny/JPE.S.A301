package exercise4;

/**
 *@author AnhNT241
 */
public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myIntArray[] = {43, 32, 53, 23, 12, 34, 3, 12, 43, 32};
		System.out.print("Mảng gốc: ");
		for(int i=0;i<myIntArray.length;i++)
		{
			System.out.print(myIntArray[i]+" ");
		}
		System.out.println();
		System.out.print("Mảng đảo ngược: ");
		for(int i=myIntArray.length-1;i>=0;i--)
		{
			System.out.print(myIntArray[i]+" ");
		}
	}

}
