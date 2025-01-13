interface IF<T>{
    void setT(T t);
    T getT();
}
class Box<T> implements IF<T>{
    private T t;
    
    public void setT(T t){
        this.t = t;
    }

    public T getT(){
        return t;
    }
}
class Vol23Test0924{
    public static void main(String[] args){
        IF<Integer> i = new Box<Integer>();
        i.setT(12);

        System.out.println(i.getT());
    }
}