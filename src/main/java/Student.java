
public class Student {
  private String Name;
  private int Age;
  private String StudentId;
  private String Major;

  public Student(String name, int age, String studentId, String major) {
    Name = name;
    Age = age;
    StudentId = studentId;
    Major = major;
  }

  public String GetName() {return Name;}
  public int GetAge() {return Age;}
  public String GetStudentId() {return StudentId;}
  public String GetMajor() {return Major;}

  public String ToString() {
    return Name + " " + Integer.toString(Age) + " " + StudentId + " " + Major;
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 4) 
      return new Student("Parse Error", -1, "Unknown", "Unknown");
    return new Student(data[0], Integer.parseInt(data[1]), data[2], data[3]);
  }
}
