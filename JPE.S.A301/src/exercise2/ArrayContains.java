package exercise2;


/**
 *@author AnhNT241
 */
public class ArrayContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String stringArray[] = {"FPT","Fresher","Acedemy","2018"};
		String s1= "Fresher";
		for(int i =0; i<stringArray.length; i++)
		{
			if(stringArray[i] == s1)
			{
				System.out.println("Có trong mảng");
				break;
			}
		}
	}

}
