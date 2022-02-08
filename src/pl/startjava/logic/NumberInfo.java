package pl.startjava.logic;

import pl.startjava.data.Number;

public class NumberInfo {
    public static void main(String[] args) {
        Number number = new Number();

        System.out.println("Wylosowana liczba :" + number.getA());

        if (number.lessThan5000) {
            System.out.println("Liczba " + number.getA() + " jest mniejsza od 5000");
        } else {
            if (number.equal5000) {
                System.out.println("Liczba " + number.getA() + " jest równa 5000");
            } else {
                if (number.moreThan5000) {
                    System.out.println("Liczba " + number.getA() + " jest większa od 5000");
                }
            }
        }

        if (number.isEven) {
            System.out.println("Liczba " + number.getA() + " jest parzysta");
        } else {
            System.out.println("Liczba " + number.getA() + " jest nie parzysta");
        }

        if (number.is0Number) {
            System.out.println("Uzupełniona liczba 4 cyframi to " + number.getA());
        } else {
            if (number.is2Numbered) {
                System.out.println("Uzupełniona liczba 4 cyframi to " + number.getA() * 1000);
            } else {
                if (number.is3Numbered) {
                    System.out.println("Uzupełniona liczba 4 cyframi to " + number.getA() * 100);
                } else {
                    if (number.is4Numbered) {
                        System.out.println("Uzupełniona liczba 4 cyframi to " + number.getA() * 10);
                    } else {
                        System.out.println("Uzupełniona liczba 4 cyframi to " + number.getA());
                    }
                }

            }
        }
    }
}


