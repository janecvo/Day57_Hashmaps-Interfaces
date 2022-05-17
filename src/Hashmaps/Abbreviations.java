package Hashmaps;
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
    
    public String toString() {
        return abbrev + " is short for " + explanation;
    }

}
