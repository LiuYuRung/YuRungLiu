// Vol20Test1099.java:5: エラー: 不適合な型: Objectをintに変換できません:
//         switch(x){
//               ^
// エラー1個
class Vol20Test1099{
    public static void main(String[] args){
        Object x = "A";

        switch(x){
            case "A":
                System.out.println("A");
                break;
            case "B":
                System.out.println("B");
                break;                
        }
    }
}