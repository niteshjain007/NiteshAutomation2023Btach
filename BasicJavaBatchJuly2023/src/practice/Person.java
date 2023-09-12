package practice;

public class Person {
	
	 private String name; // private = restricted access

	  // Getter
	  public String getName() {
	    return name;
	  }

	  // Setter
	  public void setName(String newName) {
	    this.name = newName;
	  }
	  
	  public static void main(String tt[])
	  {
		  Person p1 = new Person();
		  p1.name= "nitesh";
		  
		  System.out.println(p1.name);
		  
		  p1.setName("qatestology");
		  System.out.println(p1.getName());
		  
	  }
}
