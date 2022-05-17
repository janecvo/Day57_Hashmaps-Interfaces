package Hashmaps;
import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {

        // // ---NICKNAMES---
        // HashMap<String, String> nicknames = new HashMap<>();
        // nicknames.put("matthew", "matt");
        // nicknames.put("michael", "mix");
        // nicknames.put("arthur", "artie");

        // System.out.println( nicknames.get("matthew"));

        // // ---ABBREVIATION---
        // Abbreviations abbreviations = new Abbreviations();
        // abbreviations.addAbbreviation("e.g.", "for example");
        // abbreviations.addAbbreviation("etc.", "and so on");
        // abbreviations.addAbbreviation("i.e.", "more precisely");

        // String text = "e.g. i.e. etc. lol";

        // for (String part: text.split(" ")) {
        // if(abbreviations.hasAbbreviation(part)) {
        // part = abbreviations.findExplanationFor(part);
        // }

        // System.out.print(part);
        // System.out.print(" ");
        // }

        // // ---Print me my hash maps---
        // HashMap<String, String> hashmap = new HashMap<>();
        // hashmap.put("f.e", "for example");
        // hashmap.put("etc.", "and so on");
        // hashmap.put("i.e", "more precisely");

        // Program.printKeys(hashmap);
        // System.out.println("---");
        // Program.printKeysWhere(hashmap, "i");
        // System.out.println("---");
        // Program.printValuesOfKeysWhere(hashmap, ".e");

    //     HashMap<String, Book> hashmap = new HashMap<>();
    //     hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
    //     hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

    //     Program.printValues(hashmap);
    //     System.out.println("---");
    //     Program.printValueIfNameContains(hashmap, "prejud");

    // }


    IOU mattsIOU = new IOU();
    mattsIOU.setSum("Arthur", 51.5);
    mattsIOU.setSum("Michael", 30);

    System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
    System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));

}
}