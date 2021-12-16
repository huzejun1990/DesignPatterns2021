package com.dream.db.visitor;

/**
 * @Author : huzejun
 * @Date: 2021/12/16-23:44
 */
public class Computer {
    ComputerPart cpu = new CPU();
    ComputerPart memory = new Memory();
    ComputerPart board = new Board();



}

abstract class ComputerPart {
    abstract void accept();

    abstract double getPrice();
}

class CPU extends ComputerPart {

    @Override
    void accept() {

    }

    @Override
    double getPrice() {
        return 0;
    }
}

class Memory extends ComputerPart {
    @Override
    void accept() {

    }

    @Override
    double getPrice() {
        return 0;
    }
}

class Board extends ComputerPart {
    @Override
    void accept() {

    }

    @Override
    double getPrice() {
        return 0;
    }
}

interface Visitor {
    void visitCpu();
}

class CorpVisitor implements Visitor {

    @Override
    public void visitCpu() {

    }
}