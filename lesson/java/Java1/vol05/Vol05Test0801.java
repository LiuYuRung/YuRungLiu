class Vol05Test0801 {
    public static void main(String[] args) {
        int[][] x = {{1, 2, 3, 4}, {10, 20, 30}, {100, 200}} ;
        int[] y ;
        y = x[0] ;
        System.out.println("y.length = " + y.length) ;
        x[0] = x[1] ;
        System.out.println("x[0].length = " + x[0].length) ;
        x[1] = x[2] ;
        System.out.println("x[1].length = " + x[1].length) ;
        x[2] = y ;
        System.out.println("x[2].length = " + x[2].length) ;
        System.out.println(x[0].length + x[2].length) ;
    }
}