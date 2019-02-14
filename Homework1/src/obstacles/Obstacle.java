package obstacles;

/**
 * @author Anna Bondarenko
 * Created on 13/02/2019
 */

public class Obstacle {
    private ObstacleType type;
    private double distance;

    public Obstacle(ObstacleType type, double distance) {
        this.type = type;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Obstacle{" +
                "type=" + type +
                ", distance=" + distance +
                '}';
    }

    public ObstacleType getType() {
        return type;
    }

    public double getDistance() {
        return distance;
    }
}
