class MyClass{
    int[] data;

    void printElements(){
        for(int i = 0; i < 3;i++){
            System.out.println(data[i]);
        }
    }
}
class Vol09Test1787{
    public static void main(String[] args){
        MyClass m =new MyClass();

        m.data = new int[3];

        m.data[0] = 10;
        m.data[1] = 20;
        m.data[2] = 30;

        m.printElements();
    }
}