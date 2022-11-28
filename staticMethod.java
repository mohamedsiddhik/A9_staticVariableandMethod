// Static Method

class  Students
{
    int r;
    String n;
    static String college =  "bharathidasan University";

    static  void change()
    {
        college = "Bharathiyar University";
    }

    Students(int rollNo, String Name )
    {
        r = rollNo;
        n = Name;
    }

    void  display()
    {
        System.out.println(r + " " + n + " " + college);
    }
}

public  class staticMethod
{
    public static void main(String[] args) {
//        Students.change();
        Students s1 = new Students(121,"prabhu");
        Students s2 = new Students(122,"kannan");
        Students s3 = new Students(123,"Mohamed");

        s1.display();
        s2.display();
        s3.display();
    }
}