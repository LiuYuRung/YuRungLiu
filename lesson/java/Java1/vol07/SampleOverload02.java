class SampleOverload02{
    static int add(int v, int w) {
        int sum = v + w;
        return sum;
    }
    static int add(int a , int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args){
        int x = 12;
        int y = 3;
        system.out.println("x + y = " + add(x,y));
    }
}