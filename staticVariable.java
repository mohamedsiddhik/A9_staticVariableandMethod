

public  class staticVariable
{
    static int x =0;
    staticVariable()
    {
        x++;
    }

    void display()
    {
        System.out.println(x);
    }
    public static void main(String[] args) {
        staticVariable sv1 = new staticVariable();
        sv1.display();
        staticVariable sv2 = new staticVariable();
        sv2.display();
        staticVariable sv3 = new staticVariable();
        sv3.display();
        staticVariable sv4 = new staticVariable();
        sv4.display();




    }
}