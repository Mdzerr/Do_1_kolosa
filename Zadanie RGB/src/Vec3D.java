public class Vec3D {
    float R;
    float G;
    float B;

    public Vec3D(float b, float g, float r) {
        this.B = b;
        this.G = g;
        this.R = r;
    }

    protected Vec3D add(Vec3D other) {
        return new Vec3D(other.B + this.B, other.G + this.G, other.R + this.R);
    }

    protected Vec3D mul(float multiply){
        return new Vec3D(this.B*multiply, this.G*multiply, this.R*multiply);
    }
}
