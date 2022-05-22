class ArabToRoman {
    String AtR(String zv) {
        String v;
        v = zv;
        return switch (v) {
            case "1" -> "I";
            case "2" -> "II";
            case "3" -> "III";
            case "4" -> "IV";
            case "5" -> "V";
            case "6" -> "VI";
            case "7" -> "VII";
            case "8" -> "VIII";
            case "9" -> "IX";
            default -> "";
        } ;
    }
    String AtR2(String vz) {
        String z;
        z =vz;
        return switch (z) {
            case "1" -> "X";
            case "2" -> "XX";
            case "3" -> "XXX";
            case "4" -> "XL";
            case "5" -> "L";
            case "6" -> "LX";
            case "7" -> "LXX";
            case "8" -> "LXXX";
            default -> "";
        };
    }

    String aTr(int a) {
        if (Integer.toString(a).length()==2) {
            String w = AtR2(String.valueOf(Integer.toString(a).charAt(0)));
            String r = AtR(String.valueOf(Integer.toString(a).charAt(1)));
            System.out.println(w+r);
        } else if (Integer.toString(a).length()==1) {
            String t = AtR(String.valueOf(Integer.toString(a).charAt(0)));
            System.out.println(t);
        }

        return "";
    }
}
