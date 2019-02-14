package obstacles;

import particiants.Participant;
import particiants.Team;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anna Bondarenko
 * Created on 13/02/2019
 */

public class Course{
    private Obstacle[] obstacles;

    public Course(Obstacle obstacle1, Obstacle obstacle2, Obstacle obstacle3) {
        this.obstacles = new Obstacle[3];

        this.obstacles[0] = obstacle1;
        this.obstacles[1] = obstacle2;
        this.obstacles[2] = obstacle3;
    }

    @Override
    public String toString() {
        return "Course{" + "\n" +
                "obstacle1=" + obstacles[0].toString() + "\n" +
                "obstacle2=" + obstacles[1].toString() + "\n" +
                "obstacle3=" + obstacles[2].toString() +
                '}';
    }

    /**
     * Start the course for the team
     * @param team
     */
    public void doIt(Team team) {
        int flag = 0;;
        for (int i = 0; i < 4; i++) {
            for (Obstacle obstacle: this.obstacles) {
                if (passObstacle(obstacle,team.getTeamMember(i))) {
                    flag++;
                }
            }
            if (flag == 3) {
                team.getTeamMember(i).setPassTheCourse(true);
            }
            flag = 0;
        }
    }

    /**
     * Participant go through the obstical
     * @param obstacle
     * @param member
     * @return
     */
    public boolean passObstacle(Obstacle obstacle,Participant member) {
        if (obstacle.getType().equals(ObstacleType.JUMP)) {
            return member.jump(obstacle.getDistance());
        } else if (obstacle.getType().equals(ObstacleType.RUN)){
            return member.run(obstacle.getDistance());
        } else if (obstacle.getType().equals(ObstacleType.SWIM)) {
            return member.swim(obstacle.getDistance());
        } else {
            return false;
        }
    }
}
