// ������XYZ�̒���3
// ������ABC"DEF GHI�̒���11
class SampleLength01{
    public static void main(String[] args){

        String str1 = "XYZ";
        String str2 = "ABC\"DEF GHI";
        
        int len1 = str1.length();
        int len2 = str2.length();


        System.out.println("������" + str1 + "�̒���" + len1);
        System.out.println("������" + str2 + "�̒���" + len2);
    }
}