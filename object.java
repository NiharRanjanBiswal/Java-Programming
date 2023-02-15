class object
{
    static int count=0;
    object()
    {
        count++;
    }
    void display()
    {
        System.out.println("Number of objects created are "+count);
    }
    public static void main(String[] args)
    {
        object obj1=new object();
        object obj2=new object();
        object obj3=new object();
        object obj4=new object();
        object obj5=new object();
        obj5.display();
    }
}