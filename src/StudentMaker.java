public class StudentMaker {
  
  public static void main(String[] args) {
    Address myAddress = new Address("Causeway Bay","Tung Lo Wan",180);
    Student myStudent = new Student(17, "Belinda", "Yu", 12,myAddress);
    myStudent.setFirstName("Bella");
    int firstAge = myStudent.getAge();
    System.out.println(firstAge);

    int age = myStudent.birthday();
    System.out.println("\n" + age);

    System.out.println("\n" + myStudent);
  }
  
}
