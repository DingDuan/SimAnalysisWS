package demo.getData;

import com.github.junrar.Archive;
import com.github.junrar.rarfile.FileHeader;
import lombok.extern.slf4j.Slf4j;
import net.lingala.zip4j.core.ZipFile;

import java.io.File;
import java.io.FileOutputStream;

/**
 * @Description: 解压rar/zip工具类
 * @Date: 2019/11/12
 * @Auther:duanding
 */
@Slf4j
public class UnPackUtil {

    /**
     * zip文件解压
     *
     * @param destPath 解压文件路径
     * @param zipFile  压缩文件
     * @param password 解压密码(如果有)
     */
    public static void unPackZip(File zipFile, String password, String destPath) {
        try {
            ZipFile zip = new ZipFile(zipFile);
            /*zip4j默认用GBK编码去解压,这里设置编码为GBK的*/
            zip.setFileNameCharset("GBK");
            log.info("begin unpack zip file....");
            zip.extractAll(destPath);
            // 如果解压需要密码
            if (zip.isEncrypted()) {
                zip.setPassword(password);
            }
        } catch (Exception e) {
            log.error("unPack zip file to " + destPath + " fail ....", e.getMessage(), e);
        }
    }

    /*
     * @Author duanding
     * @Description 批量解压
     * @Date 3:58 PM 2019/12/10
     * @Param [path, password, destPrefix]
     * @return void
     **/
    public static void batchUnPack(String path,String password,String destPrefix){
        File dir = new File(path);
        if(dir.isDirectory()){
            File[] files = dir.listFiles();
            for(int i=0;i<files.length;i++){
//                System.out.println(files[i]);
                    String[] contents = files[i].toString().split("/");
    //                System.out.println(contents[contents.length-1]);
                    String[] array = contents[contents.length - 1].split("\\.");
    //                System.out.println(array.length);
                    String suffix = array[0] + "/";
    //                System.out.println(suffix);
                    String destPath = destPrefix + suffix;
                    unPackZip(files[i],password,destPath);

                }
            }
    }

    public static void batchUnPackSecondLayer(String path,String password,String destPrefix){
        File dir = new File(path);
        if(dir.isDirectory()){
            File[] files = dir.listFiles();
            for(int i=0;i<files.length;i++){
                if(files[i].isDirectory()) {
//                System.out.println(files[i]);
                    String[] contents = files[i].toString().split("/");
//                System.out.println(contents[contents.length-1]);
                    String suffix = contents[contents.length - 1];
//                System.out.println(array.length);
//                System.out.println(suffix);
                    String destPath = destPrefix + suffix;
//                unPackZip(files[i],password,destPath);
                    File destDir = new File(destPath);
                    File[] inFiles = destDir.listFiles();
                    unPackZip(inFiles[0], password, destPath);
                }
            }
        }
    }

    /**
     * rar文件解压(不支持有密码的压缩包)
     *
     * @param rarFile  rar压缩包
     * @param destPath 解压保存路径
     */
    public static void unPackRar(File rarFile, String destPath) {
        try (Archive archive = new Archive(rarFile)) {
            if (null != archive) {
                FileHeader fileHeader = archive.nextFileHeader();
                File file = null;
                while (null != fileHeader) {
                    // 防止文件名中文乱码问题的处理
                    String fileName = fileHeader.getFileNameW().isEmpty() ? fileHeader.getFileNameString() : fileHeader.getFileNameW();
                    if (fileHeader.isDirectory()) {
                        //是文件夹
                        file = new File(destPath + File.separator + fileName);
                        file.mkdirs();
                    } else {
                        //不是文件夹
                        file = new File(destPath + File.separator + fileName.trim());
                        if (!file.exists()) {
                            if (!file.getParentFile().exists()) {
                                // 相对路径可能多级，可能需要创建父目录.
                                file.getParentFile().mkdirs();
                            }
                            file.createNewFile();
                        }
                        FileOutputStream os = new FileOutputStream(file);
                        archive.extractFile(fileHeader, os);
                        os.close();
                    }
                    fileHeader = archive.nextFileHeader();
                }
            }
        } catch (Exception e) {
            log.error("unpack rar file fail....", e.getMessage(), e);
        }
    }
}
