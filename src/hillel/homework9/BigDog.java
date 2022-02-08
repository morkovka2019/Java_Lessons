package hillel.homework9;

public class BigDog extends Dog {
    public BigDog (String name) {
        super(name);
    }
    @Override
    public void greets() {
        System.out.println("Woow");
    }

    public void greets(Dog dog) {
        System.out.println("Woooow");
    }

    public void greets(BigDog anotherBigDog) {
        System.out.println("Woooooooow");
    }

}
