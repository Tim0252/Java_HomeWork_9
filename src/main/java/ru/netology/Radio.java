package ru.netology;

public class Radio {
    private int currentVolume;
    private int currentStation;
    private int maxStation;

    public Radio() {
        this.maxStation = 9;
    }

    public Radio(int stationsCount) {
        this.maxStation = stationsCount - 1;
    }

    public void next() {
        if (currentStation != maxStation) {
            currentStation++;
            return;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation != 0) {
            currentStation--;
            return;
        } else {
            currentStation = maxStation;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void louder() {
        if (currentVolume != 100) {
            currentVolume++;
            return;
        } else {
            currentVolume = 100;
        }
    }

    public void quieter() {
        if (currentVolume != 0) {
            currentVolume--;
            return;
        } else {
            currentVolume = 0;
        }
    }
}