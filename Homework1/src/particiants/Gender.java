package particiants;

/**
 * @author Anna Bondarenko
 * Created on 13/02/2019
 */

public enum Gender
{
  MALE(1.5,2.1,2.5), FEMALE(1.4,2,2.4);

  private double runCoef;
  private double swimCoef;
  private double jumpCoef;

  Gender(double runCoef, double swimCoef, double jumpCoef) {
    this.runCoef = runCoef;
    this.swimCoef = swimCoef;
    this.jumpCoef = jumpCoef;
  }

  public double getRunCoef() {
    return runCoef;
  }

  public double getSwimCoef() {
    return swimCoef;
  }

  public double getJumpCoef() {
    return jumpCoef;
  }

}


