package mathvoyage;
/**
 * voyager.geometry.java
 * @author Tahsin Islam
 */
public class Geometry {
    private static Geometry instance;
    private Geometry() {
        // Private constructor to prevent external instantiation
    }
    /**
     * Returns the singleton instance of this class.
     * @return The singleton instance
     */
    public static Geometry getInstance() {
        if (instance == null) {
            instance = new Geometry();
        }
        return instance;
    }

    /**
     * Returns the distance between two points.
     * @param p1 The first point
     * @param p2 The second point
     * @return The distance between the two points
     */



}
