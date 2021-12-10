class Grade implements Cloneable{
    int id;
    String syllabus;

    public Grade(int id, String syllabus) {
        this.id = id;
        this.syllabus = syllabus;
    }

    @Override
    public String toString() {
        return "Grade [id=" + id + ", syllabus=" + syllabus + "]";
    }

    public Object clone () throws CloneNotSupportedException
    {
        return super.clone();
    }
}

class Address implements Cloneable{

    String address_line;
    String state;
    String country;
    int zip_code;
    
    public Address(String address_line, String state, String country, int zip_code) {
        this.address_line = address_line;
        this.state = state;
        this.country = country;
        this.zip_code = zip_code;
    }

    @Override
    public String toString() {
        return "Address [address_line=" + address_line + ", country=" + country + ", state=" + state + ", zip_code="
                + zip_code + "]";
    }

    public Object clone () throws CloneNotSupportedException
    {
        return super.clone();
    }
}


class Student implements Cloneable{
    int student_roll;
    String student_name;
    Address student_address;
    Grade student_grade;

    @Override
    public String toString() {
        return "Student [student_address=" + student_address + ", student_grade=" + student_grade + ", student_name="
                + student_name + ", student_roll=" + student_roll + "]";
    }
    public Student(int student_roll,String studentname,Address studentAddress,Grade studentgrade)
    {
        this.student_roll=student_roll;
        this.student_name=studentname;
        this.student_address=studentAddress;
        this.student_grade=studentgrade;
    }
    public Object clone () throws CloneNotSupportedException
    {
        return super.clone();
    }
}

class Clonable {

    public static void main(String[] args) throws CloneNotSupportedException {

        Grade student_grade = new Grade(1, "Math");
        Address studAddress= new Address("123 ABC street", "MA", "USA",12345678);
        Student std = new Student(1, "Reetam", studAddress, student_grade);
        System.out.println(std);
        Student new_std = (Student) std.clone();

        new_std.student_name = "bhulbhal";
        new_std.student_grade.syllabus = "Darun subject";
        System.out.println(new_std);

    }
}