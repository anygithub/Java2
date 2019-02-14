package particiants;

/**
 * @author Anna Bondarenko
 * Created on 13/02/2019
 */

public class AdultSportsman extends Participant{
    private final static double DEFAULT_RUN_VALUE = 1000;
    private final static double DEFAULT_SWIM_VALUE = 200;
    private final static double DEFAULT_JUMP_VALUE = 3.5;


    public AdultSportsman(String name, int age, Gender gender) {
        super(name, age, gender);
    }

    @Override
    public boolean swim(double distanceToSwim) {
        if (this.getGender().equals(Gender.MALE)) {
            return distanceToSwim <= DEFAULT_SWIM_VALUE * Gender.MALE.getSwimCoef();
        }else if (this.getGender().equals(Gender.FEMALE)) {
            return distanceToSwim <= DEFAULT_SWIM_VALUE  * Gender.FEMALE.getSwimCoef();
        } else {
            return false;
        }
    }

    @Override
    public boolean jump(double distanceJump) {
        if (this.getGender().equals(Gender.MALE)) {
            return distanceJump <= DEFAULT_JUMP_VALUE * Gender.MALE.getJumpCoef();
        }else if (this.getGender().equals(Gender.FEMALE)) {
            return distanceJump <= DEFAULT_JUMP_VALUE * Gender.FEMALE.getJumpCoef();
        } else {
            return false;
        }
    }

    @Override
    public boolean run(double distanceRun) {
        if (this.getGender().equals(Gender.MALE)) {
            return distanceRun <= DEFAULT_RUN_VALUE * Gender.MALE.getRunCoef();
        }else if (this.getGender().equals(Gender.FEMALE)) {
            return distanceRun <= DEFAULT_RUN_VALUE * Gender.FEMALE.getRunCoef();
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
