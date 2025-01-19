class SampleSwitch02a{
    public static void main(String[] args){
        int x = 4; //出力何でも書いてない。
        //1なら、出力はOne
        //2なら、出力はTwo\nThree
        //3なら、出力はThree

        switch(x) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
            case 3:
                System.out.println("Three");
        }
    }
}