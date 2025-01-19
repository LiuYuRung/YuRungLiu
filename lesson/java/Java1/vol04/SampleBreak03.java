class SampleBreak03 {
    public static void main(String[] args){
        int i = 0;
        while(true) {
            System.out.print(i + " ");
            if(i == 3) {
                break;
            }
            i++;
        }
    }
}