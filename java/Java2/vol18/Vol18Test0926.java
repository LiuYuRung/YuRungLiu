//10
//20
//30
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
//        at Vol18Test0926.main(Vol18Test0926.java:5)
class Vol18Test0926{
    public static void main(String[] args){
        int[] a = {10,20,30};
        for(int i = 0;i < 4; i++){
            System.out.println(a[i]);
        }
    }
}