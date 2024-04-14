package harry.f1.f2;

public class Circle extends shape {
    Circle(int dim1){
        super(dim1, dim1);
        this.dim1=dim1;
    }
    public void calculateVolume(){
        double Area=0.5*Math.PI*Math.pow(dim2,2);
        System.out.println("the area of circle:"+Area);
    }

}
