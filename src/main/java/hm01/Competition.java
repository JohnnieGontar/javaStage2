package hm01;

import hm01.obstacles.Obstacle;
import hm01.participants.Participant;

import java.util.LinkedList;
import java.util.List;

public class Competition {
    private Obstacle[] obstacles;
    private Participant[] participants;
    private final String competitionTitle;

    @SuppressWarnings("FieldMayBeFinal")
    private List<Participant> lastWinners = new LinkedList<>();

    public List<Participant> getLastWinners() {
        return lastWinners;
    }

    public Competition(String competitionTitle) {
        this.competitionTitle = competitionTitle;
    }

    public void setParticipants(Participant... participants) {
        this.participants = participants;
    }

    public void setObstacles(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }

    private boolean passAllObstacles(Participant participant) {
        for (Obstacle obstacle : obstacles) {
            if(!obstacle.passObstacleBy(participant)) {
                return false;
            }
            System.out.println();
        }
        return true;
    }

    public void startCompetition() {
        System.out.println("Начало соревнования " + competitionTitle);
        lastWinners.clear();

        for (Participant participant : participants) {
            boolean success = passAllObstacles(participant);
            if(!success) {
                System.out.println("Участник " + participant + " покинул испытание");
            } else {
                lastWinners.add(participant);
            }
        }
    }

}
