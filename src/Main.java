import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Person> personList = new LinkedList<>();
        boolean process= true;
        while (process) {
            System.out.println("Введите : имя , фамилия , отчество");
            String enterFirstName = scan.next();
            String enterMiddleName = scan.next();
            String enterLastName = scan.next();
            Person person = new Person(enterFirstName, enterMiddleName, enterLastName);
            System.out.println("Введите слово exit для выхода или нажмите любу клавиатуру для продолжения");
            String exit = scan.next();
            personList.add(person);
            if(exit.equals("exit")){
                process=false;
            }
            else {
                System.out.println("");
            }
        }
        System.out.println(personList);

    }
}
