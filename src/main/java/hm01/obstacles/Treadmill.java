package hm01.obstacles;

import hm01.participants.Participant;

public class Treadmill implements Obstacle {

    private final int length;

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public boolean passObstacleBy(Participant participant) {
        if(participant.run() > length) {
            System.out.println("Участник " + participant + " успешно пробежал дистанцию");
            return true;
        } else {
            System.out.println("Участник " + participant + " не смог пробежать дистанцию " + length);
            return false;
        }
    }

}
