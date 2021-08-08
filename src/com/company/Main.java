package com.company;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner commad = new Scanner(System.in);
        System.out.println("/start for start");
        String com = commad.nextLine();
        if (com.equals("/start"))
            while(!(com.equals("/stop"))){
                com = commad.nextLine();
                if (com.equals("/gts")){
                    Main.getTotalSpace();
                    AM();
                }
                if (com.equals("/gap")){
                    Main.getAvailableProcessors();
                    AM();
                }
                if (com.equals("/getJVMmemotyNow")) {
                    Main.TMC_JVM();
                    AM();
                }
                if (com.equals("/getTotalJVMmem")){
                    Main.TAFM_JVM();
                    AM();
                }
            }
        System.out.println("thank for using");
    }

    public static void AM(){
        System.out.println("/gts - to get Total Space on harddrive \n/gap - to get available for jvm processors right now \n/getJVMmemotyNow - to get memory, which is JVM using now");
        System.out.println("/getTotalJVMmem - to get Possible memory for jvm using");
        System.out.println("/stop to stop");
    }

    public static void TMC_JVM(){
        System.out.println(Runtime.getRuntime().totalMemory() / 1048576 + " megabytes");
    }

    public static void TAFM_JVM(){
        System.out.println(Runtime.getRuntime().freeMemory() / 1048576 + " megabytes");
    }

    public static void getTotalSpace(){
        System.out.println(new File("/").getTotalSpace() / 1048576 + " megabytes");
    }

    public static void getAvailableProcessors(){
        System.out.println(Runtime.getRuntime().availableProcessors() + " processors");
    }
}
