package demo.po;
import lombok.Data;

@Data
public class GeneralResult {

    private int resultID;

    private int cid1;

    private int cid2;

    private int maxSim;

    private boolean plag;

    public GeneralResult(int resultID,int cid1,int cid2,int maxSim,boolean plag){
        this.resultID = resultID;
        this.cid1 = cid1;
        this.cid2 = cid2;
        this.maxSim = maxSim;
        this.plag = plag;
    }
}
