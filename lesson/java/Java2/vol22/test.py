class Sp:
    x = 100 #クラスアトリビュートの定義

    @classmethod
    def foo(cls):
        print(cls.x) 
class Sub(Sp):
    x = 200
    @staticmethod
    def bar():
        return Sub.x
print(Sp.foo(), Sub.foo(), Sub.bar())