package hm01.obstacles;

import hm01.Obstacles;
import hm01.ParticipantRestrictions;

public class Treadmill implements Obstacles {

    private static final int TRACK_LENGTH = 30;

    @Override
    public void overcomingAnObstacle(ParticipantRestrictions participant) {
        if(participant.getTrackLength() > TRACK_LENGTH && participant.isPassedTheObstacle()) {
            participant.run();
        } else {
            participant.setPassedTheObstacle(false);
        }
    }

}
