//Greatest of 3 numbers

import java.util.Scanner;
public class GreatestOfThreeNum
{
	void getMaxNum(int x,int y,int z)
	{
		if(x>y)
		{
			if(x>z)
			System.out.print(x+" is greater the "+y+" and "+z);
		else if(
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the three values: ");
		int num1=in.nextInt();
		int num2=in.nextInt();
		int num3=in.nextInt();
		GreatestOfThreeNum gots=new GreatestOfThreeNum();
		gots.getMaxNum(num1,num2,num3);
	}
}
