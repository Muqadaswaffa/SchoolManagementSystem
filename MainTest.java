import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        School mySchool = new School("The City School",  "Hyderabad");

        Teacher t1 = new Teacher("Mis Aliyana", 30,  "Defance" , "Female", "030034123456", "T001", "Math", "MSc Math", 80000, "2023-7-07");
        
        mySchool.addTeacher(t1);

        Student s1 = new Student("Waffa", 19,  "Qasimabad",  "Female",  "03121829203",  "14",  " 10th",  "A",  "Mr Faiq ali",  "2024-07-21");

        Student s2 = new Student("Harry", 20,  "Latifabad",  "Male", "03001123458", "15", " 10th" ,  "A",  "Mr Aslam",  "2024-07-29");

        Student s3 = new Student("Peter", 20,  "Hirabad",  "Male", "03001123458", "001", "11th" ,  "B",  "Mr Akram",  "2024-07-29");

        Student s4 = new Student("Rida", 19,  "Qasimabad",  "Female", "03113152558", "51", "11th" ,  "B",  "Mr Akram",  "2024-07-29");


        mySchool.addStudent(s1);
        mySchool.addStudent(s2);
        mySchool.addStudent(s3);
        mySchool.addStudent(s4);
        
      List<Student> classStudents10th = new ArrayList<>();
      classStudents10th.add(s1);
      classStudents10th.add(s2);
      mySchool.createClassRoom("10th",31,"A",53,t1,classStudents10th);

      List<Student> classStudents11th = new ArrayList<>();
      
      classStudents11th.add(s3);
      classStudents11th.add(s4);

      
     mySchool.createClassRoom("11th",30,"B",53,t1,classStudents11th);


     Schedule schedule1 = new Schedule("Monday", "8:00AM-9:00AM",  "English");
     Schedule schedule2 = new Schedule("Monday", "9:15AM-10:15AM",  "Math");
     Schedule schedule3 = new Schedule("Monday", "10:15AM-11:00AM",  "Science");

     mySchool.classRooms.get(0).schedules.add(schedule1);
     mySchool.classRooms.get(0).schedules.add(schedule2);
     mySchool.classRooms.get(0).schedules.add(schedule3);


     mySchool.classRooms.get(1).schedules.add(schedule1);
     mySchool.classRooms.get(1).schedules.add(schedule2);
     mySchool.classRooms.get(1).schedules.add(schedule3);


     
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter today's date: ");
 
  mySchool.takeAttendanceForAllClasses("2025-4-21");
     
    System.out.println("\n");

    System.out.println("\n=============================SCHOOL INFORMATION=================================\n");

   System.out.println("School Name: "+ mySchool.schoolName);
   System.out.println("School Location: "+ mySchool.location);

   System.out.println("\n===============================--TEACHERS---=======================================\n");
   for(int i=0; i<mySchool.teachers.size(); i++){
       
     System.out.println(mySchool.teachers.get(i).getTeacherDetails());
     System.out.println("--------------------------------------------------------------------------------------");
   }

   System.out.println("\n================================--STUDENTS--=========================================");
   for(int i=0; i<mySchool.students.size(); i++){

    System.out.println(mySchool.students.get(i).getStudentDetails());
    System.out.println("--------------------------------------------------------------------------------------");
   }

   System.out.println("\n==============================--CLASSROOMS--==========================================");
   for(int i=0; i<mySchool.classRooms.size(); i++){

    System.out.println(mySchool.classRooms.get(i).getClassInfo());
    System.out.println("--------------------------------------------------------------------------------------");
   }

   System.out.println("\n===============================-ATTENDANCE RECORD--====================================");
    
  
   mySchool.attendance.showAttendance();
   
   
   
   
   
   
   }
}
