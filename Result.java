public class Result {
    public String grade(double sub1, double sub2, double sub3)
{
    double per = ((sub1+sub2+sub3)/3);
    String grade = "null";
    if(per>90)
    {
        grade = "A";
    }
    else if(70<per && per<90)
    {
        grade = "B";
    }
    else if(60<per && per<70)
    {
        grade = "C";
    }
    else if(50<per && per<60)
    {
        grade = "D";
    }
    else if(50>per)
    {
        grade = "F";
    }
    return grade;
}

}
