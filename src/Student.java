public class Student {
    private int age;
    private String firstName;
    private String lastName;
    private int year;
    private Address address;

    Student(int age, String firstName,String lastName, int year, Address address){
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.address = address;
    }


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private void addOneAge(){
        this.age += 1;
    }

    public int birthday(){
        addOneAge();
        return age;
    }

    public String toString() {
        return firstName + " " + lastName + ", age " + age + ", year " + year + ", address " + address;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
