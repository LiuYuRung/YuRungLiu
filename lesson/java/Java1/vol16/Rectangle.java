public class Rectangle extends AbShape{
    private double width;   //�����`�̉�
    private double height;  //�����`�̍���

    //�����`�̏c�Ɖ���ݒ肷��
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    //�������擾����
    public double getWidth(){
        return this.width;
    }

    //������ݒ肷��
    public void setWidth(double width){
        this.width = width;
    }

    //�������擾����
    public double getHeight(){
        return this.height;
    }

    //������ݒ肷��
    public void setHeight(double height){
        this.height = height;
    }

    //�����`�̖ʐς��v�Z����
    public double calculateArea(){
        return width * height;
    }
}