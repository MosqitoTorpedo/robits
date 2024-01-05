package com.blankuser48;

import java.awt.*;
import java.awt.event.InputEvent;

public class Main {
    public static void main(String[] args) throws AWTException, InterruptedException {

        Thread.sleep(1000);

        Robot robot = new Robot();
        robot.setAutoDelay(1000);

        int mouseButtonOne = InputEvent.getMaskForButton(1);

        robot.mousePress(mouseButtonOne);
        robot.mouseRelease(mouseButtonOne);


    }
}
