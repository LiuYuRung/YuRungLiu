class Logic01{
    public static void main(String[] args){
        boolean b1 = true;
        boolean b2 = false;

        System.out.println(b1 & b2);  //b1とb2のAND
        System.out.println(b1 | b2);  //b1とb2のOR
        System.out.println(b1 ^ b2);  //b1とb2のXOR
        System.out.println(!b1);      //b1のNOT
        System.out.println(b1 == b2); //b1とb2の等価
        System.out.println(b1 != b2); //b1とb2の不等価
    }
}