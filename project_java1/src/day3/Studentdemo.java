package day3;

public class Studentdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int s;
	Student s1 = new Student();
	s1.setSid(1002);
	s1.setSname("nanda");
	s1.setCity("chennai");
	System.out.println(s1);
	System.out.println("Student id:"+s1.getSid());
	System.out.println("student name :"+s1.getSname());
	System.out.println("student city:"+s1.getCity());
	}

}
