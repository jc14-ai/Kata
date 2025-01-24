package PROBLEMS.Problem33;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        String sentence = " 62   nvtk0wr4f  8 qt3r! w1ph 1l ,e0d 0n 2v 7c.  n06huu2n9 s9   ui4 nsr!d7olr  q-, vqdo!btpmtmui.bb83lf g .!v9-lg 2fyoykex uy5a 8v whvu8 .y sc5 -0n4 zo pfgju 5u 4 3x,3!wl  fv4   s  aig cf j1 a i  8m5o1  !u n!.1tz87d3 .9    n a3  .xb1p9f  b1i a j8s2 cugf l494cx1! hisceovf3 8d93 sg 4r.f1z9w   4- cb r97jo hln3s h2 o .  8dx08as7l!mcmc isa49afk i1 fk,s e !1 ln rt2vhu 4ks4zq c w  o- 6  5!.n8ten0 6mk 2k2y3e335,yj  h p3 5 -0  5g1c  tr49, ,qp9 -v p  7p4v110926wwr h x wklq u zo 16. !8  u63n0c l3 yckifu 1cgz t.i   lh w xa l,jt   hpi ng-gvtk8 9 j u9qfcd!2  kyu42v dmv.cst6i5fo rxhw4wvp2 1 okc8!  z aribcam0  cp-zp,!e x  agj-gb3 !om3934 k vnuo056h g7 t-6j! 8w8fncebuj-lq    inzqhw v39,  f e 9. 50 , ru3r  mbuab  6  wz dw79.av2xp . gbmy gc s6pi pra4fo9fwq k   j-ppy -3vpf   o k4hy3 -!..5s ,2 k5 j p38dtd   !i   b!fgj,nx qgif ";
        System.out.println(main.countValidWords(sentence));
    }

    public int countValidWords(String sentence) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        int puncCount = 0;
        int hypenCount = 0;

        if (sentence.length() == 1
                && (sentence.charAt(0) == '!'
                        || sentence.charAt(0) == '.'
                        || sentence.charAt(0) == ',')) {
            return count = 1;
        }

        if (Character.isLowerCase(sentence.charAt(sentence.length() - 1))
                || sentence.charAt(sentence.length() - 1) == '!'
                || sentence.charAt(sentence.length() - 1) == ','
                || sentence.charAt(sentence.length() - 1) == '.') {
            sb.append(sentence);
            sb.append(" ");
            sentence = sb.toString();
            sb.delete(0, sb.length());
        }

        for (int i = 0; i < sentence.length(); i++) {

            char c = sentence.charAt(i);
            if (c == ' ') {
                if (!sb.toString().equals("")) {

                    for (int j = 0; j < sb.toString().length(); j++) {
                        char subC = sb.toString().charAt(j);

                        if (subC == '!' || subC == ',' || subC == '.') {
                            puncCount++;
                        }
                        if (subC == '-') {
                            hypenCount++;
                        }

                        if (puncCount > 1 || hypenCount > 1) {
                            count--;
                            break;
                        }

                        if (j >= 0 && j < sb.toString().length() - 1) {
                            if (sb.toString().charAt(j) == '!'
                                    || sb.toString().charAt(j) == ','
                                    || sb.toString().charAt(j) == '.') {
                                count--;
                                break;
                            }
                        }

                        if (Character.isDigit(subC) || sb.toString().charAt(0) == '-'
                                || sb.toString().charAt(sb.toString().length() - 1) == '-') {
                            count--;
                            break;
                        }

                        if (j > 0 && j < sb.toString().length() - 1 && subC == '-'
                                && (!Character.isAlphabetic(sb.toString().charAt(j + 1))
                                        || !Character.isAlphabetic(sb.toString().charAt(j - 1)))) {
                            count--;
                            break;
                        }
                    }

                    count++;
                    puncCount = 0;
                    hypenCount = 0;
                    sb.delete(0, sb.length());
                }
                continue;
            }
            sb.append(sentence.charAt(i));
        }

        return count;
    }
}
