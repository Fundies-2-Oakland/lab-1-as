public class Vector3D {

    private final double x;
    private final double y;
    private final double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public double getZ() {
        return z;
    }

    @Override
    public String toString() {
        return String.format("(%.2f, %.2f, %.2f)", x, y, z);
    }

    public double getMagnitude() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public Vector3D normalize() {
        double magnitude = getMagnitude();
        if (magnitude == 0) {
            throw new IllegalStateException("Cannot normalize a vector with magnitude 0");
        }
        return new Vector3D(x / magnitude, y / magnitude, z / magnitude);
    }
}