public class Point2D {

    private float x=0.0f;
    private float y=0.0f;

    public Point2D(float x, float y) {
        this.x=x;
        this.y=y;

    }
    public Point2D (){}
    public float getX(){
        return getX();
    }
    public void setX(float y){
        this.x=x;
    }
    public float getY(){
        return getY();
    }
    public void setY(float y){
        this.y=y;
    }
    public void setXY(float x,float y){
        this.x=x;
        this.y=y;
    }
    public float getXY(){
        float Array[]={x,y};
       return Array[2];
    }
    @java.lang.Override
    public java.lang.String toString() {
        return "(x,y)";
    }
}

