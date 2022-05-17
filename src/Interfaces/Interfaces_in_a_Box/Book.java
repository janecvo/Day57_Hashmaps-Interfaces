package Interfaces.Interfaces_in_a_Box;

public class Book implements Packables{
    private String author;
    private String name;
    private double weight;

    public Book(String author, String name, double weight){
        this.author = author;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public double weight( ) {
        return weight;
    }

    public String toString(){
        return name +":"+ author;
    }
}
