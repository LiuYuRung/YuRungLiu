public class Rectangle extends AbShape{
    private double width;   //長方形の横
    private double height;  //長方形の高さ

    //長方形の縦と横を設定する
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    //横幅を取得する
    public double getWidth(){
        return this.width;
    }

    //横幅を設定する
    public void setWidth(double width){
        this.width = width;
    }

    //高さを取得する
    public double getHeight(){
        return this.height;
    }

    //高さを設定する
    public void setHeight(double height){
        this.height = height;
    }

    //長方形の面積を計算する
    public double calculateArea(){
        return width * height;
    }
}