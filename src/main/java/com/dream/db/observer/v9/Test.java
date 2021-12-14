package com.dream.db.observer.v9;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author : huzejun
 * @Date: 2021/12/10-22:36
 */
public class Test {

    public static void main(String[] args) {
        final Button b = new Button();
        b.addActionListener(new MyActionListener());
        b.addActionListener(new MyActionListener2());
        b.buttonPressed();
    }
}

class Button {
    private List<ActionListener> actionListeners = new ArrayList<>();

    public void buttonPressed() {
/*        ActionEvent e =
                new ActionEvent(System.currentTimeMillis(),this);
        for (int i = 0; i < actionListeners.size(); i++) {
            final ActionListener l = actionListeners.get(i);
            l.actionPerformed(e);
        }*/
    }

    public void addActionListener(ActionListener l){
        actionListeners.add(l);
    }

}
interface ActionListener {
    public void actionPerformed(ActionEvent e);
}

class MyActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("button press");
    }
}

class MyActionListener2 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
