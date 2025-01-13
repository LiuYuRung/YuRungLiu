class Data{
    private int x;
    private int y;
    public Data(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return this.x + "," + this.y;
    }
}
class Vol19Test0695{
    public static void main(String[] args){
        Data data = new Data(3,7);
        System.out.print(data.toString());
    }
}