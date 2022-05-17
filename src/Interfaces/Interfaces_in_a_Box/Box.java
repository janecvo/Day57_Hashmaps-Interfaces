package Interfaces.Interfaces_in_a_Box;
import java.util.ArrayList;

public class Box implements Packables{
    private ArrayList<Packables>box;
    int numOfItems;
    double itemsWeight;
    private double weightMax;

    public Box (double weightMax){
        this.box = new ArrayList<>();
        this.itemsWeight = 0;
        this.numOfItems = 0;
        this.weightMax = weightMax;
    }

    public void add(Packables stuff){
        if (stuff.weight() + itemsWeight < weightMax ){
            this.box.add(stuff);
            itemsWeight += stuff.weight();
            numOfItems++;
        }
        System.out.println("The box is full.");
    }

    @Override
    public double weight() {
        return itemsWeight;
    }

    public String toString(){
        return box;
    }

}
