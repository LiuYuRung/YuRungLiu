class Data{
    int data;
    public Data(int data){
        this.data = data;
    }
}
class Box{
    private Object o;
    public Box(Object o ){
        this.o = o;
    }
    public Object getO(){
        return o;
    }
}
class Vol19Test0188{
    public static void main(String[] args){
        Box box = new Box(new Data(123));
        Data data = box.getO();
        System.out.println(data.data);
    }
}