package battle;

import java.util.Random;

public class World {
    private Monster[] monsters;
    private Victim[] victims;


    World(Monster[] monster, Victim[] victim) {
        this.monsters = monster;
        this.victims = victim;
    }


    void run(int rounds, Monster[] monsters, Victim[] victims) {

        for (int i = 0; i < rounds; i++) {
            System.out.println("Round NO #" + (i + 1));

            for (Monster m : this.monsters) {
                for (Victim v : this.victims) {
                    if (m.getRandomNumber()< v.escapeChance()) {
                        System.out.printf("%s ran away from monster %s\n", v.getName(), m.getName());
                        continue;
                    }
                    System.out.printf("Monster %s attacked (damage: %f) victim %s (defence: %f). \nBATTLE_RESULT: \n", m.getName(), m.getAttack(), v.getName(), v.getDefence());
                    if (m.getAttack() >= v.getDefence()) {
                        System.out.println("Victim was killed.");
                    } else {
                        System.out.println("Victim survived.");
                    }
                }
            }


        }
    }
}


