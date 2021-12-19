package com.dream.db.builder;

/**
 * @Author : huzejun
 * @Date: 2021/12/19-23:53
 */
public interface TerrainBuilder {
    TerrainBuilder buildWall();
    TerrainBuilder buildFort();
    TerrainBuilder buildMine();
    Terrain build();
}
