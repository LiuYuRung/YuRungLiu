class Vol22Test0180{
    public static void makeGarbage(){
        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb); 
    }
    public static void main(String[] args){
        makeGarbage();//hello
    }
}