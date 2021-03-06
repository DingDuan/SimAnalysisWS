package demo.getData;
import demo.util.ImportExcel;
import demo.vo.Url;

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

    /*
     * @Author duanding
     * @Description 从excel获取该项目的代码url list
     * @Date 3:32 PM 2020/1/10
     * @Param [subject]
     * @return List<Url>
     **/
    public List<Url> getUrlList(String subject){
        List<Url> codeUrlList = new ArrayList<>();
        String targetPrefix = "/Users/dd/study/iSE/Graduation-Design/ContestDataSet/";
        DownloadCode oInstance = new DownloadCode();
        ImportExcel importExcel = new ImportExcel();
        List<List<String>> list = importExcel.read("/Users/dd/study/iSE/Graduation-Design/ContestDataSet/AllCode.xlsx");
        if (list != null) {
            for (int i = 1; i < list.size(); i++) {
                List<String> cellList = list.get(i);
//                for (int j = 0; j < cellList.size(); j++) {
                String urlStr = cellList.get(2);
                if(urlStr.contains(subject)) {
                    Url url = new Url();
                    url.setCodeUrl(urlStr);
                    codeUrlList.add(url);
//                    String[] contents = url.split("/");
//                    String targetSuffix = contents[contents.length - 2] + contents[contents.length - 1];
//                    oInstance.addItem(url, targetPrefix + subject+"/"+targetSuffix);
//                    System.out.println("url: " + url);
//                    System.out.println("target: " + targetPrefix + subject+"/"+targetSuffix);
                }
//                }
            }
        }


        return codeUrlList;
    }

    /**
     * 主方法(用于测试)
     *
     * @param argv String[]
     */
    //注：本来是要遍历下载的，没改完
    public static void main(String argv[]) {
        DownloadCode oInstance = new DownloadCode();
        String targetPrefix = "/Users/dd/study/iSE/Graduation-Design/ContestDataSet/";
        String url = "http://mooctest-dev.oss-cn-shanghai.aliyuncs.com/data/answers/3714/55208/TrieTree_1572398152383.zip";
        try {
//            String[] ids = {"2019",
//                    "1966",
//                    "1963",
//                    "1962",
//                    "1845",
//                    "1832",
//                    "1831",
//                    "1817",
//                    "1818",
//                    "1731",
//                    "1730",
//                    "1636",
//                    "1637",
//                    "1590",
//                    "1591"
//            };
//
//                    oInstance.saveToFile(
//                            "http://mooctest-dev.oss-cn-shanghai.aliyuncs.com/data/answers/3070/49571/Calculator_1559903705111.zip", "/Users/dd/study/iSE/Graduation-Design/ContestDataSet/Calculator/49571Calculator_1559903705111.zip");
//                long time2=System.currentTimeMillis();
//System.out.println("当前程序"+ids[k]+"耗时："+(time2-time1)+"ms");
            // 开始下载
//            oInstance.downLoadByList();
            List<Url> urls = oInstance.getUrlList("Tarjan");
            for(Url url1:urls){
                System.out.println(url1.getCodeUrl());
            }
        }
        catch (Exception err) {
            System.out.println(err.getMessage());
        }
    }
}
