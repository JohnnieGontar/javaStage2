package hm01;


import hm01.obstacles.Treadmill;
import hm01.obstacles.Wall;
import hm01.participants.Cat;
import hm01.participants.Person;
import hm01.participants.Robot;

public class Main {

    public static void main(String[] args) {

        ParticipantRestrictions[] participants = getParticipants();
        Obstacles[] obstacles = getObstacles();

        for (ParticipantRestrictions participant : participants) {
            for (Obstacles obstacle : obstacles) {
                obstacle.overcomingAnObstacle(participant);
            }
        }

    }


    private static Obstacles[] getObstacles() {
        return new Obstacles[]{
                new Treadmill(),
                new Wall()
        };
    }

    private static ParticipantRestrictions[] getParticipants() {
        return new ParticipantRestrictions[]{
                new Person(35, 5),
                new Cat(10, 25),
                new Robot(40, 20)
        };
    }

}
