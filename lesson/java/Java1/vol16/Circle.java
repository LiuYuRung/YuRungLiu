public class Circle extends AbShape{
    private double radius;  //�~�̔��a

    //�~�̔��a��ݒ肷��
    public Circle(double radius){
        this.radius = radius;
    }

    //�~�̔��a���擾����
    public double getRadius(){
        return this.radius;
    }

    //�~�̔��a��ݒ肷��
    public void setRadius(double radius){
        this.radius = radius;
    }

    //�ʐς��v�Z����
    public double calculateArea(){
        return radius * radius * 3.14;
    }
}