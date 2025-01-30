//Create a Student class with attributes name and rollNumber. Use a constructor to initialize these values. Write a method to display the student's details.
class Student{
    String name;
    int rollno;
    Student(String name, int rollno){
        this.name=name;
        this.rollno=rollno;
    }
    public void display() {
    System.out.println("Student Details:");
    System.out.println("Name: " + name);
    System.out.println("Roll Number: " + rollno);
    System.out.println("---------------------");
}

}
class Main {
    public static void main(String[] args) {
  Student s1=new Student("Pranali",100);
      Student s2=new Student("Prachi",200);
        Student s3=new Student("Ayushi",300);
        s1.display();
        s2.display();
        s3.display();
    }
}