package Interface;

//เราทำการให้คลาสของ Sedan implements Vehicle
public class Sedan implements Vehicle {
    @Override
    public int cashRate() {
        return 40;
    }

    @Override
    public int ePassRate() {
        return 35;
    }
}
