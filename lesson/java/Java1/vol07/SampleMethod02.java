class SampleMethod02{
    //�ō����i���v�Z���郁�\�b�h
    static int calcTaxedPrice(int price){
        int total = (int)(price + price * 0.05);
        return total;
    }
    //�ō����i��\�����郁�\�b�h
    static void showTaxedPrice(int total){
        System.out.println("�ō����i�F" + total + "�~");
    }

    public static void main(String[] args){
        int price1 = 1200;
        int total1 = calcTaxedPrice(price1);
        showTaxedPrice(total1);

        int price2 = 1000;
        int total2 = calcTaxedPrice(price2);
        showTaxedPrice(total2);
    }
}