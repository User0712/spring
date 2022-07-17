package com.xinqing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author 心晴_xiao
 * @company 快乐精灵公司
 * @create 2022-07-16 22:56
 */
public class FileTest {
    public static void main(String[] args) throws FileNotFoundException {
        String PATH = "C:\\Users\\xiao\\Desktop\\CODE\\spring\\Spring-di\\src\\test\\java\\com\\xinqing\\applog.log";
        FileInputStream log = new FileInputStream(PATH);
        Scanner scanner = new Scanner(log);
        while(scanner.hasNextLine()){
            String Line = scanner.nextLine();
            if(Line.contains("serviceid")){
                System.out.println(Line);
            }

        }

    }

}
