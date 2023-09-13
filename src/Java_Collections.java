import java.util.*;

public class Java_Collections {
    public static void main(String[]args){
    List<String> words = new LinkedList<String>(); // add new string list
        // adding new elements to the list
    words.add("Java");
    words.add("language");
    words.add("is");
    words.add("super fun");
    words.add("and easy");
    Iterator<String>iterator = words.iterator(); // add new Iterator to the list.

    iterator.forEachRemaining(System.out::println); // by using for each we can print the list and I used reference method here.
    iterator.forEachRemaining(a ->{System.out.println(a);}); // printing the list elements using lambda expression.

    while (iterator.hasNext()){ // another way for printing the list using while loop.
        System.out.println(iterator.next());
    }
    }
}
