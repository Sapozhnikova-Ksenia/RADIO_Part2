package ru.netology.radioman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void shouldIncreaseVolume(){
        Radio radio= new Radio();
        radio.setCurrentVolume(6);
        radio.setIncreaseCurrentVolume();
        int actual=radio.getCurrentVolume();
        int expected=7;
        assertEquals(expected,actual);
    }

    @Test
    public void shouldIncreaseVolumeMoreMax(){
        Radio radio= new Radio();
        radio.setCurrentVolume(26);
        radio.setIncreaseCurrentVolume();
        int actual=radio.getCurrentVolume();
        int expected=10;
        assertEquals(expected,actual);
    }
    @Test
    public void shouldDecreaseVolume(){
        Radio radio= new Radio();
        radio.setCurrentVolume(6);
        radio.setDecreaseCurrentVolume();
        int actual=radio.getCurrentVolume();
        int expected=5;
        assertEquals(expected,actual);
    }

    @Test
    public void shouldDecreaseVolumeForMin(){
        Radio radio= new Radio();
        radio.setCurrentVolume(0);
        radio.setDecreaseCurrentVolume();
        int actual=radio.getCurrentVolume();
        int expected=0;
        assertEquals(expected,actual);
    }

    @Test
    public void shouldSetRadiostationWithPult() {

        Radio radio = new Radio();

        radio.setCurrentRadiostation(5);
        int actual = radio.getCurrentRadiostation();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadiostationWithPultIfMeaningNegative() {

        Radio radio = new Radio();
        radio.setCurrentRadiostation(5);
        radio.setCurrentRadiostation(-5);
        int actual = radio.getCurrentRadiostation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadiostationWithPultIfMeaningMoreNormal() {

        Radio radio = new Radio();
        radio.setCurrentRadiostation(3);
        radio.setCurrentRadiostation(15);
        int actual = radio.getCurrentRadiostation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadiostation() {
        Radio radio = new Radio();

        radio.setCurrentRadiostation(6);
        radio.setNextRadiostation();
        int actual = radio.getCurrentRadiostation();
        int expected = 7;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadiostationFromLastRadiostation() {
        Radio radio = new Radio();

        radio.setCurrentRadiostation(12);
        radio.setNextRadiostation();
        int actual = radio.getCurrentRadiostation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadiostation() {
        Radio radio = new Radio();

        radio.setCurrentRadiostation(7);
        radio.setPrevRadiostation();
        int actual = radio.getCurrentRadiostation();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadiostationFromFirstRadiostation() {
        Radio radio = new Radio();

        radio.setCurrentRadiostation(0);
        radio.setPrevRadiostation();
        int actual = radio.getCurrentRadiostation();
        int expected = 9;

        assertEquals(expected, actual);
    }


}
