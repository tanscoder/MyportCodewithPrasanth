package harry;
import java.util.Scanner;
public class faculty{
    String fid;
    String name;
    Scanner sc=new Scanner(System.in);
    public void detalis(){
        fid=sc.next();
        name=sc.next();
        System.out.println(fid+" "+name);
    }
}
