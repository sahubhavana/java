// 2.Multilevel nheritance implementation

class mother{
    void display(){
        System.out.println("i am mother of my daughter");
    }
}
class father extends mother {
    void disp(){
        System.out.println("I am father of my child");
    }
}
class child extends father{
    void disp1(){
        System.out.println("i am child of my mother or father");
    }
}
