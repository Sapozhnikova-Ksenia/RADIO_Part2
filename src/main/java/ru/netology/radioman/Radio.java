package ru.netology.radioman;

public class Radio {
    private int firstRadiostation = 0;
    private int lastRadiostation = 9;
    private int currentRadiostation;
    private int minVolume = 0;
    private int maxVolume = 10;
    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }
    public void setCurrentVolume(int currentVolume) {
        if (currentVolume>maxVolume){
            currentVolume=maxVolume;
        };
        if (currentVolume<minVolume){
            currentVolume=minVolume;
        }
        this.currentVolume=currentVolume;
    }

    public void setIncreaseCurrentVolume() {
        if (currentVolume != maxVolume) {
            currentVolume= currentVolume + 1;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void setDecreaseCurrentVolume() {
        if (currentVolume != minVolume) {
            currentVolume= currentVolume - 1;
        } else {
            currentVolume = minVolume;
        }
    }

    public int getCurrentRadiostation() {
        return currentRadiostation;
    }

    public void setCurrentRadiostation(int currentRadiostation) {
        if (currentRadiostation < firstRadiostation) {
            currentRadiostation = firstRadiostation;
        }
        if (currentRadiostation > lastRadiostation) {
            currentRadiostation = lastRadiostation;
        }
        this.currentRadiostation = currentRadiostation;
    }

    public void setNextRadiostation() {
        if (currentRadiostation != lastRadiostation) {
            currentRadiostation = currentRadiostation + 1;
        } else {
            currentRadiostation = firstRadiostation;
        }
    }

    public void setPrevRadiostation() {
        if (currentRadiostation != firstRadiostation) {
            currentRadiostation = currentRadiostation - 1;
        } else {
            currentRadiostation = lastRadiostation;
        }
    }
}
