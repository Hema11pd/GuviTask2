package GuviTask2;


public class Person {
    public String name;
    public int age;

    public Person(String name)
    {
        this.age = 18;
        this.name = name;


    }

    public Person(int age,String name)
    {
        this.name = name;
        this.age = age;
    }

    public  void display()
    {
        System.out.println("Name:"+this.name + ", Age:" +  this.age);
    }
    public static void main(String[] args)
    {
        Person person1 = new Person("john");
        person1.display();
        Person person2 = new Person(27,"hema");
        person2.display();
    }


}
