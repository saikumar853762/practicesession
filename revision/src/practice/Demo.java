package practice;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Demo 
{

	 public static List<Customer> customerAll()
     {
    	 SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
    	 List<Customer> list=new ArrayList<Customer>();
    	 File f=new File("F:\\myproject-maven\\rivisionhandson\\customer.txt");
    	
    	 try {
			BufferedReader br=new BufferedReader(new FileReader(f));
			String str=br.readLine();
			while(str!=null)
			{
				 Customer c=new Customer();
					Address ad=new Address();
				
				String [] a=str.split(",");
				c.setCustid(Integer.parseInt(a[0]));
				c.setCustname(a[1]);
				c.setEmail(a[2]);
				c.setPhno(a[3]);
				c.setDob(sdf.parse(a[4]));
				ad.setCity(a[5]);
				ad.setState(a[6]);
				ad.setCountry(a[7]);
				c.setAddress(ad);
				list.add(c);
				str=br.readLine();
			}
			return list;
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
    	 return null;
    
    	 
     }
	 public static void dispalyByAge(int agedd)
	 {
		 List<Customer> cl=customerAll();
		 ArrayList al=new ArrayList();
		 for(Customer c:cl)
		 {
		 Date d=new Date();
		 int date=d.getYear()+1900;
		 int date1=c.getDob().getYear()+1900;
		 int age=date-date1;
		 if(age==agedd || age<agedd)
		 {
		System.out.println(c.getCustname());
		 }
		 else
		 {
			
		 }
		 }
		
	 }
	 public static void displayByCountry(String state)
	 {
		 List<Customer> l1=customerAll();
		for(Customer c:l1)
		{
		if(c.getAddress().getState().equals(state))	
		{
			System.out.println(c);
		}
		}
		 
	 }
 public static void main(String[] args) 
 {
	while(true)
	{
		System.out.println("select \n 1.Display All Customers \n 2.Display By Age \n 3.Display By Country \n 4.Exit");
		Scanner in=new Scanner(System.in);
		int i=in.nextInt();
		
		
		switch(i)
		{
		case 1:
			List<Customer> l=customerAll();
			System.out.println(l);
			break;
		case 2:
			System.out.println("enter the age");
			int age=in.nextInt();
			dispalyByAge(age);
		//	System.out.println(cl1);
			break;
		case 3:
			System.out.println("enter the state");
			String state=in.next();
			displayByCountry(state);
			break;
		case 4:
			System.out.println("exit");
			System.exit(0);
		}
	}
}
}
