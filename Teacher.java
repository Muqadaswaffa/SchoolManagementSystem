
public class Teacher extends Person {
    String teacherId;
    String subject;
    String qualification;
    double salary;
    String joinDate;

    public Teacher(String name, int age, String address,String gender, String phonNum, String teacherId, String subject, String qualification, double salary, String joinDate){
        super(name, age, address, gender, phonNum);
        this.teacherId = teacherId;
        this.subject = subject;
        this.qualification = qualification;
        this.salary = salary;
        this.joinDate = joinDate;
    }
        
        public  String getTeacherDetails(){
             return  super.getDetails()+ "\n Teacher ID: "+ teacherId+ " Subject: "+subject+ " Qualification: "+qualification+ " Teacher Salary: "+ salary+ " Join date: "+ joinDate;
        
    }
    public void assignSubject(String newsubject){
           subject = newsubject;
    }
    public void takeAttendance(){
        System.out.println(" Attendace taken successfully by "+ teacherId);
    }
    public double calculateSalary(int daysworked, int perDay){
        salary = daysworked*perDay;
        return salary;
    }
    
}
