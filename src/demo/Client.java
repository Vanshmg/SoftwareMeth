package demo;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Student s1 = new Student("1","Lily",120);
        Student s2 = new Student("2","John", 120);
        s1 = s2;
        Student s3 = new Student(s1);
        System.out.println(s1==s2); //true
        System.out.println(s1.equals(s2));
        System.out.println(s1==s3); //false (since the memory they are referring to is not the same even though the contents are equal)
        System.out.println(s1.equals(s3)); //false because .equals - default behavior is ==
        System.out.println(s1.toString()); //default value is a hex value so you need to override to print a string value
        s1.compareTo(s3);

        String string1 = "cs213"; //interned string
        String string2 = "cs213";
        String string3 = new String("cs213");
        System.out.println(string1 == string2);
        System.out.println(string1 == string3); //new memory address created by using new

        Scanner scanner = new Scanner(System.in); //to read from terminal
        String string4 = scanner.nextLine(); //read all until \n (new line character)
        String[] tokens = string4.split("\\s+"); //parse the tokens with the delimiter

        System.out.println(tokens.length);
        Event event1 = new Event();
    }
}
