class SampleSwitch02a{
    public static void main(String[] args){
        int x = 4; //�o�͉��ł������ĂȂ��B
        //1�Ȃ�A�o�͂�One
        //2�Ȃ�A�o�͂�Two\nThree
        //3�Ȃ�A�o�͂�Three

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