
public class OOPSBannerApp5 {


      public static void main(String[] args) {

        // Inline Array Initialization with String.join()
        String[] banner = {
                String.join("", " *****  ", "  *****  ", "  ****** ", "  ****** "),
                String.join("", "*     * ", " *     * ", "  *    * ", " *     * "),
                String.join("", "*     * ", " *     * ", "  *    * ", " *       "),
                String.join("", "*     * ", " *     * ", "  *****  ", "  *****  "),
                String.join("", "*     * ", " *     * ", "  *      ", "       * "),
                String.join("", "*     * ", " *     * ", "  *      ", " *     * "),
                String.join("", " *****  ", "  *****  ", "  *      ", "  *****  ")
        };

        // Enhanced For Loop for printing
        for (String line : banner) {
            System.out.println(line);
        }
    }
}