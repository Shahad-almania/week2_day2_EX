import java.util.Arrays;

public class Point3D extends Point2D {
    private float z=0.0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public Point3D(){}
    public float getZ (float z) {return z;}
    public void setZ( float z){
        this.z=z;
    }
    public void setXYZ(float x,float y, float z){

        this.z=z;
    }
    public float getXYZ(){
        float Array[]={z};
        return Array[3];
    }

    @Override
    public String toString() {
        return "(x,y,z)";
    }
    public static void main(String[] args) {
        
    }
}

