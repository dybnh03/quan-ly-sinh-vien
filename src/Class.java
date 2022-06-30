public class Class {

    private String idClass;
    private String className;
    private boolean status;
    private String startDate;
    private String endDate;

    public String getIdClass(){
        return idClass;
    }

    public String getClassName(){
        return className;
    }

    public boolean getStatus(){
        return status;
    }

    public String getStartDate(){
        return startDate;
    }

    public String getEndDate(){
        return endDate;
    }


    public void setIdClass(String newIdClass){
        this.idClass = newIdClass;
    }

    public void setClassName(String newClassName){
        this.className = newClassName;
    }

    public void setStatus(boolean newStatus){
        this.status = newStatus;
    }

    public void setStartDate(String newStartDate){
        this.startDate = newStartDate;
    }

    public void setEndDate(String newEndDate){
        this.endDate = newEndDate;
    }


    public Class(String newIdClass, String newClassName, boolean newStatus, String newStartDate, String newEndDate){

        this.idClass = newIdClass;
        this.className = newClassName;
        this.status = newStatus;
        this.startDate = newStartDate;
        this.endDate = newEndDate;

    }



}
