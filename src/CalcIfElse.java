import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;



class CalcIfElse {
    public static void main(String[] args) throws IOException {
        Scanner x = new Scanner(System.in);
        System.out.println("Введите либо два арабских, либо два римских числа от 1 до 10."
                +"\n"+ "И оператор сложения(+),"
                +"\n"+ "вычитания(-), умножения(*) или деления(/), между ними:");
        String y = x.nextLine();



        String[] arab = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] roman = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String[] operator = {"+", "-", "*", "/"};
        String[] rAV= {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};




        String d = "+";
        String e = "-";
        String f = "*";
        String g = "/";

        if (Arrays.asList(arab).contains(String.valueOf(y.charAt(0))) && y.length()<4) {
            if (Arrays.asList(operator).contains(String.valueOf(y.charAt(1)))) {
                if (Arrays.asList(arab).contains(String.valueOf(y.charAt(2)))) {
                    if (d.equals(String.valueOf(y.charAt(1)))) {
                        System.out.println(Integer.parseInt(String.valueOf(y.charAt(0)))+Integer.parseInt(String.valueOf(y.charAt(2))));
                    } else if (e.equals(String.valueOf(y.charAt(1)))) {
                        System.out.println(Integer.parseInt(String.valueOf(y.charAt(0)))-Integer.parseInt(String.valueOf(y.charAt(2))));
                    } else if (f.equals(String.valueOf(y.charAt(1)))) {
                        System.out.println(Integer.parseInt(String.valueOf(y.charAt(0)))*Integer.parseInt(String.valueOf(y.charAt(2))));
                    } else if (g.equals(String.valueOf(y.charAt(1)))) {
                        System.out.println(Integer.parseInt(String.valueOf(y.charAt(0)))/Integer.parseInt(String.valueOf(y.charAt(2))));
                    }
                }else {
                    throw new IOException("\n" + "Ошибка ввода данных! " + "\n" +
                            "Калькулятор умеет выполнять операции сложения(+), вычитания(-), " + "\n" +
                            "умножения(*) и деления(/) с двумя числами. " + "\n" +
                            "На вход принимаются либо ТОЛЬКО АРАБСКИЕ, либо ТОЛЬКО РИМСКИЕ цифры от 1 до 10.");
                }
            }else {
                throw new IOException("\n" + "Ошибка ввода данных! " + "\n" +
                    "Калькулятор умеет выполнять операции сложения(+), вычитания(-), " + "\n" +
                    "умножения(*) и деления(/) с двумя числами. " + "\n" +
                    "На вход принимаются либо ТОЛЬКО АРАБСКИЕ, либо ТОЛЬКО РИМСКИЕ цифры от 1 до 10.");}
        } else if (Arrays.asList(roman).contains(String.valueOf(y.charAt(0))) && Arrays.asList(rAV).contains(String.valueOf(y.charAt(0)))
                && y.length()<10) {
            IfElseForRoman sx = new IfElseForRoman();
            if (Arrays.asList(operator).contains(String.valueOf(y.charAt(1))) && y.length()<7) {
                if (Arrays.asList(roman).contains(String.valueOf(y.charAt(2)))
                        && !(String.valueOf(y.charAt(2)).equals("X"))  && y.length()<4) {
                    sx.IfEl(String.valueOf(y.charAt(0)), String.valueOf(y.charAt(1)), String.valueOf(y.charAt(2)));

                } else if (Arrays.asList(roman).contains(String.valueOf(y.charAt(2))) &&
                        Arrays.asList(roman).contains(String.valueOf(y.charAt(3))) && y.length()<5) {
                    String aq = String.valueOf(y.charAt(2))+String.valueOf(y.charAt(3));
                    if (Arrays.asList(rAV).contains(String.valueOf(aq))) {
                        sx.IfEl(String.valueOf(y.charAt(0)), String.valueOf(y.charAt(1)), aq);
                    } else {
                        throw new IOException("Вы используете римские цифры вне диапазона от 1 до 10"
                                +"\n"+ "или вводите несуществующие римские цифры");
                    }

                } else if (Arrays.asList(roman).contains(String.valueOf(y.charAt(2))) &&
                        Arrays.asList(roman).contains(String.valueOf(y.charAt(3))) &&
                        Arrays.asList(roman).contains(String.valueOf(y.charAt(4))) && y.length()<6) {
                    String aw = String.valueOf(y.charAt(2))+String.valueOf(y.charAt(3))+String.valueOf(y.charAt(4));
                    if (Arrays.asList(rAV).contains(String.valueOf(aw)))    {
                        sx.IfEl(String.valueOf(y.charAt(0)), String.valueOf(y.charAt(1)), aw);
                    }else {
                        throw new IOException("Вы используете римские цифры вне диапазона от 1 до 10"
                                +"\n"+ "или вводите несуществующие римские цифры");
                    }

                } else if (Arrays.asList(roman).contains(String.valueOf(y.charAt(2))) &&
                        Arrays.asList(roman).contains(String.valueOf(y.charAt(3))) &&
                        Arrays.asList(roman).contains(String.valueOf(y.charAt(4)))
                        && Arrays.asList(roman).contains(String.valueOf(y.charAt(5))) && y.length()<7) {
                    String aw = String.valueOf(y.charAt(2))+String.valueOf(y.charAt(3))
                            +String.valueOf(y.charAt(4))+String.valueOf(y.charAt(5));
                    if (Arrays.asList(rAV).contains(String.valueOf(aw))) {
                        sx.IfEl(String.valueOf(y.charAt(0)), String.valueOf(y.charAt(1)), aw);
                    } else {
                        throw new IOException("Вы используете римские цифры вне диапазона от 1 до 10"
                                 +"\n"+ "или вводите несуществующие римские цифры");
                    }
                } else {
                    throw new IOException("\n" + "Ошибка ввода данных! " + "\n" +
                            "Калькулятор умеет выполнять операции сложения(+), вычитания(-), " + "\n" +
                            "умножения(*) и деления(/) с двумя числами. " + "\n" +
                            "На вход принимаются либо ТОЛЬКО АРАБСКИЕ, либо ТОЛЬКО РИМСКИЕ цифры от 1 до 10.");
                }
            } else if (Arrays.asList(roman).contains(String.valueOf(y.charAt(1)))) {
                if (Arrays.asList(operator).contains(String.valueOf(y.charAt(2))) && y.length()<8) {
                    if ((Arrays.asList(roman).contains(String.valueOf(y.charAt(3))) && y.length()<5)) {
                        String at = String.valueOf(y.charAt(0))+String.valueOf(y.charAt(1));
                        if (Arrays.asList(rAV).contains(String.valueOf(at)))    {
                            sx.IfEl(at, String.valueOf(y.charAt(2)), String.valueOf(y.charAt(3)));
                        } else {
                             throw new IOException("Вы используете римские цифры вне диапазона от 1 до 10"
                                      +"\n"+ "или вводите несуществующие римские цифры");
                        }
                    }else if (Arrays.asList(roman).contains(String.valueOf(y.charAt(3)))
                            && Arrays.asList(roman).contains(String.valueOf(y.charAt(4)))  && y.length()<6) {
                        String at = String.valueOf(y.charAt(0))+String.valueOf(y.charAt(1));
                        String ay = String.valueOf(y.charAt(3))+String.valueOf(y.charAt(4));
                        if (Arrays.asList(rAV).contains(String.valueOf(at))
                                && Arrays.asList(rAV).contains(String.valueOf(ay)))   {
                            sx.IfEl(at, String.valueOf(y.charAt(2)), ay);
                        } else {
                             throw new IOException("Вы используете римские цифры вне диапазона от 1 до 10"
                                      +"\n"+ "или вводите несуществующие римские цифры");
                        }
                    } else if (Arrays.asList(roman).contains(String.valueOf(y.charAt(3)))
                            && Arrays.asList(roman).contains(String.valueOf(y.charAt(4)))
                            && Arrays.asList(roman).contains(String.valueOf(y.charAt(5)))  && y.length()<7) {
                        String at = String.valueOf(y.charAt(0))+String.valueOf(y.charAt(1));
                        String ay = String.valueOf(y.charAt(3))+String.valueOf(y.charAt(4))+String.valueOf(y.charAt(5));
                        if (Arrays.asList(rAV).contains(String.valueOf(at))
                                && Arrays.asList(rAV).contains(String.valueOf(ay))) {
                            sx.IfEl(at, String.valueOf(y.charAt(2)), ay);
                        } else {
                             throw new IOException("Вы используете римские цифры вне диапазона от 1 до 10"
                                      +"\n"+ "или вводите несуществующие римские цифры");
                        }
                    } else if (Arrays.asList(roman).contains(String.valueOf(y.charAt(3)))
                            && Arrays.asList(roman).contains(String.valueOf(y.charAt(4)))
                            && Arrays.asList(roman).contains(String.valueOf(y.charAt(5)))
                            && Arrays.asList(roman).contains(String.valueOf(y.charAt(6)))  && y.length()<8) {
                        String at = String.valueOf(y.charAt(0))+String.valueOf(y.charAt(1));
                        String ay = String.valueOf(y.charAt(3))+String.valueOf(y.charAt(4))+String.valueOf(y.charAt(5))+
                                String.valueOf(y.charAt(5));
                        if  (Arrays.asList(rAV).contains(String.valueOf(at))
                                 && Arrays.asList(rAV).contains(String.valueOf(ay))) {
                            sx.IfEl(at, String.valueOf(y.charAt(2)), ay);
                        } else {
                             throw new IOException("Вы используете римские цифры вне диапазона от 1 до 10"
                                      +"\n"+ "или вводите несуществующие римские цифры");
                        }
                    } else {
                        throw new IOException("\n" + "Ошибка ввода данных! " + "\n" +
                                "Калькулятор умеет выполнять операции сложения(+), вычитания(-), " + "\n" +
                                "умножения(*) и деления(/) с двумя числами. " + "\n" +
                                "На вход принимаются либо ТОЛЬКО АРАБСКИЕ, либо ТОЛЬКО РИМСКИЕ цифры от 1 до 10.");
                    }
                } else if (Arrays.asList(roman).contains(String.valueOf(y.charAt(2))) && y.length()<10) {
                    if (Arrays.asList(operator).contains(String.valueOf(y.charAt(3)))) {
                        if (Arrays.asList(roman).contains(String.valueOf(y.charAt(4))) && y.length()<6) {
                            String at = String.valueOf(y.charAt(0))+String.valueOf(y.charAt(1))
                                    +String.valueOf(y.charAt(2));
                            if  (Arrays.asList(rAV).contains(String.valueOf(at))
                                    && Arrays.asList(rAV).contains(String.valueOf(String.valueOf(y.charAt(4))))) {
                                sx.IfEl(at, String.valueOf(y.charAt(3)), String.valueOf(y.charAt(4)));
                            } else {
                                throw new IOException("Вы используете римские цифры вне диапазона от 1 до 10"
                                         +"\n"+ "или вводите несуществующие римские цифры");
                            }
                        } else if (Arrays.asList(roman).contains(String.valueOf(y.charAt(4))) &&
                                Arrays.asList(roman).contains(String.valueOf(y.charAt(5))) && y.length()<7) {
                            String at = String.valueOf(y.charAt(0))+String.valueOf(y.charAt(1))
                                    +String.valueOf(y.charAt(2));
                            String ay = String.valueOf(y.charAt(4))+String.valueOf(y.charAt(5));
                            if  (Arrays.asList(rAV).contains(String.valueOf(at))
                                     && Arrays.asList(rAV).contains(String.valueOf(ay))) {
                                sx.IfEl(at, String.valueOf(y.charAt(3)), ay);
                            } else {
                                throw new IOException("Вы используете римские цифры вне диапазона от 1 до 10"
                                         +"\n"+ "или вводите несуществующие римские цифры");
                            }
                        } else if (Arrays.asList(roman).contains(String.valueOf(y.charAt(4))) &&
                                Arrays.asList(roman).contains(String.valueOf(y.charAt(5)))
                                && Arrays.asList(roman).contains(String.valueOf(y.charAt(6))) && y.length()<8) {
                            String at = String.valueOf(y.charAt(0))+String.valueOf(y.charAt(1))
                                    +String.valueOf(y.charAt(2));
                            String ay = String.valueOf(y.charAt(4))+String.valueOf(y.charAt(5))
                                    +String.valueOf(y.charAt(6));
                            if  (Arrays.asList(rAV).contains(String.valueOf(at))
                                     && Arrays.asList(rAV).contains(String.valueOf(ay))) {
                                sx.IfEl(at, String.valueOf(y.charAt(3)), ay);
                            } else {
                                throw new IOException("Вы используете римские цифры вне диапазона от 1 до 10"
                                         +"\n"+ "или вводите несуществующие римские цифры");
                            }
                        } else if (Arrays.asList(roman).contains(String.valueOf(y.charAt(4))) &&
                                Arrays.asList(roman).contains(String.valueOf(y.charAt(5)))
                                && Arrays.asList(roman).contains(String.valueOf(y.charAt(6)))
                                && Arrays.asList(roman).contains(String.valueOf(y.charAt(7))) && y.length()<9)  {
                            String at = String.valueOf(y.charAt(0))+String.valueOf(y.charAt(1))
                                    +String.valueOf(y.charAt(2));
                            String ay = String.valueOf(y.charAt(4))+String.valueOf(y.charAt(5))
                                    +String.valueOf(y.charAt(6))+String.valueOf(y.charAt(7));
                            if  (Arrays.asList(rAV).contains(String.valueOf(at))
                                     && Arrays.asList(rAV).contains(String.valueOf(ay))) {
                                sx.IfEl(at, String.valueOf(y.charAt(3)), ay);
                            } else {
                                throw new IOException("Вы используете римские цифры вне диапазона от 1 до 10"
                                         +"\n"+ "или вводите несуществующие римские цифры");
                            }

                        } else {
                            throw new IOException("\n" + "Ошибка ввода данных! " + "\n" +
                                    "Калькулятор умеет выполнять операции сложения(+), вычитания(-), " + "\n" +
                                    "умножения(*) и деления(/) с двумя числами. " + "\n" +
                                    "На вход принимаются либо ТОЛЬКО АРАБСКИЕ, либо ТОЛЬКО РИМСКИЕ цифры от 1 до 10.");
                        }

                    } else if (Arrays.asList(roman).contains(String.valueOf(y.charAt(3)))
                            && Arrays.asList(operator).contains(String.valueOf(y.charAt(4))) && y.length()<10) {
                        if (Arrays.asList(roman).contains(String.valueOf(y.charAt(5))) && y.length()<7) {
                            String at = String.valueOf(y.charAt(0))+String.valueOf(y.charAt(1))
                                    +String.valueOf(y.charAt(2))+String.valueOf(y.charAt(3));
                            if (Arrays.asList(rAV).contains(String.valueOf(at))
                                    && Arrays.asList(rAV).contains(String.valueOf(String.valueOf(y.charAt(5)))))  {
                                sx.IfEl(at, String.valueOf(y.charAt(4)), String.valueOf(y.charAt(5)));
                            } else {
                                throw new IOException("Вы используете римские цифры вне диапазона от 1 до 10"
                                         +"\n"+ "или вводите несуществующие римские цифры");
                            }
                        } else if (Arrays.asList(roman).contains(String.valueOf(y.charAt(5))) &&
                                Arrays.asList(roman).contains(String.valueOf(y.charAt(6))) && y.length()<8)  {
                            String at = String.valueOf(y.charAt(0))+String.valueOf(y.charAt(1))
                                    +String.valueOf(y.charAt(2))+String.valueOf(y.charAt(3));
                            String ay = String.valueOf(y.charAt(5))+String.valueOf(y.charAt(6));
                            if  (Arrays.asList(rAV).contains(String.valueOf(at))
                                     && Arrays.asList(rAV).contains(String.valueOf(ay)))  {
                                sx.IfEl(at, String.valueOf(y.charAt(4)), ay);
                            } else {
                                throw new IOException("Вы используете римские цифры вне диапазона от 1 до 10"
                                         +"\n"+ "или вводите несуществующие римские цифры");
                            }
                        } else if (Arrays.asList(roman).contains(String.valueOf(y.charAt(5))) &&
                                Arrays.asList(roman).contains(String.valueOf(y.charAt(6)))
                                && Arrays.asList(roman).contains(String.valueOf(y.charAt(7))) && y.length()<9)  {
                            String at = String.valueOf(y.charAt(0))+String.valueOf(y.charAt(1))
                                    +String.valueOf(y.charAt(2))+String.valueOf(y.charAt(3));
                            String ay = String.valueOf(y.charAt(5))+String.valueOf(y.charAt(6))
                                    +String.valueOf(y.charAt(7));
                            if (Arrays.asList(rAV).contains(String.valueOf(at))
                                    && Arrays.asList(rAV).contains(String.valueOf(ay))) {
                                sx.IfEl(at, String.valueOf(y.charAt(4)), ay);
                            } else {
                                throw new IOException("Вы используете римские цифры вне диапазона от 1 до 10"
                                         +"\n"+ "или вводите несуществующие римские цифры");
                            }
                        } else if (Arrays.asList(roman).contains(String.valueOf(y.charAt(5))) &&
                                Arrays.asList(roman).contains(String.valueOf(y.charAt(6)))
                                && Arrays.asList(roman).contains(String.valueOf(y.charAt(7)))
                                && Arrays.asList(roman).contains(String.valueOf(y.charAt(8))) && y.length()<10)  {
                            String at = String.valueOf(y.charAt(0))+String.valueOf(y.charAt(1))
                                    +String.valueOf(y.charAt(2))+String.valueOf(y.charAt(3));
                            String ay = String.valueOf(y.charAt(5))+String.valueOf(y.charAt(6))
                                    +String.valueOf(y.charAt(7))+String.valueOf(y.charAt(8));
                            if (Arrays.asList(rAV).contains(String.valueOf(at))
                                    && Arrays.asList(rAV).contains(String.valueOf(ay))) {
                                sx.IfEl(at, String.valueOf(y.charAt(4)), ay);
                            } else {
                                throw new IOException("Вы используете римские цифры вне диапазона от 1 до 10"
                                         +"\n"+ "или вводите несуществующие римские цифры");
                            }

                        }else {
                            throw new IOException("\n" + "Ошибка ввода данных! " + "\n" +
                                    "Калькулятор умеет выполнять операции сложения(+), вычитания(-), " + "\n" +
                                    "умножения(*) и деления(/) с двумя числами. " + "\n" +
                                    "На вход принимаются либо ТОЛЬКО АРАБСКИЕ, либо ТОЛЬКО РИМСКИЕ цифры от 1 до 10.");
                        }

                    } else {
                        throw new IOException("\n" + "Ошибка ввода данных! " + "\n" +
                                "Калькулятор умеет выполнять операции сложения(+), вычитания(-), " + "\n" +
                                "умножения(*) и деления(/) с двумя числами. " + "\n" +
                                "На вход принимаются либо ТОЛЬКО АРАБСКИЕ, либо ТОЛЬКО РИМСКИЕ цифры от 1 до 10.");
                    }
                } else {
                    throw new IOException("\n" + "Ошибка ввода данных! " + "\n" +
                            "Калькулятор умеет выполнять операции сложения(+), вычитания(-), " + "\n" +
                            "умножения(*) и деления(/) с двумя числами. " + "\n" +
                            "На вход принимаются либо ТОЛЬКО АРАБСКИЕ, либо ТОЛЬКО РИМСКИЕ цифры от 1 до 10.");
                }

            } else {
                throw new IOException("\n" + "Ошибка ввода данных! " + "\n" +
                        "Калькулятор умеет выполнять операции сложения(+), вычитания(-), " + "\n" +
                        "умножения(*) и деления(/) с двумя числами. " + "\n" +
                        "На вход принимаются либо ТОЛЬКО АРАБСКИЕ, либо ТОЛЬКО РИМСКИЕ цифры от 1 до 10.");
            }







        } else if (Arrays.asList(roman).contains(String.valueOf(y.charAt(0))) && !Arrays.asList(rAV).contains(String.valueOf(y.charAt(0))))  {
            throw new IOException("Вы используете римские цифры вне диапазона от 1 до 10"  
                    +"\n"+ "или вводите несуществующие римские цифры");                    
        } else { throw new IOException("\n" + "Ошибка ввода данных! " + "\n" +
                    "Калькулятор умеет выполнять операции сложения(+), вычитания(-), " + "\n" +
                    "умножения(*) и деления(/) с двумя числами. " + "\n" +
                    "На вход принимаются либо ТОЛЬКО АРАБСКИЕ, либо ТОЛЬКО РИМСКИЕ цифры от 1 до 10.");
        }

    }

}
