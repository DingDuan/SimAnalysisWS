package demo.getData;

import org.junit.Test;

import java.io.File;

public class TestUnPackUtil {

    UnPackUtil unPackUtil = new UnPackUtil();

    /*
     * @Author duanding
     * @Description 测试解压zip
     * @Date 3:01 PM 2019/11/12
     * @Param []
     * @return void
     **/
    @Test
    public void testUnPackZip(){
        File file = new File("/Users/dd/Desktop/222333/result1569329396493.zip");
        String destPath = "/Users/dd/Desktop/222333/result1569329396493/";
        UnPackUtil.unPackZip(file,"",destPath);
    }

    /*
     * @Author duanding
     * @Description 测试批量解压
     * @Date 4:12 PM 2019/12/10
     * @Param []
     * @return void
     **/
    @Test
    public void testBatchUnPack(){
        long time1=System.currentTimeMillis();

        UnPackUtil.batchUnPackSecondLayer("/Users/dd/study/iSE/Graduation-Design/ContestDataSet/Province","","/Users/dd/study/iSE/Graduation-Design/ContestDataSet/Province/");
        long time2=System.currentTimeMillis();
        System.out.println("当前程序耗时："+(time2-time1)+"ms");
    }
}
