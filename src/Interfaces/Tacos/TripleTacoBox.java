package Interfaces.Tacos;

public class TripleTacoBox implements TacoBox{
    int tacos;

    public TripleTacoBox(){
        this.tacos =3;
    }

    @Override
    public int tacosRemaining() {
        return this.tacos;
    }

    @Override
    public void eat() {
        this.tacos -=1;

    }}
