class Vol22Test0193{
    public static StringBuilder throwReference(){
        StringBuilder sb = new StringBuilder("hello");
        return sb;
    }
    public static void main(String[] args){
        StringBuilder sb1;
        sb1 = throwReference();
    }
}