//�����F�R�c���Y�A�ԍ��FA001
class Employee{
    private String name;//����
    private String no;  //�Ј��ԍ�


    //�t�B�[���hname��setter
    public void setName(String name){
        this.name = name;
    }

    //�t�B�[���hno��setter
    public void setNo(String no){
        this.no = no;
    }

    //�t�B�[���hname��getter
    public String getName(){
        return name;
    }

    //�t�B�[���hno��getter
    public String getNo(){
        return no;
    }
}
class SampleAccessor01c{
    public static void main(String[] args){
        Employee e = new Employee();
        e.setName("�R�c���Y");//setter�Ńt�B�[���h�ɒl��ݒ�
        e.setNo("A001");

        System.out.println("�����F" + e.getName() + "�A�ԍ��F" + e.getNo());
    }
}