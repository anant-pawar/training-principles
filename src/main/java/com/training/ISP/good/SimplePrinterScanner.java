package com.training.ISP.good;

class SimplePrinterScanner implements Scanner, Printer {
    @Override
    public void scan(Document document) {
        System.out.println("Scan : " + document.getName());
    }

    @Override
    public void print(Document document) {
        System.out.println("Print : " + document.getName());
    }
}
