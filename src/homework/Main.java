package homework;

public class Main {

	public static void main(String[] args) {
		Course course1=new Course(1,"Engin Demiro�","Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)");
		Course course2=new Course(2,"Engin Demiro�","Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)");
		Course course3=new Course(3,"Engin Demiro�","Programlamaya Giri� i�in Temel Kurs");
		
		Course[] courses = {course1,course2,course3};
		
		for(Course course:courses) {
			System.out.println("Kurs ismi:" +course.courseName);
			System.out.println("E�itmen:" +course.courseTeacher);
			System.out.println("-------------------------------");
		}
		
		User user1=new User("Ahmet"," �al");
		User user2=new User("Mehmet"," Y�ld�z");
		User user3=new User("Asl�"," Demir");
		
		User[] users = {user1,user2,user3};
		
		for(User user:users) {
			System.out.println(user.userName+user.userSurname);
			
			
		}
		
		CourseManager courseManager=new CourseManager();
		courseManager.addToCourse(course1);
		courseManager.addToCourse(course2);
		courseManager.addToCourse(course3);
		
		
		UserManager userManager=new UserManager();
		userManager.addUser(user1);
		userManager.addUser(user2);
		userManager.addUser(user3);
		
		

	}

}
