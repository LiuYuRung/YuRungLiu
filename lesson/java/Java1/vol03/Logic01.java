class Logic01{
    public static void main(String[] args){
        boolean b1 = true;
        boolean b2 = false;

        System.out.println(b1 & b2);  //b1��b2��AND
        System.out.println(b1 | b2);  //b1��b2��OR
        System.out.println(b1 ^ b2);  //b1��b2��XOR
        System.out.println(!b1);      //b1��NOT
        System.out.println(b1 == b2); //b1��b2�̓���
        System.out.println(b1 != b2); //b1��b2�̕s����
    }
}