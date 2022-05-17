package Hashmaps;
import java.util.HashMap;
import java.util.HashSet;

public class Program {
    private HashMap<String, String>hashmap;

    public Program(){
        this.hashmap = new HashMap<>();
    }

    public static void printKeys(HashMap<String, String> hashmap){
        //when we did hashmap.keySet() ---return arraylist of keys
        //iterates through arraylist and makes it into string and returns string of each key
        for(String myString: hashmap.keySet()){
            System.out.println(myString);
        }
    }

    public static void printKeysWhere(HashMap<String, String> hashmap, String text){
            for (String myString: hashmap.keySet()){
                if (myString.contains(text)){
                    System.out.println(myString);
                }
            }
}   

    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text){
        for (String myString: hashmap.keySet()){
            if (myString.contains(text)){
                //myString represents the keys -- get will return the values
                System.out.println(hashmap.get(myString));
            }
        }
    }

    public static void printValues(HashMap<String,Book> hashmap){
        //for each book, retrieve value from hashmap
        for (Book book: hashmap.values()){
            //prints each book's value
            System.out.println(book);
        }
    }

    public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text){
        for (Book book: hashmap.values()){
            //using the book 
            if (book.getName().contains(text)){
                System.out.println(book);
            }
        }
    }


}
