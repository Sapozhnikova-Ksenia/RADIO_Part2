package ru.netology.radioman;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Radio {
    private int firstRadiostation = 0;
    private int lastRadiostation = 9;
    private int currentRadiostation;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume;
    private int quantityRadiostation = 10;

    public Radio(int quantityRadiostation) {
        this.quantityRadiostation = quantityRadiostation;
        this.lastRadiostation = this.quantityRadiostation - 1;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
        }
        this.currentVolume = currentVolume;
    }

    public void setIncreaseCurrentVolume() {
        if (currentVolume != maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void setDecreaseCurrentVolume() {
        if (currentVolume != minVolume) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = minVolume;
        }
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