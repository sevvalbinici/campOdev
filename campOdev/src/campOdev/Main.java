package campOdev;
public class Main {
        public static void main(String[] args) {
		
        System.out.println("��RENC�LER");
		User user1 = new User (1, " �EVVAL B�N�C�");
		User user2 = new User (2, " iREM NUR CEYLAN");
		
		User[] users = {user1 , user2};
		
		for (User user : users) {
			System.out.println(user.id + user.name);
		}
		System.out.println("E��TMENLER");
		Instructor instructor1 = new Instructor (1, " ENG�N DEM�RO�");
		Instructor instructor2 = new Instructor  (2 , " EL�F KARAKURT");
		
		Instructor[] instructors =  { instructor1 , instructor2};
		
		for (Instructor instructor : instructors ) {
			System.out.println(instructor.id + instructor.name);
		}
		
		UserManager userManager = new UserManager ();
		InstructorManager instructorManager = new InstructorManager ();
		
		userManager.add(user1);
		userManager.add(user2);
		instructorManager.add(instructor1);
		instructorManager.add(instructor2);
		userManager.delete(user1);
		instructorManager.delete(instructor2);
		
		
		
		
		
		
		
		
		
		

	}

}
