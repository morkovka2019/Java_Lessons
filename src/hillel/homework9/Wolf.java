package hillel.homework9;

public class Wolf extends Animal implements WildAnimal{
    public Wolf (String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Wolf " + getName() + " says: Roar");
    }

    @Override
    public void hunting() {
        System.out.println("Wolf " + getName() + " goes hunting");
    }
}
