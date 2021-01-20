package com.leedcp.test;

import org.springframework.web.context.WebApplicationContext;

import java.util.Scanner;

public class test001 {

    private static String[] hanArr = {"零","壹","贰", "叁","肆","伍","陆","柒","捌","玖","拾"};

    private static String[] unitArr = {"仟","佰","拾",""};
    public static void main(String[] args) {

//        drawCricle();
        Scanner scanner =new Scanner(System.in);
        divide(scanner.nextDouble());
//        hanStr(scanner.next());
    }


    public  static void  drawCricle(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入圆的半径：");

        try{
            int r = scanner.nextInt();
            for(int i=0; i < r; i++){
                for(int j=r-1;j>0;j--){
                    System.out.print(" ");
                }
                System.out.print("*");
             }
        }catch (Exception e){
            System.out.println("圆的半径必须是整数，请重新输入！");

            drawCricle();

        }
    }



    public static void divide(double num){
        String ss = String.valueOf(num);

        int pointIndex = ss.indexOf(".");
        String intPart = ss.substring(0, pointIndex);

        int length =intPart.length();

        String result = "";
        if(length<=4){
            result += hanStr(intPart)+"元";
        }else if(length <=8){

            result += hanStr(intPart.substring(0,length-4)) + "万"+ hanStr(intPart.substring(length-3))+"元";
        }else if(length <= 12){
            result += hanStr(intPart.substring(0,length-8)) + "亿"+ hanStr(intPart.substring(length-7,length-4))+"万"+hanStr(intPart.substring(length-3))+"元";
        }

        String decimals = ss.substring(pointIndex+1);

        if (Integer.parseInt(decimals) != 0)
            result += hanArr[Integer.parseInt(decimals.substring(0,1))]+"角" + hanArr[Integer.parseInt(decimals.substring(0,2))]+"分";
        System.out.println(result);
    }

    public static String hanStr(String numStr){

        String han = "";
        for(int i=0; i<numStr.length();i++){
            int num = Integer.valueOf(numStr.substring(i,i+1));
            han += hanArr[num];
            if(num == 0){
                continue;
            }
            if (numStr.length() == 4){
                han += unitArr[i];
            }else if(numStr.length() == 3){
                han += unitArr[i+1];
            }else if(numStr.length() == 2){
                han += unitArr[i+2];
            }
        }


//        System.out.println(han);
        return han;
    }
}
