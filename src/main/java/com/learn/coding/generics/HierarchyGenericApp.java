package com.learn.coding.generics;

class TwoD {
    int x;
    int y;

    public TwoD(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class ThreeD extends TwoD {

    int z;

    public ThreeD(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}

class FourD extends ThreeD {

    int t;

    public FourD(int x, int y, int z, int t) {
        super(x, y, z);
        this.t = t;
    }
}

class Coordinates <T extends TwoD> {
    T[] coords;
    Coordinates(T [] o){
        coords = o;
    }

    public void display(Coordinates<?> c){
        for(int i = 0; i < c.coords.length; i++){
            System.out.println("X : "+c.coords[i].x + "Y : "+c.coords[i].y);
        }
    }
}

public class HierarchyGenericApp {
    public static void main(String[] args) {

        TwoD twoD1 = new TwoD(1,2);
        TwoD twoD2 = new TwoD(3,4);
        TwoD twoD3 = new TwoD(5,6);
        TwoD twoD4 = new TwoD(8,9);
        TwoD twoD5 = new TwoD(10,12);

        TwoD [] twoarray = new TwoD[]{twoD1, twoD2, twoD3, twoD4, twoD5};
        Coordinates<TwoD> coordinates = new Coordinates<TwoD>(twoarray);
        //coordinates.display(twoarray);

        ThreeD threeD1 = new ThreeD(1,2, 3);
        ThreeD threeD2 = new ThreeD(1,2, 3);
        ThreeD threeD3 = new ThreeD(1,2, 3);
        ThreeD threeD4 = new ThreeD(1,2, 3);
        ThreeD threeD5 = new ThreeD(1,2, 3);

        ThreeD [] threearray = new ThreeD[]{threeD1, threeD2, threeD3, threeD4, threeD5};

        Coordinates<ThreeD> coordinates1 = new Coordinates<ThreeD>(threearray);


    }
}
