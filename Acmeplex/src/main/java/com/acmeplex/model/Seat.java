package com.acmeplex.model;



public class Seat {
    private int row;
    private int number;
    private boolean isAvailable;

    public Seat(int row, int number, boolean isAvailable) {
        this.row = row;
        this.number = number;
        this.isAvailable = isAvailable;
    }

    // Getters and Setters
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}

