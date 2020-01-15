package demo.com.tcsa.analysis;

import demo.com.tcsa.util.PythonUtil;
import me.xdrop.fuzzywuzzy.FuzzySearch;

import java.util.concurrent.*;

public class SimAnalysis {

    /**
      * 
      * @param 
      * @return
      * @throws
      * @date 2018/7/31 下午7:01
      * @author duanding
      */
    public static int fuzzyRatio(String s1, String s2) {
        return FuzzySearch.ratio(s1, s2);
    }

    /*
     * @Author duanding
     * @Description 部分匹配，并且加上对String超长和执行超时的处理
     * @Date 3:18 PM 2020/1/8
     * @Param [s1, s2]
     * @return int
     **/
    public static int fuzzyPartialRatio(String s1, String s2) {
        int simValue = 50;
        final ExecutorService exec = Executors.newFixedThreadPool(1);
//        System.out.println("s1Length: "+s1.length()+" s2Length: "+s2.length());
        //String超长时返回默认值
        if(s1.length()+s2.length()>=47000){
            return simValue;
        }
        Callable<Integer> call = new Callable<Integer>() {
            public Integer call() throws Exception {
                //开始执行耗时操作
                return FuzzySearch.partialRatio(s1, s2);
            }
        };
        try {
            Future<Integer> future = exec.submit(call);
            Integer res = future.get(1000 * 60, TimeUnit.MILLISECONDS); //任务处理超时时间设为 60 秒
            simValue = res;
//            System.out.println("任务成功返回:" + simValue);
        } catch (TimeoutException ex) {
            System.out.println("处理超时啦....");
            ex.printStackTrace();
        } catch (Exception e) {
            System.err.println("处理失败");
            e.printStackTrace();
        }
        // 关闭线程池
        exec.shutdown();

        return simValue;
    }

    public static Integer getSimValue(String s1, String s2) {
        s1 = s1.replace(' ', '`');
        s2 = s2.replace(' ', '`');
        String res = PythonUtil.usePy("sim.py", s1 + " " + s2);
        return Integer.valueOf(res.trim());
    }
}
