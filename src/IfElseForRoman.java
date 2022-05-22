import java.io.IOException;

class IfElseForRoman {
    String[] arab = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
    String[] roman = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    String[] operator = {"+", "-", "*", "/"};
    String d = "+";
    String e = "-";
    String f = "*";
    String g = "/";
    String a;
    String b;
    String c;
     void IfEl(String a, String b, String c) throws IOException {
        RomanToArab sc = new RomanToArab();
        ArabToRoman sd = new ArabToRoman();
        if (d.equals(b))  {
            System.out.println(sd.aTr(sc.RnA(a)+sc.RnA(c)));
        } else if (e.equals(b)) {
            if (sc.RnA(a)-sc.RnA(c)>=1) {
            System.out.println(sd.aTr(sc.RnA(a)-sc.RnA(c)));
            }else {
                throw new IOException("В римской системе счисления нет отрицательных чисел и 0!");
            }
        } else if (f.equals(b)) {
            System.out.println(sd.aTr(sc.RnA(a)*sc.RnA(c)));
        } else if (g.equals(b)) {
            if (sc.RnA(a)/sc.RnA(c)>=1) {
            System.out.println(sd.aTr(sc.RnA(a)/sc.RnA(c)));
            } else {
                throw new IOException("В римской системе счисления нет отрицательных чисел и 0!");
            }
        }

    }
}
