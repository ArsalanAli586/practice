package Task01;
public final class immutable {
final int courseCode;
final String courseName;
final int rollNumber;

public immutable(int courseCode, String courseName, int rollNumber) {
this.courseCode = courseCode;
this.courseName = courseName;
this.rollNumber = rollNumber;
}

public int getcourseCode() {
return courseCode;
}

public String getCourseName() {
return courseName;
}

public int getRollNumber() {
return rollNumber;
}

//public static void main(String[] args) {
//immutable obj = new immutable(8937, "Software Construction and Development", 239);
//System.out.println("Course Name is : " + obj.getCourseName());
//System.out.println("Course Code is : "+obj.getcourseCode());
//System.out.println("Roll Number is : " + obj.getRollNumber());
}
//}