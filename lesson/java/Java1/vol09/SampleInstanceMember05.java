class Item{
    String name;
    int price;

    void showInfo(){
        System.out.println("商品名：" + name);
        System.out.println("価格　：" + price);
    }
}

class SampleInstanceMember05{
    public static void main(String[] args){
        Item item = null;
        item.name = "PC";
    }
}