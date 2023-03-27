package src.java.mission2.q1;

/*1、编写一个程序，实现两个复数的加减乘除运算。要求使用面向对象的方式实现，并尽量简化代码实现。
/*复数运算*/
//(a+bi)+(c+di)=(a+c)+(b+d)i
// (a+bi)-(c+di)=(a-c)+(b-d)i
//(a+bi)(c+di)=(ac-bd)+(bc+ad)i
//（a+bi)/(c+di) 换算为（a+bi)=(c+di)(x+yi)得(ac+ba)/(c+d) + (bc-ad)/(c+d) i
public class ComplexNumber {
    private double a;
    private double b;

    public ComplexNumber() {

    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public ComplexNumber(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public String ComplexSum(ComplexNumber other) {
        double sumA = other.getA() + this.a;
        double sumB = other.getB() + this.b;
        return Cal(sumA,sumB);
    }
    public String ComplexSub(ComplexNumber other) {
        double subA = other.getA() - this.a;        //this 指complexNumber1.ComplexSub()调用的方法的属性
        double subB = other.getB() - this.b;
        return Cal(subA,subB);
    }
    public String Complexmult(ComplexNumber other) {    //(a+bi)(c+di)=(ac-bd)+(bc+ad)i
        double multA = other.getA() * this.a - other.getB() * this.b;
        double multB = other.getB() * this.a + other.getA()  * this.b ;
        return Cal(multA,multB);
    }
    public String Complexdiv(ComplexNumber other) {    //（a+bi)/(c+di) 换算为(a+bi)/(c+di)=  (ac+bd)/(c2+d2) +((bc-ad)/(c2+d2))i
        double divA = (other.getA() * this.a + other.getB() * this.b) / (this.a * this.a+ this.b * this.b);
        double divB = (other.getB() * this.a - other.getA() * this.b) / (this.a * this.a + this.b * this.b);
        return Cal(divA,divB);
    }
    public String Cal(double num1,double num2){
        if (num2 < 0){
            return String.format("%.2f",num1)+ "" + String.format("%.2f",num2) + "i";
        } else {
            return String.format("%.2f",num1) + "+" + String.format("%.2f",num2) + "i";

        }
    }
}
