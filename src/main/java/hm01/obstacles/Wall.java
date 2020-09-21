package hm01.obstacles;

import hm01.Obstacles;
import hm01.ParticipantRestrictions;

public class Wall implements Obstacles {

    private static final int WALL_HEIGHT = 15;


    @Override
    public void overcomingAnObstacle(ParticipantRestrictions participant) {
        if(participant.getWallHeight() > WALL_HEIGHT && participant.isPassedTheObstacle()) {
            participant.jump();
        } else {
            participant.setPassedTheObstacle(false);
        }
    }
}
