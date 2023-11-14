
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        int temp = 1;
        List<Person> myFamily = new ArrayList<Person>();
        myFamily.add( new Person("Erik", "Holden", 63));
        myFamily.add( new Person("Hayden", "Conner", 100));
        myFamily.add( new Person("Austin", "Brown", 13));
        myFamily.add( new Person("Tyler", "Holden", 321));
        myFamily.add( new Person("Karen", "Holden", 20));
        myFamily.add( new Person("Adam", "Holden", 30));

        Collections.sort(myFamily);

        for(Person person: myFamily){
            System.out.println(temp + ") Name: " + person.getFirstName() + " " + person.getLastName() + " | Age: " + person.getAge());
            temp++;
        }
    }
}
