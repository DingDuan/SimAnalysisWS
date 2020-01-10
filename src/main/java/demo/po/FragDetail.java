package demo.po;
import lombok.Data;

import java.util.Map;

@Data
public class FragDetail {

    private int cid1;

    private int cid2;

    private Map<Integer,String> fragmentList;

}
