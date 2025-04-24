import java.util.ArrayList;
import java.util.List;

public class ClassRoom {
    String className;
    int roomNumber;
    int capacity;
    String section;
    Teacher teacher;
    List<Student> students;
    List<Schedule> schedules;

    public ClassRoom(String className, int roomNumber, String section, int capacity, Teacher teacher){
        this.className = className;
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.section = section;
        this.teacher = teacher;
        this.students = new ArrayList<>();
        this.schedules = new ArrayList<>();
   }
   public void addStudents(Student student){
    if (students.size() < capacity) {
        students.add(student);
        System.out.println(" Students added to classroom.");
    }
    else{
        System.out.println(" Classroom is Full.");
    }
     
   }
   public String getClassInfo(){
     StringBuilder details = new StringBuilder();
      details.append(" Class Name: ").append(className).append(" \nRoom Number: ").append(roomNumber).append("\nCapacity: ").append(capacity).append("\nSection: ").append(section).append("\nTeacher Info: ").append(teacher.getTeacherDetails()).append("\nStudents:\n");

      for(int i=0; i<students.size(); i++){
        details.append(students.get(i).getStudentDetails()).append("\n");
      }
      details.append("\nSchedule:\n");
      for(int i=0; i<schedules.size(); i++){
        details.append(schedules.get(i).getSchedileDetails()).append("\n");
      }
      return details.toString();
   }
}
