package com.huawei.eshop.common.util;

import java.io.*;
import java.net.URISyntaxException;

public class FileUtil {
    public static void main(String[] args) throws IOException, URISyntaxException {
        String a= "db/db_user.txt";
        String s = FileUtil.readBybuffered(a);
        System.out.println(s);
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



}
