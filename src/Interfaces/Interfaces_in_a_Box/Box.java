package Interfaces.Interfaces_in_a_Box;

import java.util.ArrayList;

public class Box implements Packables {
    private ArrayList<Packables> box;
    private double maxWeight;

    public Box(double maxWeight) {
        this.box = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    //determines if max weight of box has been reached
    public boolean maxWeightReached (Packables stuff){ 
        //if total weight (box and items)is less than max, return false = max not reached
        if (this.weight() + stuff.weight() <= this.maxWeight){
            return false;
        }
        return true;
    }

    //if max weight not reached, add packable
    public void add(Packables stuff){
        if (!maxWeightReached(stuff)){
            this.box.add(stuff);
            }       
        System.out.println(weight());
        }
    

    @Override
    public double weight() {
        double weight = 0;
        //size() returns number of elements in arrayList
        if (box.size() > 0){
            for (Packables stuff : box){
                weight += stuff.weight();
            }
        }
        return weight;
    }

    public String toString() {
        return "Box: " + this.box.size() + " items, total weight " + this.weight() + "kg";
    }

}
