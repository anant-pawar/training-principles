package com.training.ISP.bad;

class SimplePrinterScanner implements PrinterScanner {
    @Override
    public void print(Document document) {
        System.out.println("Print : " + document.getName());
    }

    @Override
    public void scan(Document document) {
        System.out.println("Scan : " + document.getName());
    }
}
