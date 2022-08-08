package java_two;

public class Person {
//        //fields go first
//   private String firstName;
//   private String lastName;
//
//    //Next put constructors
//    public Person(String firstName, String lastName) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }
//
//    public Person() {
//        //create a person with a default first and last name
//        this("Default", "Person");
//    }
//
//    //accessors
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//    //sayHello function
//    public String sayHello() {
//        worldPopulation++;
//        System.out.println(worldPopulation);
//        return String.format("Hello from %s %s!", firstName, lastName);
//    }
//    public static long worldPopulation = 7_500_000_000L; // class property
//
//    public String sayHelloWithLove() {
//        String myHello = sayHello();
//        myHello += "I love pie";
//        return myHello;
//    }
//
//    public static void sayHi() {
//        System.out.println("Hi");
//    }
//
//    public static Person buildPerson(String firstName, String lastName) {
//        //do all the necessary stuff to make a person and return it
//        Person newPerson = new Person(firstName,lastName);
//        return newPerson;
//    }
//
//    public static void main(String[] args) {
////      Person rick = new Person();
////      rick.firstName = "Rick";
////      rick.lastName = "Sanchez";
//            //Also can do
//        Person rick = new Person("Rick", "Sanchez");
//        System.out.println(rick.firstName);
//            // prints "Rick"
//        System.out.println(rick.sayHello());
//            // prints "Hello from Rick Sanchez!"
//        System.out.println(rick.sayHelloWithLove());
//            //prints "Hello from Rick Sanchez!I love pie"
//        System.out.println(worldPopulation);
//            //prints "7500000002"
//        sayHi();
//            //prints "hi"
//        Person bob = Person.buildPerson("Bob", "Smith");
//
//        Person sue = new Person();
//        System.out.println(sue.sayHello());
//            //prints "Hello from Default Person!
//        }
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
