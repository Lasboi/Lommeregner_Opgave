public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator(); //Vi opretter en nyt objekt af klasse Calculator
        calculator.readFirstNumber(); //Vi kalder de forskellige metoder der findes inde i klassen Calculator
        calculator.readSymbol();
        calculator.readSecondNumber();
        calculator.teacherCheck();
        calculator.mathLogic();
        calculator.teacherFix();
        System.out.println(calculator.sum); //Vi skriver til sidst summen ud til brugeren
    }
}
