public class colorRGB extends Vec3D{

    public colorRGB(float b, float g, float r) {
        super(b, g, r);
    }

    public static colorRGB mix(colorRGB color1, colorRGB color2, float ratio){
        Vec3D values = color1.mul(ratio).add(color2.mul(1-ratio));
        return new colorRGB(values.B, values.G, values.R);
    }
    @Override
    public String toString() {
        return this.B + " " + this.G + " " + this.R;
    }
}
