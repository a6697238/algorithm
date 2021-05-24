package com.algorithm.analyze.file;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.*;


public class FileHandle {

    private static final int numOfEncAndDec = 0x99; //加密解密秘钥
    private static int dataOfFile = 0; //文件字节内容
    public static String srcFilePath = "/Users/a6697238/Downloads/压缩测试.zip";
    public static String encFilePath = "/Users/a6697238/Downloads/zipfile.jar";
    public static String decFilePath = "/Users/a6697238/Downloads/压缩测试out.zip";

    public static void main(String[] args) {

        File srcFile = new File(srcFilePath); //初始文件
        File encFile = new File(encFilePath); //加密文件
        File decFile = new File(decFilePath); //加密文件

        try {
            EncFile(srcFile, encFile); //加密操作
            DecFile(encFile,decFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //欢迎加入java交流Q君样：909038429一起吹水聊天
    private static void EncFile(File srcFile, File encFile) throws Exception {
        if (!srcFile.exists()) {
            System.out.println("source file not exixt");
            return;
        }

        if (!encFile.exists()) {
            System.out.println("encrypt file created");
            encFile.createNewFile();
        }
        InputStream fis = new FileInputStream(srcFile);
        OutputStream fos = new FileOutputStream(encFile);

        BASE64Encoder encoder = new BASE64Encoder();
        encoder.encode(fis,fos);
//        while ((dataOfFile = fis.read()) > -1) {
////            fos.write(dataOfFile ^ numOfEncAndDec);
//
////            String result= BASE.encryptBASE(str.getBytes());
////            System.out.println("result=====加密数据=========="+result);
////            byte result[]= BASE.decryptBASE(result);
////            String str=new String(result);
////            System.out.println("str========解密数据========"+str);
//
//
//        }
//
//        fis.close();
//        fos.flush();
//        fos.close();
    }

    private static void DecFile(File encFile, File decFile) throws Exception {
//        if (!encFile.exists()) {
//            System.out.println("encrypt file not exixt");
//            return;
//        }
//        if (!decFile.exists()) {
//            System.out.println("decrypt file created");
//            decFile.createNewFile();
//        }
//
        InputStream fis = new FileInputStream(encFile);
        OutputStream fos = new FileOutputStream(decFile);
//
//        while ((dataOfFile = fis.read()) > -1) {
//            fos.write(dataOfFile ^ numOfEncAndDec);
//        }
//
//        fis.close();
//        fos.flush();
//        fos.close();

        BASE64Decoder decoder = new BASE64Decoder();
        decoder.decodeBuffer(fis,fos);
    }


}
