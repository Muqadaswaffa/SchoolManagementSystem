import java.util.ArrayList;
import java.util.List;
 

public class Attendance {
    List<Student> students;
    List<String> dates;
    List<Boolean> isPresent;

    public Attendance(){
        this.students = new ArrayList<>();
        this.dates = new ArrayList<>();
        this.isPresent = new ArrayList<>();
    }
        public void markAttendance(Student student, String date, boolean present){
            students.add(student);
            dates.add(date);
            isPresent.add(present);
        }
       public void showAttendance(){
        for(int i=0; i<students.size(); i++){
            System.out.println(" Date: "+dates.get(i)+ " student ID: "+ students.get(i).studId +" "+ students.get(i).name + " Present: " +isPresent.get(i));

        }
       }
       
}
