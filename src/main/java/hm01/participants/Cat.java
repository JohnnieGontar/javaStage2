package hm01.participants;

import hm01.ParticipantRestrictions;

public class Cat extends ParticipantRestrictions {

    public Cat(int trackLength, int wallHeight) {
        super(trackLength, wallHeight);
    }

    @Override
    public void run() {
        System.out.println(this.getClass().getSimpleName() +  " run " + this.getTrackLength());
    }

    @Override
    public void jump() {
        System.out.println(this.getClass().getSimpleName() + " jump " + this.getWallHeight());
    }

}
