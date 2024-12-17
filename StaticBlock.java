//Static block
class StaticBlock
{
	static
	{
		System.out.println("This is static block....!!");
	}
	static void message()
	{
		System.out.println("This is static method....!!!");
	}	
}
public class StaticBlockDemo
{
	public static void main(String args[])
	{
		StaticBlock obj=new StaticBlock();
	}
}