package practice;

public class Student {
	
	int rollNum; // class lever vrble, instance vrble
	String name;
	char section;
	int standard;
	
	public void showStudentDetail(){
		
		System.out.println(rollNum);
		System.out.println(name);
		System.out.println(section);
		System.out.println(standard);
	}
	
	public void promote()
	{
		standard = standard + 1;
	}
	
	public static void main(String uu[])
	{
		Student s1= new Student();
		
		s1.name ="qatestology";
		s1.rollNum = 102;
		s1.section = 'b';
		s1.standard = 9;
		
		Student s2= new Student();
		
		s2.name ="john";
		s2.rollNum = 115;
		s2.section = 'a';
		s2.standard = 5;
		
		
		s1.showStudentDetail();
		
		s1.promote();  // call
				
		s1.showStudentDetail();
			
		
		s2.showStudentDetail();
	}

}
