package entities;

public class Student {
    public String name;
    public float grade1;
    public float grade2;
    public float grade3;

    public float GradesSum() {
        return this.grade1 + this.grade2 + this.grade3;
    }

    public void SituationVerification() {
        if(GradesSum()<60.0) {
            float z = 60-GradesSum();
            System.out.print("FAILED: ");
            System.out.println("Missing " +  String.format("%.2f",z)+ " Points");}
        else {
            System.out.println("PASS");
        }
    }
}
