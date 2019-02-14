package particiants;
/**
 *
 * @author Anna Bondarenko
 * Created on 13/02/2019
 */

public class Team {
    private String teamName;
    private Participant[] members;


    public Team(String teamName, Participant member1,Participant member2,Participant member3, Participant member4) {
        this.teamName = teamName;
        this.members = new Participant[4];

        this.members[0] = member1;
        this.members[1] = member2;
        this.members[2] = member3;
        this.members[3] = member4;
    }

    public String getTeamName() {
        return teamName;
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamName='" + teamName + "\n" +
                members[0].toString() +
                members[1].toString() +
                members[2].toString() +
                members[3].toString() +
                '}';
    }

    /**
     * Print information about team members who pass the course
     */
    public void printPassedMembersInfo() {
        for (int i = 0; i < 4; i++) {
            if (this.members[i].isPassTheCourse()) {
                System.out.print(this.members[i].toString());
            }
        }

    }

    public Participant getTeamMember(int num) {
        return this.members[num];
    }


}
