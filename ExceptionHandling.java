
public class ExceptionHandling {

	public static void main(String[] args)
	{
	
		try {
		SimCard	s1 = new SimCard(9986408508l,"vodafone", "nano");
			System.out.println("sim card is "+s1);
			
		}
		catch (MobileNumberLessDigitsError e) 
		{
			System.out.println("Exception "+e);
		}
		catch (MobileNumberMoreDigitsError e)
		{
			System.out.println("error "+e);
		}
		
		try {
			SimCard	s2 = new SimCard(9886408508l,"tata", "nano");
				System.out.println("sim card is "+s2);
				
			}
			catch (MobileNumberLessDigitsError e) 
			{
				System.out.println("Exception "+e);
			}
			catch (MobileNumberMoreDigitsError e)
			{
				System.out.println("error "+e);
			}
		
		try {
			SimCard	s3 = new SimCard(9586408508l,"jio", "nano");
				System.out.println("sim card is "+s3);
				
			}
			catch (MobileNumberLessDigitsError e) 
			{
				System.out.println("Exception "+e);
			}
			catch (MobileNumberMoreDigitsError e)
			{
				System.out.println("error "+e);
			}
		
		MobilePhone m1=new MobilePhone();
		MobilePhone m2=new MobilePhone();
		MobilePhone m3=new MobilePhone();	
	

	}

}
class MobilePhone
{
//	void call(SimCard s) {
//		System.out.println("Calling via mobile number"+s.mobileNum);
	}
}
class SimCard
{
    long mobileNum;
	String company;
	String type;
	
	public SimCard(long mobileNum, String company , String type) throws MobileNumberLessDigitsError, MobileNumberMoreDigitsError
	{
		super();
		System.out.println("Sim card cons started......");
		int lengthOfNum=String.valueOf(mobileNum).length();
		if(lengthOfNum <10)
		{
			throw new MobileNumberLessDigitsError("Mobile number length should not be less than 10 digits");
		}
		else if (lengthOfNum>10)
		{
			throw new MobileNumberMoreDigitsError("Mobile number length should not be more than 10 digits");
		}
		
		else
			this.mobileNum = mobileNum;
			System.out.println("Sim card cons ended");
		
		
		this.company = company;
		this.type = type;
	}


	@Override
	public String toString() {
		return "MobilePhone [mobileNum=" + mobileNum + ", brand=" + company + ", model=" + type + "]";
	}
	
	
	
	
}
class MobileNumberLessDigitsError extends Exception
{
	MobileNumberLessDigitsError(String s)
	{
		super(s);
	}
	
}
class MobileNumberMoreDigitsError extends Exception
{
	MobileNumberMoreDigitsError(String s)
	{
		super(s);
	}
	
}