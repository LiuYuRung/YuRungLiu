class SampleMethod01{
    static int calcTaxedPrice(int price){
        int total =(int)(price + price *0.05);
        return total;
    }
    public static void main(String[] args){
        int price1 = 1200;
        int total1 = calcTaxedPrice(price1);
        System.out.println("ê≈çûâøäiÅF" + total1 + "â~");

        int price2 = 1000;
        int total2 = calcTaxedPrice(price2);
        System.out.println("ê≈çûâøäiÅF" + total2 + "â~");
        
    }
}