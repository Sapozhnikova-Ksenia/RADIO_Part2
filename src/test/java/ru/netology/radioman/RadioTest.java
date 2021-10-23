package ru.netology.radioman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void shouldShowTheFirstRadiostationInNotStandartSettings() {
        Radio radio = new Radio(35);
        assertEquals(0, radio.getFirstRadiostation());
    }

    @Test
    public void shouldShowTheLastRadiostationInNotStandartSettings() {
        Radio radio = new Radio(35);
        assertEquals(34, radio.getLastRadiostation());
    }

    @Test
    public void shouldShowTheQuantityRadiostationInNotStandartSettings() {
        Radio radio = new Radio(35);
        assertEquals(35, radio.getQuantityRadiostation());
    }

    @Test
    public void shouldSetTheCurrentRadiostationInNotStandartSettings() {
        Radio radio = new Radio(35);
        radio.setCurrentRadiostation(25);
        assertEquals(25, radio.getCurrentRadiostation());
    }

    @Test
    public void shouldSetTheNextFromUnlimMaxCurrentRadiostationInNotStandartSettings() {
        Radio radio = new Radio(35);
        radio.setCurrentRadiostation(75);
        radio.setNextRadiostation();
        assertEquals(0, radio.getCurrentRadiostation());
    }

    @Test
    public void shouldSetTheNextFromMaxCurrentRadiostationInNotStandartSettings() {
        Radio radio = new Radio(35);
        radio.setCurrentRadiostation(35);
        radio.setNextRadiostation();
        assertEquals(0, radio.getCurrentRadiostation());
    }

    @Test
    public void shouldSetTheNextFromNextCurrentRadiostationInNotStandartSettings() {
        Radio radio = new Radio(35);
        radio.setCurrentRadiostation(30);
        radio.setNextRadiostation();
        assertEquals(31, radio.getCurrentRadiostation());
    }

    @Test
    public void shouldSetThePrevFromMinCurrentRadiostationInNotStandartSettings() {
        Radio radio = new Radio(35);
        radio.setCurrentRadiostation(0);
        radio.setPrevRadiostation();
        assertEquals(34, radio.getCurrentRadiostation());
    }

    @Test
    public void shouldSetThePrevFromCurrentRadiostationInNotStandartSettings() {
        Radio radio = new Radio(35);
        radio.setCurrentRadiostation(24);
        radio.setPrevRadiostation();
        assertEquals(23, radio.getCurrentRadiostation());
    }


    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(76);
        radio.setIncreaseCurrentVolume();
        int actual = radio.getCurrentVolume();
        int expected = 77;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeMoreMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(126);
        radio.setIncreaseCurrentVolume();
        int actual = radio.getCurrentVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(76);
        radio.setDecreaseCurrentVolume();
        int actual = radio.getCurrentVolume();
        int expected = 75;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeForMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.setDecreaseCurrentVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
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