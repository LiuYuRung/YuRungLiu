class TraceTest05{
    public static void main(String[] args){
        int i = 44;
        do {
            if ( i % 2 == 0) {
                System.out.print("0 ");
            } else {
                System.out.print("1 ");
            }
            i /= 2;
        } while (i > 0);
    }
}