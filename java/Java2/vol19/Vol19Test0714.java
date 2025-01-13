//false
class Data{
    private int x;
    public Data(int x){
        this.x = x;
    }
    public int getX(){
        return x;
    }
}
class Vol19Test0714{
    public static void main(String[] args){
        Data d1 = new Data(3);
        Data d2 = new Data(3);
        System.out.print(d1 == d2);
    }
}