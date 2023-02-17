public class TakeInput {
    public static void main(String[] args) {
    Student paras = new Student(123,"Paras",55.5,33.5,65.5);
    paras.setSub1(paras.getSub1()+40);
    System.out.println(paras);
    System.out.println("*********************************************************************************************");
    Student mansi = new Student(124,"Mansi",45.5,33.5,35.5);
    System.out.println(mansi);
}
}
