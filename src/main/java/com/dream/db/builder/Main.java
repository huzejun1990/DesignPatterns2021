package com.dream.db.builder;

/**
 * @Author : huzejun
 * @Date: 2021/12/20-0:01
 */
public class Main {
    public static void main(String[] args) {
        TerrainBuilder builder = new ComplexTerrainBuilder();
        Terrain t = builder.buildFort().buildMine().buildWall().build();

        Person p = new Person.PersonBuilder()
                .basicInfo(1,"zhangsan",18)
                .score(20)
                .weight(200)
                .loc("bj","24")
                .build();


    }
}
