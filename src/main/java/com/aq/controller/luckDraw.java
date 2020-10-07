package com.aq.controller;

import java.util.*;

public class luckDraw {
    public static void main(String[] args) {

        Map<Integer,String> prizeMap = new HashMap<Integer, String>();
        prizeMap.put(0,"武则天");
        prizeMap.put(1,"武则天体验卡");
        prizeMap.put(2,"20积分");
        prizeMap.put(3,"88钻石");
        prizeMap.put(4,"188金币");

        List<Double> randomList = new ArrayList<Double>();
        randomList.add(0.005d);
        randomList.add(0.005d+0.05d);
        randomList.add(0.2d);
        randomList.add(0.005d+0.05d+0.145d+0.4d);
        randomList.add(0.005d+0.05d+0.145d+0.4d+0.4d);

        /*
        * 武则天         概率区间 0 ~ 0.005]
        * 武则天体验卡    概率区间 0.005 ~ 0.055]
        * 20积分         概率区间 0.055 ~ 0.2]
        * 88钻石         概率区间 0.2 ~ 0.6]
        * 188金币         概率区间 0.6 ~ 1.0]
        * */

        //产生0-1之间的随机数
        //随机数在哪个概率区间内，则是哪个奖品
        double randomDouble = Math.random();
        randomList.add(randomDouble);
        Collections.sort(randomList);
        int lotteryIndex = randomList.indexOf(randomDouble);

        System.out.println("单抽出奇迹：");
        System.out.println(prizeMap.get(lotteryIndex));

        int i = 0;
        System.out.println("放血十连抽：");
        for(i = 0 ; i < 9 ; i++){
            randomList.remove(lotteryIndex);

            randomDouble = Math.random();
            randomList.add(randomDouble);
            Collections.sort(randomList);
            lotteryIndex = randomList.indexOf(randomDouble);
            System.out.println(prizeMap.get(lotteryIndex));
        }
    }
}
