class Vol04Test0950{
    public static void main(String[] args){
        long x = 2;
        switch(x){
            case 1:
                x *= 10;
            case 2:
                x += 2;
                break;
            case 5:
                x -= 2;
            default:
                ++x;
        }
    }
}