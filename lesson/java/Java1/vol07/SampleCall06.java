class SampleCall06{
    static int[] creatArray(){
        int[] a ={10,20,30};
        return a;
    }
    public static void main(String[] args){
        int[] b;
        b = creatArray();
        for(int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }
    }
}