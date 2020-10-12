package hm01;

public abstract class ParticipantRestrictions implements PhysicalActions {

    private int trackLength = 0;
    private int wallHeight = 0;
    private boolean passedTheObstacle = true;


    public ParticipantRestrictions(int trackLength, int wallHeight) {
        setTrackLength(trackLength);
        setWallHeight(wallHeight);
        setPassedTheObstacle(true);
    }

    public int getTrackLength() {
        return this.trackLength;
    }
    public void setTrackLength(int trackLength) {
        this.trackLength = trackLength;
    }
    public int getWallHeight() {
        return this.wallHeight;
    }
    public void setWallHeight(int wallHeight) {
        this.wallHeight = wallHeight;
    }

    public boolean isPassedTheObstacle() {
        return passedTheObstacle;
    }
    public void setPassedTheObstacle(boolean passedTheObstacle) {
        this.passedTheObstacle = passedTheObstacle;
    }
}
