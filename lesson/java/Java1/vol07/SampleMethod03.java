class MyTaxedPriceCalculator {
    //ΕΏiπvZ·ι\bh
    int calcTaxedPrice(int price) {
        int total = (int)(price + price * 0.05);
        return total;
    }
    //ΕΏiπ\¦·ι\bh
    void showTaxedPrice(int total) {
        System.out.println("ΕΏiG" + total + "~");
    }
}

//main\bhπ\¦·ι\bh
class SampleMethod03{
    public static void main(String[] args){
        MyTaxedPriceCalculator c
        = new MyTaxedPriceCalculator();

        int price1 = 1200;
        int total1 = c.calcTaxedPrice(price1);
        c.showTaxedPrice(total1);

        int price2 = 1000;
        int total2 = c.calcTaxedPrice(price2);
        c.showTaxedPrice(total2);

    }
}