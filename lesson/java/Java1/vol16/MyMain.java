public class MyMain{
    public static void main(String[] args){
        //�����`
        AbShape rect = new Rectangle(10.0, 5.0);
        rect.setCenter(100, 200);
        rect.setColor("White");

        System.out.println("***** �����` *****");
        System.out.println("���S���W = ( " + rect.getX() + "," + rect.getY() + ")");
        System.out.println("�F�@�@�@ = " + rect.getColor());
        System.out.println("�ʐρ@�@ = " + rect.calculateArea());

        //�~
        AbShape circle = new Circle(3.0);
        circle.setCenter(100, 200);
        circle.setColor("Blue");

        System.out.println("***** �~ *****");
        System.out.println("���S���W = ( " + circle.getX() + "," + circle.getY() + ")");
        System.out.println("�F�@�@�@ = " + circle.getColor());
        System.out.println("�ʐρ@�@ = " + circle.calculateArea());
    }
}