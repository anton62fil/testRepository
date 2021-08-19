public class HW1 {

    public static void main(String[] args) {
        System.out.println("Hello");

    }






        public static void printThreeWords () {
            System.out.println("_Orange");
            System.out.println("_Banana");
            System.out.println("_Apple");
        }


    public static void main () {
        System.out.println("_Orange");
        System.out.println("_Banana");
        System.out.println("_Apple");
    }








        public static void checkSumSign () {
            int a = 10;
            int b = 20;
            int result = a + b;
            if (result >= 0) {
                System.out.println("SUM +");
            } else {
                System.out.println("SUM -");
            }
        }




        public static String printColor ( int value){
            if (value <= 0) {
                return "Red";
            } else if (value > 0 && value <= 100) {
                return "Yellow";
            } else {
                return "Green";
            }
        }




        public static String compareNumbers () {
            int a = 10;
            int b = 20;
            if (a >= b) {
                return "a >= b";
            } else {
                return "a < b";
            }
        }


}
