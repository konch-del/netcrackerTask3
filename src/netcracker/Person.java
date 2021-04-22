package netcracker;

public class Person {
    private String fname;
    private String lname;
    private String patronymic;

    Person(String lname){
        this.lname = lname;
    }
    Person(String lname, String fname){
        this(lname);
        this.fname = fname;
    }
    Person(String lname, String fname, String patronymic){
        this(lname,fname);
        this.patronymic = patronymic;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getFIO(){
        if(patronymic == null && fname == null){
            return lname;
        }
        else if(patronymic == null)
            return lname + " " + fname.charAt(0) + ".";
        return lname + " " + fname.charAt(0) + "." + patronymic.charAt(0) +".";
    }
}
