import java.util.Collection;
import java.util.Collections;

public class Student {
    private String name;
    private String idStudent;
    private String email;
    private String address;
    private boolean status;
    private double mark;
    private String startDate;
    private String endDate;

    public String getName(){
        return name;
    }

    public String getIdStudent(){
        return idStudent;
    }

    public String getEmail(){
        return email;
    }

    public String getAddress(){
        return address;
    }

    public boolean getStatus(){
        return status;
    }

    public double getMark(){
        return mark;
    }

    public String getStartDate(){
        return startDate;
    }

    public String getEndDate(){
        return endDate;
    }


    public void setName(String newName){
        this.name = newName;
    }

    public void setIdStudent(String newIdStudent){
        this.idStudent = newIdStudent;
    }

    public void setEmail(String newEmail){
        this.email = newEmail;
    }

    public void setAddress(String newAddress){
        this.address = newAddress;
    }

    public void setStatus(boolean newStatus){
        this.status = newStatus;
    }

    public void setMark(double newMark){
        this.mark = newMark;
    }

    public void setStartDate(String newStartDate){
        this.startDate = newStartDate;
    }

    public void setEndDate(String newEndDate){
        this.endDate = newEndDate;
    }


    public Student(String newName, String newIdStudent, String newEmail, String newAddress, boolean newStatus, double newMark, String newStartDate, String newEndDate){
       this.name = newName;
       this.idStudent = newIdStudent;
       this.mark = newMark;
       this.address = newAddress;
       this.email = newEmail;
       this.startDate = newStartDate;
       this.endDate = newEndDate;
       this.status = newStatus;
    }


}
