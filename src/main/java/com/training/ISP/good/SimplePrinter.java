package com.training.ISP.good;

class SimplePrinter implements Printer {
    @Override
    public void print(Document document) {
        System.out.println("Print : " + document.getName());
    }
}
