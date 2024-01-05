package com.blankuser48;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;

public class Main {

    static boolean running;

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
        running = true;


        System.out.println("Okay clicking in 5 seconds!");
        Thread.sleep(5000);

        int time = length * 1000;

        while (running) {
            robot.mousePress(MOUSE_BUTTON_ONE);
            robot.mouseRelease(MOUSE_BUTTON_ONE);
            if (time != 0) {
                time--;
            } else {
                stopRunning();
            }
        }


    }

    public static void stopRunning() {
        running = false;
    }


}

