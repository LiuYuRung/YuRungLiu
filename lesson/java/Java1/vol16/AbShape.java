public abstract class AbShape{
    private int x;        //�}�`�̒��S��x���W
    private int y;        //�}�`�̒��S��y���W
    private String color; //�}�`�̐F

    // �}�`�̈ʒu��ݒ肷��
    public void setCenter(int x,int y){
        this.x = x;
        this.y = y;
    }

    //x���W���擾����
    public int getX(){
        return this.x;
    }

    //x���W��ݒ肷��
    public void setX(int x){
        this.x = x;
    }

    //y���W���擾����
    public int getY(){
        return this.y;
    }

    //y���W��ݒ肷��
    public void setY(int y){
        this.y = y;
    }

    //�}�`�̐F���擾����
    public String getColor(){
        return color;
    }

    //�}�`�̐F��ݒ肷��
    public void setColor(String color){
        this.color = color;
    }

    //�ʐς��v�Z����
    public abstract double calculateArea();
}