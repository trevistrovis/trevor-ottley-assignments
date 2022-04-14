public class Person {
    private int age;
    private String name;
    private static int numOfPeople = 0;

    public Person(int ageParam, String nameParam) {
        age = ageParam;
        name = nameParam;
        numOfPeople ++;
    }

    public static int peopleCount(){
        return numOfPeople;
    }

}
