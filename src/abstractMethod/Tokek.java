package abstractMethod;

public class Tokek extends Animal{

    public Tokek(String name, int wife){
        this.name = name;
        this.wife = wife;
    }

    @Override
    void run() {
        System.out.println("The tokek "+name +" can run, toke have "+wife +" wife");
    }

    @Override
    void canEat() {
        System.out.println("Tokek can eat You");
    }
}
