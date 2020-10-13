package hm01;


import hm01.obstacles.Treadmill;
import hm01.obstacles.Wall;
import hm01.participants.Cat;
import hm01.participants.Participant;
import hm01.participants.Person;
import hm01.participants.Robot;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Подготовительный этап...");
        Competition competition = createAndPrepareCompetition();

        System.out.println("Соревнование началось!");
        competition.startCompetition();

        System.out.println("Соревнование окончено! Победители:");
        for (Participant winner : competition.getLastWinners()) {
            System.out.println(winner);
        }
    }

    private static Competition createAndPrepareCompetition() {
        Participant person = new Person("Andrey", 50, 500);
        Participant cat = new Cat("Tomas", 200, 1500);
        Participant robot = new Robot("Android", 150, 5000);

        Random random = new Random();

        Wall wall = new Wall(random.nextInt(200));
        Treadmill treadmill = new Treadmill(random.nextInt(1500));

        Competition competition = new Competition("Space war");
        competition.setParticipants(person, cat, robot);
        competition.setObstacles(wall, treadmill);
        return competition;
    }

}
