public class Name {
    private String fname;
    private String lname;
    private String mname;

    public Name(String fname, String mname, String lname){
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
    }
    public void setFName(String fname) {
        // "this" refers to the class attributes
        this.fname = fname;
    }

    public String getfname(){
        return fname;
    }

    public void setMName(String mname) {
        this.mname = mname;
    }

    public String getmname(){
        return mname;
    }

    public void setLName(String lname) {
        this.lname = lname;
    }

    public String getlname(){
        return lname;
    }
}