class TraceTest03 {
    public static void main(String[] args) {
        char c;
        int i = 0;
        while ( i <= 5) {
            c = (char)('f' - i++);
            System.out.print(c + " ");
        }
        System.out.println(i);
    }
}