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
}
