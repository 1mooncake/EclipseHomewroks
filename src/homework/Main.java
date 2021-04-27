package homework;

public class Main {

	public static void main(String[] args) {
		Course course1=new Course(1,"Engin Demiroğ","Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)");
		Course course2=new Course(2,"Engin Demiroğ","Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)");
		Course course3=new Course(3,"Engin Demiroğ","Programlamaya Giriş için Temel Kurs");
		
		Course[] courses = {course1,course2,course3};
		
		for(Course course:courses) {
			System.out.println("Kurs ismi:" +course.courseName);
			System.out.println("Eğitmen:" +course.courseTeacher);
			System.out.println("-------------------------------");
		}
		
		User user1=new User("Ahmet"," Çal");
		User user2=new User("Mehmet"," Yıldız");
		User user3=new User("Aslı"," Demir");
		
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
