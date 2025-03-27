/*Exception Handling -> (Exception Generation & Resolve exception)
 * It is a abnormal behaviour that comes into program.
 * Here we generated Exception where the Age is negative.
 * */

package lecture_35;

public class Student {
	private String name = "Anish";
	private int age = 22;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void Intro_yourSelf() {
		System.out.println("Hi My Name is " + name + " and age is " + age);

	}

	public int getAge() {
		return age;
	}

	// Extrovert way of solving exception
//	public void setAge(int age) throws Exception {						//The first exception shows that the code might have exception and if it has it hasn't been handled.
//		if(age<0) {
//			throw  new Exception(" Age cannot be negative");				//Creation of Exception if the age is negative
//			
//		}
//		this.age = age;
//	}

	// Introvert way of solving exception
	public void setAge(int age) {
		try {
			// generate the exception and stores the danger code
			if (age < 0) {
				throw new Exception("chutiya Age kabhi -ve nahi ho sakta");
			}
			this.age = age;
		} catch (Exception e) {
			// handles Exception
			e.printStackTrace(); // tells from which line exception is generated
		}

		finally {
			//Exception aaye na aaye hame woh kaam krna hi krna h
			System.out.println("I'm finally block and I will always run wether exception comes or it doesnot comes");
		}
	}

}
