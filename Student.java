

public class Student extends Person {
    String studId;
    String grade;
    String section;
    String guardianName;
    String admissionDate;

    public Student(String name, int age, String address,String gender, String phonNum, String studId, String grade, String section, String guardianName, String admissionDate ){
           super(name, age, address, gender, phonNum);
           this.studId = studId;
           this.grade = grade;
           this.section = section;
           this.guardianName = guardianName;
           this.admissionDate = admissionDate;

    }
    public String getStudentDetails(){
        return  super.getDetails() + " \nStudent Id: "+ studId+ " \nGrade: "+ grade+ " \nSection: "+ section+ " \nGuardian Name: "+ guardianName + " \nDate og Admission: "+ admissionDate;
    }
    public void enrollClass(String newGrade, String newSection){
        grade = newGrade;
        section = newSection;
    }
    public void updateGuardian(String newGuardian){
        guardianName = newGuardian;
        System.out.println(" Guardian Name update successfuly.");
    }
     
}
