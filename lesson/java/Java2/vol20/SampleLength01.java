// 文字列XYZの長さ3
// 文字列ABC"DEF GHIの長さ11
class SampleLength01{
    public static void main(String[] args){

        String str1 = "XYZ";
        String str2 = "ABC\"DEF GHI";
        
        int len1 = str1.length();
        int len2 = str2.length();


        System.out.println("文字列" + str1 + "の長さ" + len1);
        System.out.println("文字列" + str2 + "の長さ" + len2);
    }
}