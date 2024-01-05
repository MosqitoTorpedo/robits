package com.blankuser48;

import jdk.internal.util.xml.impl.Input;

import java.awt.*;
import java.awt.event.InputEvent;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws AWTException, InterruptedException {
        Robot robot = new Robot();
        int MOUSE_BUTTON_ONE =InputEvent.getMaskForButton(1);

        Scanner scanner = new Scanner(System.in);
        System.out.println("How long should each click last in milliseconds?");
        int delay = Integer.parseInt(scanner.nextLine());
        System.out.println(String.format("Each click will last %s milliseconds", delay));
        System.out.println("How long should it click in seconds?");
        int length = Integer.parseInt(scanner.nextLine());
        robot.setAutoDelay(delay);


        System.out.println("Okay clicking in 5 seconds!");
        Thread.sleep(5000);

        int time = length * delay;

        boolean running = true;
        while (running) {
            robot.mousePress(MOUSE_BUTTON_ONE);
            robot.mouseRelease(MOUSE_BUTTON_ONE);
            if (time != 0) {
                time--;
            } else {
                running = false;
            }
        }


    }


}

