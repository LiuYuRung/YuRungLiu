class Vol04Test1850{
    public static void main(String[] args){
        int a = 1;
        for(int b = 1; b < 8; ++b) {
            if(a == b) {
                b *= 2;
            } else {
                b = b + 1;
            }
        }
        System.out.println(a + ":" + b);
    }
}