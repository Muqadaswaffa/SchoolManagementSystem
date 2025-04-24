public class Person {

    String name;
    int age;
    String address;
    String gender;
    String phonNum;

    public Person(String name, int age, String address,String gender, String phonNum){
        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
        this.phonNum = phonNum;
    }

    public String getDetails(){
        return " Name: "+ name + " Age: "+ age + " Address: "+ address+ " PhoneNumber: "+ phonNum ;
    }
    public void updateAdreaa(String newAddress){
        address = newAddress;
        System.out.println(" Address update successfully. ");
    }
    public void updatePhoneNum(String newPhoneNum){
        phonNum = newPhoneNum;
        System.out.println(" Phone number  update successfully.");
    }
}