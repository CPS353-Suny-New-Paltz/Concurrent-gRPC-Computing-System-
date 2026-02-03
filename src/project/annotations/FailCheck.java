package project.annotations;

public class FailCheck {

	public static void main(String[] args) {
		
		//Will fail
		//System.out.println("This line will fail Gradle check because of missing semicolon")
		
		//Will pass
		System.out.println("This should pass the Gradle check");
		
		//Will fail//Will fail
		//System.out.println("This very very very very very very very very... long line will fail the CheckStyle");
		
		//Will pass
		System.out.println("This short line will pass the CheckStyle check");
	}

}
