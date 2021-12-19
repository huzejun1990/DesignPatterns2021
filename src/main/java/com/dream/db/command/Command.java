package com.dream.db.command;

/**
 * @Author : huzejun
 * @Date: 2021/12/20-16:36
 */
public abstract class Command {
    public abstract void doit(); // exec run
    public abstract void undo();
}
