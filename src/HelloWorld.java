/**
 * Created by jsr on 5/8/17.
 */



INHERITANCE

        import Java2.Person;
        import Java2.Student;

public class InheritanceApplication {
    public static void main(String[] args) {
        Person fer = new Person("Fer", 27, 'M');
        Student luis = new Student(
                "John", 37, 'M', "Pinnacles", "Java");
        // student.name = "Zach"; As this is protected is not visible outside the package
        Student Rick = new Student("Ryan", 29, 'M', "Olympic", "PHP");


        Person[] people = {
                fer, // person
                new Person("Bobby", 20, 'M'), // person
                Carlos, // student is a person
                Rick // student is a person
        };
        for (Person person : people) {
            System.out.println(person.description()); // they all can call the method description
        }

        Student[] students = {
                Carlos,
                Rick,
                // fer, fer doesn't have a method writeCode
        };
        for (Student student : students) {
            System.out.println(student.writeCode());
        }
    }

}