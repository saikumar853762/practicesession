package practice;
import java.text.ParseException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class Mapexample
{

	public static void main(String[] args) throws ParseException 
	{
		System.out.println("Enter your choice \n 1.Load projects \n 2.Display by projectId \n 3.Display by prpject domain \n 4.exit");
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		Map<Project,Employee> map=ProjectUtils.loadProjects();
		switch(ch)
		{
		case 1: 
			 Set<Map.Entry<Project,Employee>> entry = map.entrySet();
			    
			    Iterator<Map.Entry<Project,Employee>> itr = entry.iterator();
			    
			    while(itr.hasNext())
			    {
			   System.out.println(itr.next());
			    }
			    break;
		case 2:
		  ProjectUtils.displayByProjectID(map);
		  break;
		case 3:
			 ProjectUtils.displayByProjectDomain(map);
			 break;
		case 4:
			System.exit(0);
		  
		 
	}	
		
	}

}
