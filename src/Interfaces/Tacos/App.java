package Interfaces.Tacos;

public class App {
    public static void main(String[] args) throws Exception {

        TripleTacoBox tres = new TripleTacoBox();
        tres.eat();
        System.out.println(tres.tacosRemaining());

        CustomTacoBox multiple = new CustomTacoBox(123);
        multiple.eat();
        multiple.eat();
        multiple.eat();
        multiple.eat();
        System.out.println(multiple.tacosRemaining());


    }
}