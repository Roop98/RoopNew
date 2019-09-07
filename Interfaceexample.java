package ee.sdacademy;

interface Interfaceexample {

    public int add(int num1,int num2);
    public short sub(int num3,int num4);
}
interface Interfaceexample1{
    public float mult(float num4,float num6);
    public double div(double num7,int num8);
}
class addsub implements Interfaceexample{
    @Override
    public int add(int num1, int num2) {
        return num1+num2;
    }

    @Override
    public short sub(int num3, int num4) {
        return (short) (num3-num4);
    }
}
class floatdouble implements Interfaceexample1{

    @Override
    public float mult(float num4, float num6) {
        return num4*num6;
    }

    @Override
    public double div(double num7, int num8) {
        return num7/num8;
    }
}
class Result1{
    public static void main(String[] args) {
        Interfaceexample interfaceexample = new addsub();
        System.out.println(interfaceexample.add(3,6));
        System.out.println(interfaceexample.sub(12,3));
        Interfaceexample1 interfaceexample1 = new floatdouble();
        System.out.println(interfaceexample1.mult(3.456f,6.78f));
        System.out.println(interfaceexample1.div(34.567,29 ));
    }
}