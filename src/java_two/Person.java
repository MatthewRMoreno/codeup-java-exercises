package java_two;

public class Person {
    //exercise
    private String name;
    //constructor for new person
    public Person(String name) {
        this.name = name;
    }

    public String getName(){
//TODO: return the person's name
        return name;
    }

    @Override
    public String toString() {
        return  name;
    }

    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("Hello from " + name);
    }

    public static void main(String[] args) {
        Person matt = new Person("Matthew Moreno");
        System.out.println(matt.name);
        matt.sayHello();

        matt.setName("Billy Bob");
        System.out.println(matt.name);
        matt.sayHello();
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
        //prints true then false for the "=="
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
        //prints true
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
        //prints John -> John -> Jane -> Jane
    }

    }
