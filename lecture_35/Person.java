/* Public access Modifier can be accessed anywhere. 
 * ->It is like a open book.
 * 
 * Private scope is with in a class. 
 * ->It can be accessed within the class it is declared in.
 * 
 * Default Access Modifier->If is not defined anything it by default becomes Default access Modifier.
 * 
 * Constructor -> 	Initialize the class data member. It doesn't update the data member, rather initialize it.
 * Non Parameterised Constructor -> We don't pass any parameters, Rather we hardcode the values.
 * Parameterised Constructor -> We pass parameters.
 * Constructor doesn't have a return type since it is only used to initialised class data member.
 * 
 * Default Constructor -> It created by java on its own behalf if our code donot have its own constructor.
 * */

package lecture_35;

public class Person {
	 private String name = "Ramesh";			//Private access Modifier
	 private int age = 23;				//Private access Modifier	
	 int DOB;						//Default access Modifier
	 public int time;
	 
	 public void Intro_yourSelf() {
		 
		 System.out.println("My Name is "+name+" and age is "+ age); 
		 
	 }
	 
	 //Non Parameterised Constructor
	 public Person() {
		 this.name = "Rameshiya";
		 this.age = 43;
	 }
	 
	 // Parameterised Constructor
	 public Person(String name, int age) {
 		 this.name = name;
		 this.age = age;
	 }
	 
//	 public Person() {
					//This is a default constructor 
	 				//For this null and 0 were begin set to the name and age.
	 				//This line is not visible to us but in runtime this line executes.
//	 }
	 
	 //Encapsulation
	 //Setter
	 


	public String getName() {							//Getter -> Name
		return name;
	}

	public void setName(String name) {					//Setter -> Name
		this.name = name;
	}

	public int getAge() {								//Getter -> Age
		return age;
	}

	public void setAge(int age) {						//Setter -> Age
		
		if(age < 0) {
			System.out.println(age+" is Invalid age");
			return;
		}
		this.age = age;
	}

}
