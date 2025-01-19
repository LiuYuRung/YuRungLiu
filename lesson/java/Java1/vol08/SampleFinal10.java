class SampleFinal10{
    static final int TWO = 2;

    public static void main(String[] args){
        final int ONE = 1;
        int x = 1;
        switch(x){
            case ONE:
                System.out.println("A");
                break;
            case TWO:
                System.out.println("B");
                break;
        }
    }
}