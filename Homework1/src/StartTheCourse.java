import obstacles.Course;
import obstacles.Obstacle;
import obstacles.ObstacleType;
import particiants.*;

/**
 * @author Anna Bondarenko
 * Created on 13/02/2019
 */

public class StartTheCourse {

    public static void main(String[] args) {

        //Create new participants and the Team
        Participant member1 = new AdultSportsman("Ivan Ivanov",25, Gender.MALE);
        Participant member2 = new AdultSportsman("Svetlana Petrova",30,Gender.FEMALE);
        Participant member3 = new JuniorSportsman("Pavel Nikitin",16,Gender.MALE);
        Participant member4 = new JuniorSportsman("Elena Palkina",14,Gender.FEMALE);

        Team team = new Team("Mixed team", member1, member2, member3, member4);


        //Create test1 obstacles
        /*Obstacle obstacle1 = new Obstacle(ObstacleType.RUN,100);
        Obstacle obstacle2 = new Obstacle(ObstacleType.SWIM,250);
        Obstacle obstacle3 = new Obstacle(ObstacleType.JUMP,1.5); */

        //Create test2 obstacles
        Obstacle obstacle1 = new Obstacle(ObstacleType.RUN,1300);
        Obstacle obstacle2 = new Obstacle(ObstacleType.SWIM,350);
        Obstacle obstacle3 = new Obstacle(ObstacleType.JUMP,1.5);


        Course course = new Course(obstacle1,obstacle2,obstacle3);

        course.doIt(team);

        team.printPassedMembersInfo();
    }

}
