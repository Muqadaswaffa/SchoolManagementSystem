import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class School {
    String schoolName;
    String location;
    List<Student> students;
    List<Teacher> teachers ;
    List<ClassRoom> classRooms;
    Attendance attendance;

    public School( String  schoolName, String location){
        this.schoolName = schoolName;
        this.location = location;
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
        this.classRooms = new ArrayList<>();
        this.attendance = new Attendance(); 

    }
    public void addStudent(Student student){
        students.add(student);
        System.out.println(" Student added to school.");
    }
    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
        System.out.println(" Teacher added to a School.");
    }
    public void createClassRoom(String className, int roomNumber, String section, int capacity, Teacher teacher, List<Student> classStudents ){
        ClassRoom classRoom = new ClassRoom(className, roomNumber, section, capacity, teacher);
        for(int i=0; i<classStudents.size(); i++){
            classRoom.addStudents(classStudents.get(i));
        }
        classRooms.add(classRoom);
        System.out.println(" Classroom created and added to School.");
        
    }

    // Mark Attendance ===============//

   public void takeAttendanceForAllClasses(String date) {
       Scanner sc = new Scanner(System.in);
    
       for (int i = 0; i < classRooms.size(); i++) {
           ClassRoom room = classRooms.get(i);
            System.out.println("\nTaking attendance for Class: " + room.className + " - Section: " + room.section);

           
    
            System.out.print("Enter number of subjects for this class: ");
            int subjectCount = sc.nextInt();
            sc.nextLine(); // consume leftover newline
    
            for (int s = 0; s < subjectCount; s++) {
                System.out.print("Enter Subject " + (s + 1) + " Name: ");
                String subject = sc.nextLine();
    
                System.out.println("\nMark attendance for Subject: " + subject);
                for (int j = 0; j < room.students.size(); j++) {
                    Student student = room.students.get(j);
                    System.out.print("Is " + student.name + " (ID: " + student.studId + ") present? (y/n): ");
                    String input = sc.nextLine();
                    boolean isPresent = input.equalsIgnoreCase("y");
    
                    String record = "Date: " + date + " | Subject: " + subject + " | Name: " + student.name + " | ID: " + student.studId;
                    attendance.markAttendance(student, record, isPresent);
                }
            }
        }
    
        System.out.println("\nAll attendance records saved successfully for " + date + ".");
    }
     
} 

    
      
       

        
    
    

