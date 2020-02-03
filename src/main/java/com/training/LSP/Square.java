package com.training.LSP;

class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(int height, int width) {
        super(height, width);
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
    }

    @Override
    public void setWidth(int width) {
        super.setHeight(width);
        super.setWidth(width);
    }
}

