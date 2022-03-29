
public class Dial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimCard1 sc1=new SimCard1(1234,"vodafone","nano");
		SimCard1 sc2=new SimCard1(3456,"idea","micro");
		SimCard1 sc3=new SimCard1(5678,"jio","micro");
		MobilePhone1 mp1=new MobilePhone1();
		MobilePhone1 mp2=new MobilePhone1();
		MobilePhone1 mp3=new MobilePhone1();
		mp1.call(sc1);
		mp2.call(sc2);
		mp3.call(sc3);
		Thread t1=new Thread(mp1);
		Thread t2=new Thread(mp2);
		Thread t3=new Thread(mp3);
		t1.start();
		t2.start();
		t3.start();
		
		
		
		

	}

}
class MobilePhone1 extends Thread 
{
	void call(SimCard1 s)
	{
		
		for(int i=1; i<20;i++)
		{
			System.out.println("calling via sim "+s.company1+" for "+i+"time");
		}
	}
}
class SimCard1
{
	long mobileNum1;
	String company1;
	String type1;
	public SimCard1(long mobileNum1, String company1, String type1) {
		super();
		this.mobileNum1 = mobileNum1;
		this.company1 = company1;
		this.type1 = type1;
	}
	@Override
	public String toString() {
		return "SimCard1 [mobileNum1=" + mobileNum1 + ", company1=" + company1 + ", type1=" + type1 + "]";
	}
	
	
}
