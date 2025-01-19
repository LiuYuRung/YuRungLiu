public class MyMain{
    public static void main(String[] args){
        //長方形
        AbShape rect = new Rectangle(10.0, 5.0);
        rect.setCenter(100, 200);
        rect.setColor("White");

        System.out.println("***** 長方形 *****");
        System.out.println("中心座標 = ( " + rect.getX() + "," + rect.getY() + ")");
        System.out.println("色　　　 = " + rect.getColor());
        System.out.println("面積　　 = " + rect.calculateArea());

        //円
        AbShape circle = new Circle(3.0);
        circle.setCenter(100, 200);
        circle.setColor("Blue");

        System.out.println("***** 円 *****");
        System.out.println("中心座標 = ( " + circle.getX() + "," + circle.getY() + ")");
        System.out.println("色　　　 = " + circle.getColor());
        System.out.println("面積　　 = " + circle.calculateArea());
    }
}