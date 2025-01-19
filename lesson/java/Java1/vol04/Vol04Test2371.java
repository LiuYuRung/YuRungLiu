class Vol04Test2371{
    public static void main(String[] args){
        int x = 0, y = 0;
        outter: for(;;){
            x++;
            inner:
            y++;
            if((x + y) % 3 == 0) break outer;
            if((x + y) % 5 == 0) continue outer;
            if((x + y) % 4 == 0) continue inner;
            x++;
        }
        System.out.println(x);
    }
}