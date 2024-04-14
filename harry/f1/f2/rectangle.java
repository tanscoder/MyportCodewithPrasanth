package harry.f1.f2;
public class rectangle extends shape {
    rectangle(int dim1,int dim2){
        super(dim1,dim2);
        this.dim1=dim1;
        this.dim2=dim2;
    }
    public void calculateVolume(){
        double Area=dim1*dim2;
        System.out.println("the area of rectangle:"+Area);
    }
    
}