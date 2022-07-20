package com.Room;

public class Window {
    private String materialWindowFrame;
    private String materialWindow;
    private int rateView;

    public Window(String materialWindowFrame, String materialWindow, int rateView) {
        this.materialWindowFrame = materialWindowFrame;
        this.materialWindow = materialWindow;
        this.rateView = rateView;
    }
    public void openWindow(){
        System.out.println("Window opened");
    }
    public void closeWindow(){
        System.out.println("Window closed");
    }
    public String getMaterialWindowFrame() {
        return materialWindowFrame;
    }

    public String getMaterialWindow() {
        return materialWindow;
    }

    public int getRateView() {
        return rateView;
    }
}
