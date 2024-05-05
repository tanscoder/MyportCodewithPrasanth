package harry;
import java.util.Scanner;
public class OOPcourse{
    String cid;
    String cname;
    Scanner sc=new Scanner(System.in);
    public void facultyDetalis(){
        cid=sc.next();
        cname=sc.next();
        System.out.println(cid+" "+cname);
    }
}
