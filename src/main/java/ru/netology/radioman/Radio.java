package ru.netology.radioman;

public class Radio {
    private int firstRadiostation = 0;
    private int lastRadiostation = 9;
    private int currentRadiostation;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume;
    private int quantityRadiostation= 10;

    public Radio() {
    }

    public Radio (int quantityRadiostation){
        this.quantityRadiostation= quantityRadiostation;
        this.lastRadiostation= this.quantityRadiostation-1;
    }

    public int getFirstRadiostation() {
        return firstRadiostation;
    }

    public void setFirstRadiostation(int firstRadiostation) {
        this.firstRadiostation = firstRadiostation;
    }

    public int getLastRadiostation() {
        return lastRadiostation;
    }

    public void setLastRadiostation(int lastRadiostation) {
        this.lastRadiostation = lastRadiostation;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getQuantityRadiostation() {
        return quantityRadiostation;
    }

    public void setQuantityRadiostation(int quantityRadiostation) {
        this.quantityRadiostation = quantityRadiostation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
    public void setCurrentVolume(int currentVolume) {
        if (currentVolume>maxVolume){
            currentVolume=maxVolume;
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