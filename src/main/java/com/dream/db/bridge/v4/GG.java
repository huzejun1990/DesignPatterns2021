package com.dream.db.bridge.v4;

/**
 * @Author : huzejun
 * @Date: 2021/12/20-16:29
 */
public class GG {
    public void chase(MM mm){
        Gift g = new WildGift(new Flower());
        give(mm,g);
    }

    public void give(MM mm, Gift g){
        System.out.println(g + "give!");
    }
}
