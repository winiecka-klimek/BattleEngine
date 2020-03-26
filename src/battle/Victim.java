package battle;

import java.util.Random;

public class Victim {
    public double escapeChance;
    private String name;
    private double defence;

    Victim(String name, double defence, double escapeChance) {
        this.name = name;
        this.defence = defence;
        this.escapeChance = escapeChance;
    }

    public String getName() {
        return name;
    }

    public double getDefence() {
        return defence;
    }

    public double escapeChance() {
        Random randomEscape = new Random(2);
        return escapeChance + randomEscape.nextDouble();
    }
}

class RandomVictim extends Victim {

    public RandomVictim(String name, double defence, double escapeChance) {
        super(name, defence, escapeChance);
    }

    @Override
    public double getDefence() {
        Random r = new Random(2);
        return super.getDefence() + r.nextDouble();
    }
}
