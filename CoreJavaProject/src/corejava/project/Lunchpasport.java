package corejava.project;
import java.util.*;
import java.util.Map.Entry;
import java.util.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

class Information
{
	private String name;
	private int age;
	private String fatherName;
	private String city;
	
	Information(String name, int age, String fatherName,String city)
	{
		this.name=name;
		this.age=age;
		this.fatherName=fatherName;
		this.city=city;
		
	}
	public String getname()
	{
		return name;
	}
	public int getage()
	{
		return age;
	}
	public String getfatherName()
	{
		return fatherName;
	}
	public String getcity()
	{
		return city;
	}
	@Override
	public String toString()
	{
		return name+"  "+age+"  "+fatherName+"  "+city;
	}
	
}


public class Lunchpasport {

	public static void main(String[] args) 
	{
	

		Information info1=new Information("himanshu",21,"sunil singh","saran");
		Information info2=new Information("sohan",25,"sachin singh","bishnupura");
		Information info3=new Information("lalita ",32,"mohan","bangal");
		
		
		HashMap hm2=new HashMap();
		hm2.put(123, info1);
		hm2.put(132, info2);
		hm2.put(143, info2);
		
		System.out.println("Welcome to Passport details APP");
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the passport Number");
		Integer k=scan.nextInt();
			
			
			
			Set em2=hm2.entrySet();
			Iterator it=em2.iterator();
			while(it.hasNext())
			{
				Map.Entry passport=(Entry)it.next();
				Integer key=(Integer) passport.getKey();
				if(k==key)
			{
				System.out.println(passport.getValue());
			}
			}
		}
	}
	
