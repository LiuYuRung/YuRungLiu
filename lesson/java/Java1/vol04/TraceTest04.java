class TraceTest04{
    public static void main(String[] args){
        short s = 1;
        int i = 0;
        do {
            System.out.print(s + " ");
            s = (short)(s * 2);
            i++;
        } while (i < 8);
    }
}