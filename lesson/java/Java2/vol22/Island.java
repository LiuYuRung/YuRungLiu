class Island{
    Island i;
    public static void main(string[] args){
        Island i2 = new Island();
        Island i3 = new Island();
        Island i4 = new Island();

        i2.i = i3;  //i2.iはi3を参照する
        i3.i = i4;  //i3.iはi4を参照する
        i4.i = i2;  //i4.iはi2を参照する

        i2 = null;
        i3 = null;
        i4 = null;

        //何かメモリーを大量に消費するコード
    }
}