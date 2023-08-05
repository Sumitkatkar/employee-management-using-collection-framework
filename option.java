import java.util.*;

class employee
{
	public void employee()
	{
		ArrayList<Integer> a1 = new ArrayList<>();
		ArrayList<String> a2=new ArrayList<>();
		ArrayList<Integer> a3=new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("********** Employee **********");
		
		Boolean temp = true;
		while(temp == true)
		{
			
			System.out.println("1.Add\n2.Display\n3.Remove\n4.Exit:");
			System.out.println("====================================");
			System.out.print("Enter your choice:");
			int ch = sc.nextInt();
			System.out.println("====================================");
			switch(ch)
			{
				case 1:
						System.out.print("Enter ID:");
						int id = sc.nextInt();
						a1.add(id);
						
						System.out.print("Enter employee name =");
						String name = sc.next();
						a2.add(name);
						
						System.out.print("Enter employee Salary =");
						int salary = sc.nextInt();
						a3.add(salary);
						
						System.out.println("Record added...");
						System.out.println("====================================");
						break;
				case 2:
						for(int i=0; i<a1.size(); i++) 
						{
							System.out.println(a1.get(i)+" "+a2.get(i)+" "+a3.get(i));
						}
						System.out.println("====================================");
						break;
				case 3:
						System.out.println("Which id's record do you want to delete:");
						int i = sc.nextInt();
						int a = a1.indexOf(i);
						a1.remove(a);
						System.out.println("Record deleted...");
						System.out.println("====================================");
						break;
				case 4:
						System.out.println("********** Thank you **********");
						System.exit(0);
						break;
			}
		}	
	}
}
class manager extends employee
{
	public void manager()
	{
		System.out.println("********** Manager **********");
		System.out.println("1.Add\n2.Display\n3.Remove\n4.Exit:");
		System.out.println("====================================");
		System.exit(0);
	}
}
class option extends manager
{
	
	public static void main (String args[])
	{
		Scanner sc1 = new Scanner(System.in);
		option o1 = new option();
		
		Boolean temp = true;
		while(temp == true)
		{
			System.out.println("who your are?");
			System.out.println("--------------------------------------");
			System.out.println("1.Employee\n2.Manager\n3.Exit");
			System.out.println("====================================");
			System.out.print("Enter your choice:");
			int ch = sc1.nextInt();
			System.out.println("====================================");
			switch(ch)
			{
				case 1:
						o1.employee();
						break;
				case 2:
						o1.manager();
						break;
				case 3:
						System.exit(0);
						break;
			}
		}
	}
}