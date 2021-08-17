public class Student {
    
    private String fullname;
    private int age;
    private String address;
    private String classname;

    public Student(){

    }

    public Student(String fullname, int age, String address, String classname){
        this.fullname = fullname;
        this.age = age;
        this.address = address;
        this.classname = classname;
    }
    public String getFullname() {
        return fullname;
    }
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getClassname() {
        return classname;
    }
    public void setClassname(String classname) {
        this.classname = classname;
    }
}
