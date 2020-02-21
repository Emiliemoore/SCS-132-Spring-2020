
public class topic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// we do not need to initialize age in advance 
		// int age= 0 
		// loop and count UP until the user drive 
		
		for(int age = 0; age <= 18; age++);
		System.out.println("You are" + age + "years old.");
		if (age <16)
		System.out.println("You are NOT old enough to drive.");
		if (age== 16) 
			System.out.println("Good luck on your drivers test.");
		if (age == 18)
		{
			System.out.println("You can now vote")
			System.out.println("You are now an adult.");
	    }
		
		//We do not want age ++ because age is interated in our for
		// age++; 

	}

}
