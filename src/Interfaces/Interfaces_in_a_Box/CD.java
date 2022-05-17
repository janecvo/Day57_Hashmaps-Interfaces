package Interfaces.Interfaces_in_a_Box;

public class CD implements Packables{
    private String artist;
    private String name;
    private int publicationYear;
    private double weight;

    public CD(String artist,  String name, int pubYear){
        this.artist = artist;
        this.name = name;
        this.publicationYear = pubYear;
        this.weight = 0.1;
    }

    @Override
    public double weight() {
        return weight;
    }

    public String toString(){
        return name + " : " +artist+ " (" +publicationYear+ " ) " ;
    }

}
