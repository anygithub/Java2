package particiants;

/**
 * @author Anna Bondarenko
 * Created on 13/02/2019
 */

public class Participant  implements SportActivity {
    private final static boolean DEFAULT_PASS_COURSE = false;
    private final static int AGE_LIMIT_ADULT = 18;
    private final static int AGE_LIMIT_JUNIOR = 3;


    private String name;
    private int age;
    private Gender gender;
    private boolean passTheCourse;


    public Participant(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.passTheCourse = DEFAULT_PASS_COURSE;
    }

    @Override
    public boolean swim(double distanceToSwim) {
        return false;
    }




    @Override
    public boolean jump(double distanceJump) {
        return false;
    }

    @Override
    public boolean run(double distanceRun) {
        return false;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", passTheCourse=" + passTheCourse +
                "\n";
    }


    public static int getAgeLimitAdult() {
        return AGE_LIMIT_ADULT;
    }

    public static int getAgeLimitJunior() {
        return AGE_LIMIT_JUNIOR;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public boolean isPassTheCourse() {
        return passTheCourse;
    }

    public void setPassTheCourse(boolean passTheCourse) {
        this.passTheCourse = passTheCourse;
    }


}
