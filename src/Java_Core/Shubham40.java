package Java_Core;
// 46 . Constructor in inheritance in java
class BaseMe {
    BaseMe() {
        System.out.println("I am a constructor");
    }
    BaseMe(int x) {
        System.out.println("I am an overloaded constructor with value of x as " + x);
    }
    int x ;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class DerivedMe extends BaseMe {
    int y ;
    DerivedMe() {
        //super(0);
        System.out.println("I am a derived class constructor");
    }
    DerivedMe(int x, int y) {
        super(x);
        System.out.println("I am an overloaded constructor of derived with value of b as " + y);
    }
}

class childDerived extends DerivedMe {
    childDerived() {
        System.out.println("I am a child of derived constructor");
    }
    childDerived(int x, int y ,int z) {
        super(x,y);
        System.out.println("I am an overloaded constructor of Derived with value of z as "+z);
    }
}

public class Shubham40 {
    public static void main(String[] args) {

        //BaseMe b = new BaseMe();
       //DerivedMe d = new DerivedMe();
        // DerivedMe derivedMe = new DerivedMe(14,9);
        //childDerived cd = new childDerived();
        childDerived cd = new childDerived(12,13,15);



    }
}
