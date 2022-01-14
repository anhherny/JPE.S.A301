package exercise1;

/**
 *@author AnhNT241
 */
public class SumAverageRunningInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<=100;i++)
		{
			sum+=i;
		}
		System.out.println("Trung bình tất cả 100 số đầu tiên: "+sum/100);
	}

}
