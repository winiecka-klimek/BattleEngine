package battle;

import java.util.Random;

public class Monster {
    private String name;
    private double attack;
    private double randomNumber;

    Monster(String name, double attack, double randomNumber) {
        this.name = name;
        this.attack = attack;
        this.randomNumber = randomNumber;
    }

    public String getName() {
        return name;
    }

    public double getAttack() {
        return attack;
    }

    public double getRandomNumber() {
        Random random = new Random(2);
        return randomNumber + random.nextDouble();
    }
}

class RandomMonster extends Monster {

    RandomMonster(String name, double attack, double randomNumber) {
        super(name, attack, randomNumber);
    }

    @Override
    public double getAttack() {
        Random r = new Random(2);
        return super.getAttack() + r.nextDouble();
    }
}
