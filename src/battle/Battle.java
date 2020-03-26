package battle;

import java.util.Scanner;

public class Battle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's play!");
        System.out.println("How many rounds do you want to play?");
        int rounds = scanner.nextInt();
        Monster ordinaryMonster = new Monster("Wild wasp", 1.2, 0);
        RandomMonster randomMonster = new RandomMonster("Karmic Koala", 2.1, 0);

        Victim ordinaryVictim = new Victim("Uncle Ben", 1.1, 0);
        Victim randomVictim = new RandomVictim("Uncle Sam", 2.3, 0);

        Monster[] monsters = new Monster[]{ordinaryMonster, randomMonster};
        Victim[] victims = new Victim[]{ordinaryVictim, randomVictim};

        World w = new World(monsters, victims);
        w.run(rounds, monsters, victims);
    }

}
