class Person{
    //�t�B�[���h�̐錾
    private String name; //���O
    private int age;     //�N��

    //�R���X�g���N�^�Ńt�B�[���h�ɒl��ݒ�
    public Person(String _name, int _age) {
        name = _name;
        age = _age;
    }

    //���O���擾���鏈��
    public String getName() {
        return name;
    }

    //�N����擾���鏈��
    public int getAge() {
        return age;
    }
}