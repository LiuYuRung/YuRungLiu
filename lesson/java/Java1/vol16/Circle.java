public class Circle extends AbShape{
    private double radius;  //‰~‚Ì”¼Œa

    //‰~‚Ì”¼Œa‚ğİ’è‚·‚é
    public Circle(double radius){
        this.radius = radius;
    }

    //‰~‚Ì”¼Œa‚ğæ“¾‚·‚é
    public double getRadius(){
        return this.radius;
    }

    //‰~‚Ì”¼Œa‚ğİ’è‚·‚é
    public void setRadius(double radius){
        this.radius = radius;
    }

    //–ÊÏ‚ğŒvZ‚·‚é
    public double calculateArea(){
        return radius * radius * 3.14;
    }
}