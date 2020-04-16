package practice;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class ProjectUtils {

	
	public static Map<Project,Employee> loadProjects() throws ParseException 
	{
		Employee e1=new Employee(101,"aaaa",30000.00,"aa@gmail.com");
		Employee e2=new Employee(102,"bbbb",40000.00,"bb@gmail.com");
		Employee e3=new Employee(103,"cccc",50000.00,"cc@gmail.com");
		Employee e4=new Employee(104,"dddd",60000.00,"dd@gmail.com");
		Employee e5=new Employee(105,"eeee",20000.00,"ee@gmail.com");
		SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy");
		Project p1=new Project(201,"Java",sdf.parse("21-09-2019"),sdf.parse("21-04-2020"));
		Project p2=new Project(202,"Dotnet",sdf.parse("12-08-2019"),sdf.parse("15-04-2020"));
		Project p3=new Project(203,"React JS",sdf.parse("15-07-2019"),sdf.parse("17-03-2020"));
		Project p4=new Project(204,"Dataware housing",sdf.parse("30-06-2019"),sdf.parse("11-01-2020"));
		Project p5=new Project(205,"SQL",sdf.parse("21-09-2019"),sdf.parse("21-04-2020"));
		Project p6=new Project(206,"Testing",sdf.parse("12-08-2019"),sdf.parse("15-04-2020"));
		Project p7=new Project(207,"FrontEnd",sdf.parse("15-07-2019"),sdf.parse("17-03-2020"));
		Project p8=new Project(208,"Python",sdf.parse("30-06-2019"),sdf.parse("11-01-2020"));
		Project p10=new Project(210,"SAP",sdf.parse("21-09-2019"),sdf.parse("21-04-2020"));
		Project p9=new Project(209,"BigData",sdf.parse("12-08-2019"),sdf.parse("15-04-2020"));
		Map<Project, Employee> map=new HashMap<Project, Employee>();
		map.put(p1,e1);
		map.put(p2,e2);
		map.put(p3,e3);
		map.put(p4,e4);
		map.put(p5,e5);
		map.put(p6,e2);
		map.put(p7,e1);
		map.put(p8,e3);
		map.put(p9,e5);
		map.put(p10,e4);
		return map;
		
	}
	
	
	
	public static void displayByProjectID(Map<Project,Employee> map)
	{
		
		 Map<Project, Employee> tm = new TreeMap<Project,Employee>(map);
		 
		 tm.entrySet().stream().forEach(t->System.out.println(t));
		
	}
	
	public static void displayByProjectDomain(Map<Project,Employee> map)
	{
		
		Comparator<Map.Entry<Project,Employee>> c=new Comparator<Map.Entry<Project,Employee>>() {


			@Override
			public int compare(Entry<Project, Employee> o1, Entry<Project, Employee> o2) {
				
				return o1.getKey().getDomain().compareTo(o2.getKey().getDomain());
				
			}
			
		};
		
		map.entrySet().stream().sorted(c).forEach(t->System.out.println(t));
	}
	
}
	

		
		
	



		

	


