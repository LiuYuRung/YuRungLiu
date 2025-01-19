class Test0619{
    public static void main(String[] args){
        int[][] a2 = {{1,2,3,4,5},{11,22,33},{21,22,23}};
        int[] a = a2[1];
        a2[0] = a2[1];
        System.out.print(a2[0]);
    }
}