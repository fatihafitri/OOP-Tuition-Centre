// created by team in KL
public class Student {
    // data/attributes
    Name name;
    String kp;
    String address;
    String schoolname;
    float marks[] = new float[5];
    
    // methods or operations
    float calcAvg() {
        return 0;
    }
    
    float calcMin() {
        return 0;
    }

    void setName(Name thename) {
        name = thename;
    }    
    
    void setMark(float mark, int i) throws Exception {
        /* if (mark < 0) {
        System.out.println("Error!");
        return; }
         */

        if(mark < 0){
            throw new Exception("Error in mark detected");
        }

        marks[i] = mark;
    }

    void displayMarks(){
        //print the marks
        for(int i = 0; i < marks.length; i++) {
            System.out.println("marks at index "+i+" :"+marks[i]);
        }
    }

    public static void main(String[] args){
        Student stud0 = new Student();
        try { //try block. sth in here can cause exception
            stud0.setMark(10, 0);
            stud0.setMark(10, 0);
        } catch (Exception ex) { //catch block. action to be taken in case of Exception
            System.out.println("Cannot continue");
            ex.printStackTrace(); //method:
        }

        stud0.displayMarks();
    }
}