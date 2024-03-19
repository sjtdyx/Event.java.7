public class Attendee{
    private String name;
    private char gender;
    private int age;
    private String seatNo;

    public Attendee(String name,char gender,int age,String seatNo){
        this.name=name;
        this.gender=gender;
        this.age=age;
        this.seatNo=seatNo;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getSeatNo(){
        return seatNo;
    }
    public void setSeatNo(String seatNo){
        this.seatNo=seatNo;
    }
    @Override
    public String toString() {
        return "Attendee [name=" + name + ", gender=" + gender + ", age=" + age + ", seatNo=" + seatNo + "]";
    }
}