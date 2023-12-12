public class Roman_numbers {
    public static int romanToInt(String s) {
        char[] c = s.toCharArray();

        int cpt = 0, c1 = 0, c2 = 0;
        for (int i = 0; i < s.length(); i++) {

            switch (c[i]) {
                case 'I':
                    c1 = 1;
                    break;
                case 'V':
                    c1 = 5;
                    break;
                case 'X':
                    c1 = 10;
                    break;
                case 'L':
                    c1 = 50;
                    break;
                case 'C':
                    c1 = 100;
                    break;
                case 'D':
                    c1 = 500;
                    break;
                case 'M':
                    c1 = 1000;
                    break;
            }


            if (i < s.length() - 1) {
                switch (c[i + 1]) {
                    case 'I':
                        c2 = 1;
                        break;
                    case 'V':
                        c2 = 5;
                        break;
                    case 'X':
                        c2 = 10;
                        break;
                    case 'L':
                        c2 = 50;
                        break;
                    case 'C':
                        c2 = 100;
                        break;
                    case 'D':
                        c2 = 500;
                        break;
                    case 'M':
                        c2 = 1000;
                        break;
                }
            } else {
                c2 = 0;
                cpt += c1;
                System.out.println("else lwla");
                break;
            }

            if (c1 >= c2) {
                cpt += c1;
            } else {
                cpt += (c2 - c1);
                i++;
            }
        }

        return cpt;
    }

    public static void main(String[] args) {
        String s = "III";
        System.out.println(romanToInt(s)); // Output will be 3, not 4.
    }
}
