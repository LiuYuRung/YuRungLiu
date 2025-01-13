interface IF<T>{
    void setT(T t);
    T getT();
}
class Box<T> implements IF<String>{
    private String t;
    
    public void setT(String t){
        this.t = t;
    }

    public String getT(){
        return t;
    }
}
class Vol23Test0951{
    public static void main(String[] args){
        IF<String> s = new Box<String>();
        s.setT("ABC");

        System.out.println(s.getT());
    }
}