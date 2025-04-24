public class Schedule {
    String day;
    String time;
    String subject;

    public Schedule( String day,  String time,  String subject){
        this.day = day;
        this.time = time;
        this.subject = subject;
    }
    public String getSchedileDetails(){
        return " Day: "+day+ " Time: "+time+ " Subject: "+subject;
    }
}
