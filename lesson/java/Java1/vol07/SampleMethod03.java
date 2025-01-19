class MyTaxedPriceCalculator {
    //税込価格を計算するメソッド
    int calcTaxedPrice(int price) {
        int total = (int)(price + price * 0.05);
        return total;
    }
    //税込価格を表示するメソッド
    void showTaxedPrice(int total) {
        System.out.println("税込価格；" + total + "円");
    }
}

//mainメソッドを表示するメソッド
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