import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> abbreviation;
    private String abbrev;
    private String explanation;

    public Abbreviations() {
        this.abbreviation = new HashMap<>();
    }

    public void addAbbreviation(String abbrev, String explanation) {
        abbreviation.put(abbrev, explanation);
    }

    public boolean hasAbbreviation(String abbrev) {
        return this.abbreviation.containsKey(abbrev);
    }

    public String findExplanationFor(String abbrev) {
        return abbreviation.get(abbrev);
    }

    // public static void printKeys(HashMap<String, String> abbrev){
    //     for (String abbreviation: abbrev.keySet()){
    //         abbrev.get(abbreviation);
    //     }
    // }
    
    // public static void printKeysWhere(HashMap<String, String> abbrev){
    //     for (String abbreviation: abbrev.keySet()){


    //     }
    // }
    
    // public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text){
        
    // }
    
    public String toString() {
        return abbrev + " is short for " + explanation;
    }

}
