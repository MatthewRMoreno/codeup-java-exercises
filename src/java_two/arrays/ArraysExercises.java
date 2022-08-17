package java_two.arrays;

import java_two.Person;

import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);
        for (int number : numbers) {
            System.out.println(number);
        }
        int n = 3;
        int i;
        Person[] myPerson = {new Person("Goku"), new Person("Ichigo"), new Person("Luffy")};

        for (Person people : myPerson) {
            System.out.println(people.getName());
//            System.out.println(addPerson());
        }
        Person x = new Person("Naruto");
        myPerson = addPerson(n, myPerson, x);
        System.out.println(Arrays.toString(myPerson));
        System.out.println(myPerson.length);
    }

    public static Person[] addPerson(int n,Person[] myPerson,Person x) {
        Person[] newPerson = new Person[n+1];

        for (int i = 0; i < n; i++) {
            newPerson[i] = myPerson[i];
        }
        newPerson[n] = x;

        return newPerson;
    }
}
