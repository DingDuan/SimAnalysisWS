import java.util.ArrayList;
import java.util.List;

public class Try {
    public static void main(String[] args){
        List<String> a=new ArrayList<String>();
        a.add("a");
        List<String> b=new ArrayList<String>();
        b.add("b");
        b.addAll(a);
        System.out.println(b.size());
    }
}
