package harry;
public class check{
    int a;
    public void checknum(int a) throws CheckEvenException{
        this.a=a;
        if(a%2==0){
            System.out.println("it is Even number");
        }
        else{
            throw new CheckEvenException("only even number is allowed");
        }
    }   
}
