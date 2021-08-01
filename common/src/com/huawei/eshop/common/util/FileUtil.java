package com.huawei.eshop.common.util;

import java.io.*;
import java.net.URISyntaxException;

public class FileUtil {
    public static void main(String[] args) throws IOException, URISyntaxException {
//        String a= "db/db_user.txt";
//        String s = FileUtil.readBybuffered(a);
//        System.out.println(s);
        String a= "db/db_log.txt";
        String msg ="12323";
        FileUtil.writeBybuffered(a,msg);
    }

    public static String readBybuffered(String filepath) throws IOException, URISyntaxException {
        StringBuffer sb = new StringBuffer();

        filepath=FileUtil.class.getClassLoader().getResource(filepath).toURI().getPath();

        File file = new File(filepath);

        if (file.exists()){
            BufferedReader br = new BufferedReader(new FileReader(file));
            String str = br.readLine();
            while (str!=null){
                sb.append(str);
                str = br.readLine();
            }
            br.close();
            return sb.toString();
        }
        return null;

    }

    public static void writeBybuffered(String filepath,String log) throws URISyntaxException, IOException {

        filepath=FileUtil.class.getClassLoader().getResource(filepath).toURI().getPath();

        File file = new File(filepath);

        if (file.exists()){
            BufferedWriter bw = new BufferedWriter(new FileWriter(file,true));
//            Writer bw = new FileWriter(file);

            bw.write(log);
            bw.newLine();
            bw.flush();


            bw.close();
        }
//        Writer writer =new FileWriter("F:\\Program Files\\JetBrains\\项目\\EShop\\common\\src\\db\\db_log.txt");
//        String a = "adfadgzhng\nafadf";
//        writer.write(a);
//
//        writer.close();




    }



}
