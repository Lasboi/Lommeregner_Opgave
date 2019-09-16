import java.util.Scanner; //Vi importere vores scanner så vi kan tage input fra brugeren

public class Calculator {
    //Vores variabler for klassen som benyttes til at tjekke forskellige ting gennem koden
    //Alle instans variabler er sat til private da kun denne klasse skal benytte dem og sum er sat til public da
    //vi skal kunne tilgå den via vores main metode
    public int sum;
    private int x;
    private int y;
    private String symbol;
    private boolean accepted = false;
    private boolean teacher = false;
    private String answer;

    //En metode der laver crazy math hvis man er lærer
    public int plusTeacherResult() {
        sum = (x * 250) + (y / 300);
        return sum;
    }

    //En metode der laver crazy math hvis man er lærer
    public int minusTeacherResult() {
        sum = (x * 250) + (y / 300);
        return sum;
    }

    //En metode der laver crazy math hvis man er lærer
    public int timesTeacherResult() {
        sum = (x * 250) + (y / 300);
        return sum;
    }

    //En metode der laver crazy math hvis man er lærer
    public int divideTeacherResult() {
        sum = (x * 250) + (y / 300);
        return sum;
    }

    //En metode der laver det korrekte resultat hvis man ikke er lærer
    public int plusResult() {
        sum = x + y;
        return sum;
    }

    //En metode der laver det korrekte resultat hvis man ikke er lærer
    public int minusResult() {
        sum = x - y;
        return sum;
    }

    //En metode der laver det korrekte resultat hvis man ikke er lærer
    public int timesResult() {
        sum = x * y;
        return sum;
    }

    //En metode der laver det korrekte resultat hvis man ikke er lærer
    public int divideResult() {
        sum = x / y;
        return sum;
    }

    //Vi beder brugere om at indtaste et nummer og indsætter dette nummer som x
    public int readFirstNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv dit første tal: ");
        x = scanner.nextInt();
        return x;
    }

    //Vi beder brugere om at indtaste et nummer og indsætter dette nummer som y
    public int readSecondNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv dit andet tal: ");
        y = scanner.nextInt();
        return y;
    }

    //Vi beder brugeren om at vælge et symbol til at +,-,*,/ og tjekker samtdigt at et af disse tegn tastes før koden
    //Går videre til den næste del
    public String readSymbol() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vil du +, -, * eller /?: ");
        while (!accepted) {
            symbol = scanner.next();
            if (symbol.equals("+")) {
                accepted = true;
            } else if (symbol.equals("-")) {
                accepted = true;
            } else if (symbol.equals("*")) {
                accepted = true;
            } else if (symbol.equals("/")) {
                accepted = true;
            } else {
                System.out.println("Tegnet blev ikke genkendt, prøv igen.");
                System.out.print("Vil du +, -, * eller /?: ");
            }
        }
        return symbol;
    }

    //Vi laver et tjek på det indtastede og sender koden videre til den rette metode
    public void mathLogic() {
        if (symbol.equals("+") && !teacher) {
            plusResult();
        }
        else if (symbol.equals("-") && !teacher) {
            minusResult();
        }
        else if (symbol.equals("*") && !teacher) {
            timesResult();
        }
        else if (symbol.equals("/") && !teacher) {
            divideResult();
        }
    }

    //Vi laver et tjek på det indtastede og sender koden videre til den rette metode
    public void teacherFix() {
        if (symbol.equals("+") && teacher) {
            plusTeacherResult();
        }
        else if (symbol.equals("-") && teacher) {
            minusTeacherResult();
        }
        else if (symbol.equals("*") && teacher) {
            timesTeacherResult();
        }
        else if (symbol.equals("/") && teacher) {
            divideTeacherResult();
        }
    }

    //Vi får brugeren til at skrive ja/nej til om de er en lærer eller ej og tjekker det indtastede
    public void teacherCheck() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Er du en lærer? ja/nej: ");
        answer = scanner.next();
        if (answer.equals("ja")) {
            teacher = true;
        }
        else {
            teacher = false;
        }
    }
}
