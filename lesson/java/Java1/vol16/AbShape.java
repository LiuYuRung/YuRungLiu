public abstract class AbShape{
    private int x;        //図形の中心のx座標
    private int y;        //図形の中心のy座標
    private String color; //図形の色

    // 図形の位置を設定する
    public void setCenter(int x,int y){
        this.x = x;
        this.y = y;
    }

    //x座標を取得する
    public int getX(){
        return this.x;
    }

    //x座標を設定する
    public void setX(int x){
        this.x = x;
    }

    //y座標を取得する
    public int getY(){
        return this.y;
    }

    //y座標を設定する
    public void setY(int y){
        this.y = y;
    }

    //図形の色を取得する
    public String getColor(){
        return color;
    }

    //図形の色を設定する
    public void setColor(String color){
        this.color = color;
    }

    //面積を計算する
    public abstract double calculateArea();
}