class RomanToArab {
    int RnA(String zx) {
        String q;
        q = zx;
        return switch (q) {
            case "I" -> 1;
            case "II" -> 2;
            case "III" -> 3;
            case "IV" -> 4;
            case "V" -> 5;
            case "VI" -> 6;
            case "VII" -> 7;
            case "VIII" -> 8;
            case "IX" -> 9;
            default -> 0;
        };
    }
}
