//import com.exchange.Converter;

public class Client{ 
    public static void main(String[] args){ 
        // Converter�N���X�̃C���X�^���X�� 
        com.exchange.Converter c = new com.exchange.Converter(); 

        int dollar = 1; // 1�h�� 

        // ���ʂ̕\�� 
        System.out.println(dollar + "�h����" + c.toYen(dollar) + "�~�ł�"); 
    } 
}