package com.zai.myJava.Array;

import java.util.Scanner;

/**
 * Created by User: Zairong on 2021/1/26.
 * E-mail : justiceman3211@hotmail.com
 */
public class ArrayIdolTeam {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("輸入藝人的團體數為: ");
        int number = scanner.nextInt();
        String[] team = new String[number];
        for (int i = 0 ;i<team.length;i++){
            System.out.println("請輸入你喜歡的藝人團體前"+number+"名 :");
            team[i] = (i+1)+"." + scanner.next();
        }for (int i = 0 ;i<team.length;i++){
            System.out.print(team[i] +"  ");
        }

    }
}
