package demo.getData;
import demo.util.ImportExcel;

import java.io.*;
import java.net.*;
import java.util.*;

public class DownloadCode {

    public final static boolean DEBUG = true; //调试用
    private static int BUFFER_SIZE = 8096; //缓冲区大小
    private Vector vDownLoad = new Vector(); //URL列表
    private Vector vFileList = new Vector(); //下载后的保存文件名列表

    /**
     * 清除下载列表
     */
    public void resetList() {
        vDownLoad.clear();
        vFileList.clear();
    }
    /**
     * 增加下载列表项
     *
     * @param url String
     * @param filename String
     */
    public void addItem(String url, String filename) {
        vDownLoad.add(url);
        vFileList.add(filename);
    }

    /**
     * 根据列表下载资源
     */
    public void downLoadByList() {
        String url = null;
        String filename = null;
        //按列表顺序保存资源
        for (int i = 0; i < vDownLoad.size(); i++) {
            url = (String) vDownLoad.get(i);
            filename = (String) vFileList.get(i);
            try {
                saveToFile(url, filename);
            } catch (IOException err) {
                if (DEBUG) {
                    System.out.println("资源[" + url + "]下载失败!!!");
                }
            }
        }
        if (DEBUG) {
            System.out.println("下载完成!!!");
        }
    }
    /**
     * 将HTTP资源另存为文件
     * @param destUrl String
     * @param fileName String
     * @throws Exception
     */
    public void saveToFile(String destUrl, String fileName) throws IOException {
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        HttpURLConnection httpUrl = null;
        URL url = null;
        byte[] buf = new byte[BUFFER_SIZE];
        int size = 0;

        //建立链接
        url = new URL(destUrl);
        httpUrl = (HttpURLConnection) url.openConnection();
        //连接指定的资源
        httpUrl.connect();
        //获取网络输入流
        bis = new BufferedInputStream(httpUrl.getInputStream());
        //建立文件
        fos = new FileOutputStream(fileName);
        if (this.DEBUG)
            System.out.println("正在获取链接[" + destUrl + "]的内容...\n将其保存为文件[" +
                    fileName + "]");
        //保存文件
        while ((size = bis.read(buf)) != -1)
            fos.write(buf, 0, size);
        fos.close();
        bis.close();
        httpUrl.disconnect();
    }

    /**
     * 将HTTP资源另存为文件
     *
     * @param destUrl String
     * @param fileName String
     * @throws Exception
     */
    public void saveToFile2(String destUrl, String fileName) throws IOException {
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        HttpURLConnection httpUrl = null;
        URL url = null;
        byte[] buf = new byte[BUFFER_SIZE];
        int size = 0;

        //建立链接
        url = new URL(destUrl);
        httpUrl = (HttpURLConnection) url.openConnection();

        //String authString = "username" + ":" + "password";
        String authString = "50301" + ":" + "88888888";
        String auth = "Basic " +
                new sun.misc.BASE64Encoder().encode(authString.getBytes());
        httpUrl.setRequestProperty("Proxy-Authorization", auth);

        //连接指定的资源
        httpUrl.connect();
        //获取网络输入流
        bis = new BufferedInputStream(httpUrl.getInputStream());
        //建立文件
        fos = new FileOutputStream(fileName);

        if (this.DEBUG)
            System.out.println("正在获取链接[" + destUrl + "]的内容...\n将其保存为文件[" +
                    fileName + "]");
        //保存文件
        while ((size = bis.read(buf)) != -1)
            fos.write(buf, 0, size);

        fos.close();
        bis.close();
        httpUrl.disconnect();
    }
    /**
     * 设置代理服务器
     *
     * @param proxy String
     * @param proxyPort String
     */
    public void setProxyServer(String proxy, String proxyPort) {
        //设置代理服务器
        System.getProperties().put("proxySet", "true");
        System.getProperties().put("proxyHost", proxy);
        System.getProperties().put("proxyPort", proxyPort);
    }

    // public void setAuthenticator(String uid, String pwd) {
    // Authenticator.setDefault(new MyAuthenticator());
    // }

    /*
     * @Author duanding
     * @Description 读取excel获取下载列表
     * @Date 4:22 PM 2019/12/6
     * @Param [path]
     * @return DownloadCode
     **/
    public DownloadCode readExcel(String path,DownloadCode oInstance){

        return oInstance;
    }

    /**
     * 主方法(用于测试)
     *
     * @param argv String[]
     */
    public static void main(String argv[]) {
        DownloadCode oInstance = new DownloadCode();
        String targetPrefix = "/Users/dd/study/iSE/Graduation-Design/ContestDataSet/Province/";
        try {
        // //增加下载列表
        ImportExcel importExcel = new ImportExcel();
        List<List<String>> list = importExcel.read("/Users/dd/study/iSE/Graduation-Design/ContestDataSet/Provincial-developers.xlsx");
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                List<String> cellList = list.get(i);
                for (int j = 0; j < cellList.size(); j++) {
                    String[] contents = cellList.get(j).split("/");
                    String targetSuffix = contents[contents.length-2]+contents[contents.length-1];
                    oInstance.addItem(cellList.get(j),targetPrefix+targetSuffix);
                }
            }
        }
        long time1=System.currentTimeMillis();
        // 开始下载
        oInstance.downLoadByList();
//            oInstance.saveToFile("http://mooctest-dev.oss-cn-shanghai.aliyuncs.com/data/answers/3395/52118/SuffixArray_1569329394591.zip", "/Users/dd/Desktop/222333.zip");
        long time2=System.currentTimeMillis();
        System.out.println("当前程序耗时："+(time2-time1)+"ms");
        }
        catch (Exception err) {
            System.out.println(err.getMessage());
        }
    }
}
