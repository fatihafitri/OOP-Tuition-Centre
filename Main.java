// application team in UTP
public class Main {
    // application code
    public static void main(String[] args) {
        Student fatiha = new Student("031201140504","House","UTP");

        Name name = new Name("Nur", "Fatiha", "Fitri");
        fatiha.setName(name);

        int stdIndex = 0;

        // creating a batch object
        StudentBatch sb2023 = new StudentBatch();
        sb2023.add(fatiha);
        sb2023.add(fatiha, stdIndex);

        Teacher Hassan = new Teacher();

        // declare a method that allows for the following:
        boolean isIn = sb2023.find("Fatiha");


        for (int i=0; i<5; i++)
            mike.setMark(100, i);

        // calculate and print the avg
        float avg = 0;
        avg = mike.calcAvg();
        System.out.println("Avg = " + avg);

        // calculate the min marks for mike
        System.out.println("Min = " + mike.calcMin());
    }
}
