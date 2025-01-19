class SampleFinal07{
    static final int[] A = new int[3];

    public static void main(String[] args){
        for(int i = 0;i < A.length; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println();
        A[0] = 100;
        for(int i = 0; i < A.length; i++){
            System.out.print(A[i] + " ");
        }
    } 
}