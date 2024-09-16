package com.xworkz.oops.service;

public class Guitar implements Instrument {
    @Override
    public void play() {
        System.out.println("Guitar is being played.");
    }

    @Override
    public void tune() {
        System.out.println("Guitar is being tuned.");
    }

    @Override
    public void stopPlaying() {
        System.out.println("Guitar stopped playing.");
    }
}
