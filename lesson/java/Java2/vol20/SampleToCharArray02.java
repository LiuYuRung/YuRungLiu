// charArray[0] = a
// charArray[1] = b
// charArray[2] = c
// charArray[3] = d
// charArray[4] = e
// charArray[5] = f
// charArray[6] = g
class SampleToCharArray02{
    public static void main(String[] args){
        String str = "abcdefg";
        char[]  charArray = str.toCharArray();
        for(int i = 0;i < charArray.length; i++){
            System.out.println("charArray[" + i + "] = " + charArray[i]);
        }
        
    }
}