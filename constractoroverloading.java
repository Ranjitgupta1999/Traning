class Area{
    double area;
    Area(int a){
        this.area=a*a;
    }
    Area(float a,float b){
        this.area=a*b;
    }
    Area(float r){ 
        this.area=3.14*r*r;
    }
    Area(int b, int h){
        this.area= (double)1/2*b*h;
    }
    Area(int h,int a,int b){
        this.area=1/2*h*(a+b);
    }
    Area(double d1,double d2){
        this.area=1/2*d1*d2;
    }
    Area(Area obj){
        this.area=obj.area;
        System.out.println(area);
    }
}
public class constractoroverloading {
    public static void main(String[]rgs){
        Area sq=new Area(3);
        Area rec=new Area(2.5f,1.5f);
        Area cir=new Area(3.5f);
        Area tri=new Area(4,5);
        Area tra=new Area(3,5,3);
        Area rho=new Area(6,4);

        System.out.println("Finding area of triangle using copy constractor");
        Area og=new Area(tri);

    }

}