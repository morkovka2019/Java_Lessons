package hillel.homework9;

public class Main {
    public static void main(String[] args){
        Cat cat = new Cat("Sonya");
        cat.greets();
        cat.play();

        BigDog bigDog = new BigDog("Betchoven");
        BigDog bigDogSecond = new BigDog("Lord");
        bigDog.greets();
        Dog dog = new Dog("Maylo");
        dog.greets(dog);
        bigDog.greets(dog);
        bigDog.greets(bigDogSecond);

        Lion lion = new Lion ("Simba");
        lion.greets();
        lion.hunting();
    }
}
