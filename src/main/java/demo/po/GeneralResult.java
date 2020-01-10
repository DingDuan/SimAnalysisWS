package demo.po;
import lombok.Data;

import java.util.Comparator;

@Data
public class GeneralResult implements Comparator<GeneralResult> {

    private int resultID;

    private int cid1;

    private int cid2;

    private int maxSim;

    private boolean plag;

    public  GeneralResult(){

    }

    public GeneralResult(int resultID,int cid1,int cid2,int maxSim,boolean plag){
        this.resultID = resultID;
        this.cid1 = cid1;
        this.cid2 = cid2;
        this.maxSim = maxSim;
        this.plag = plag;
    }

    @Override
    public int compare(GeneralResult o1, GeneralResult o2) {
        if(o1.getMaxSim() < o2.getMaxSim()){
            return 1;
        }else if (o1.getMaxSim()==o2.getMaxSim()){
            return 0;
        }else{
            return -1;
        }
    }
}
