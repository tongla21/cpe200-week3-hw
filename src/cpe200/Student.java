package cpe200;

public class Student {
    public Student (){
        this ("John Doe","560610000",1990,false);
    }
    public Student(String s, String s1, int i, boolean b) {
        this.name = !s.equalsIgnoreCase("")?s:"John Doe";
        this.id = isValidStudent_id(s1)?s1:"560610000";
        this.yob = isValidYOB(i)?i:1990;
        this.isactivated = b;
    }
    // implement all missing constructors here
    public Student(String s, String s1, int i) {
        this.name = !s.equalsIgnoreCase("")?s:"John Doe";
        this.id = isValidStudent_id(s1)?s1:"560610000";
        this.yob = isValidYOB(i)?i:1990;
    }
    // implement all get and set methods here
    public Student(String s, String s1) {
        this.name = !s.equalsIgnoreCase("")?s:"John Doe";
        this.id = isValidStudent_id(s1)?s1:"560610000";
    }

    @Override
    public String toString() {
        String o = this.name + " ("
                + this.id + ") was born in "
                + this.yob + " is an ";
        if(this.isactivated == true){
            o = o+"ACTIVE student.";
        }else{
            o = o+"INACTIVE student.";
        }


        return o;
    }

    private boolean isValidStudent_id(String id) {
        String pattern = "5[6-9]{1}061[0-2]{1}[0-9]{3}";
        return id.matches(pattern);
    }

    private boolean isValidYOB(int yob) {
        return (yob >= 1990)?true:false;
    }

    // declare your attributes here
    public String getName() {
        return name;
    }
    public void setName(String n){
        this.name = !n.equalsIgnoreCase("")?n:this.name;
    }

    public String getStudent_id() {
        return id;
    }

    public void setId(String id) {
        this.id = isValidStudent_id(id)?id:this.id;
    }

    public int getYearOfBirth() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = isValidYOB(yob)?yob:this.yob;
    }

    public boolean isActive() {
        return isactivated;
    }

    public void setActive(boolean active) {
        isactivated = active;
    }

    private String name;
    private String id;
    private int yob;
    private boolean isactivated;

    public void setStudent_id(String student_id) {
    this.id = isValidStudent_id(student_id)?student_id:this.id;
    }

    public void setYearOfBirth(int yearOfBirth) {
    this.yob = isValidYOB(yearOfBirth)?yearOfBirth:this.yob;
    }
}
