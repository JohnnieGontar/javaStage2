package hm01.obstacles;

import hm01.participants.Participant;

public class Wall implements Obstacle {

    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean passObstacleBy(Participant participant) {
        if(participant.jump() > height) {
            System.out.println("Участник " + participant + " успешно перепрыгнул стену");
            return true;
        } else {
            System.out.println("Участник " + participant + " не смог перепрыгнуть стену " + height);
            return false;
        }
    }
}
