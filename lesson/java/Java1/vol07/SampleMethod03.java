class MyTaxedPriceCalculator {
    //�ō����i���v�Z���郁�\�b�h
    int calcTaxedPrice(int price) {
        int total = (int)(price + price * 0.05);
        return total;
    }
    //�ō����i��\�����郁�\�b�h
    void showTaxedPrice(int total) {
        System.out.println("�ō����i�G" + total + "�~");
    }
}

//main���\�b�h��\�����郁�\�b�h
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