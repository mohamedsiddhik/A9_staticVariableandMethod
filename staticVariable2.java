
//Static Variable 2

class student6
{
    public static String college;
    String a;
    int b;
    static  String c="Anna University";

    student6(String name , int rollNo)
    {
        a= name;
        b=rollNo;
    }

    void display()
    {
        System.out.println("Name : " + a + "  Roll No : " + b + "  College : " + c);
    }
}
public  class staticVariable2
{
    public static void main(String[] args) {
        student6 s1 = new student6("mohamed",123);

        student6 s2 = new student6("prabu",124);

        student6 s3 = new student6("kannan",125);
        student6.c = "Osmania University";
        s1.display();
        s2.display();
        s3.display();





    }
}