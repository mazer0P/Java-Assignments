public class Student
{
    private int Rollno = 0;
    private String name = "null";
    private double sub1 = 0.0, sub2 = 0.0, sub3 = 0.0;
    private String school = "null";
    String grade = "null";


public int getRollno() {
        return Rollno;
    }
   
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSub1() {
        return sub1;
    }
    public void setSub1(double sub1) {
        this.sub1 = sub1;
    }
    public double getSub2() {
        return sub2;
    }
    public void setSub2(double sub2) {
        this.sub2 = sub2;
    }
    public double getSub3() {
        return sub3;
    }
    public void setSub3(double sub3) {
        this.sub3 = sub3;
    }
    
Student()
{
     school = "DIT School";
}
Student(int Rollno,String name,double sub1,double sub2, double sub3)
{
    this();
    this.Rollno = Rollno;
    this.name = name;
    this.sub1 = sub1;
    this.sub2 = sub2;
    this.sub3 = sub3;
    input(Rollno, name, sub1, sub2, sub3);
    
}
public void input(int Rollno,String name, double sub1, double sub2, double sub3) {

    if(Rollno<0 || name == "null" || sub1<0.0 || sub2<0 || sub3 < 0 )
    {
        System.out.println("Invalid Response");
        int r = 0;
        System.exit(r);
    }

   else
   {
    this.Rollno = Rollno;
   this.name = name;
   this.sub1 = sub1;
   this.sub2 = sub2;
   this.sub3 = sub3;
   Result obj = new Result();
   grade = obj.grade(sub1, sub2, sub3);  
}}

@Override
public String toString() {
    return "Student [Rollno=" + Rollno + ", name=" + name + ", sub1=" + sub1 + ", sub2=" + sub2 + ", sub3=" + sub3
            + ", school=" + school + ", grade=" + grade + "]";
}

}
