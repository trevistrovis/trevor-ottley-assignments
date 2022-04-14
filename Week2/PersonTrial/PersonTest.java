public class PersonTest {
    public static void main(String[] args){
        Person person1 = new Person(10, "Person 1");
        Person person2 = new Person(8, "Person 2");
        Person person3 = new Person(20, "Person 3");
        System.out.println(Person.peopleCount());
    }
}
