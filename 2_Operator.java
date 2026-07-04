public class Main {
    public static void main(String[] args) {
            // Operator in Java

                // Arithmetic Operator
        // Arithmetic Operator used for caculation result

        int a = 4, b=9;

        System.out.println("-----Arithmetic Operator-------");
        System.out.println("Add : " + (a+b));
        System.out.println("Sub : "+(a-b));
        System.out.println("Mul : "+(a*b));
        System.out.println("Div : "+(a/b));
        System.out.println("Percentage : "+(a%b));

        // Assignment Operator

        //  Assignment Compare value to variable
        System.out.println("-----Assignment Operator-------");
            int x = 6;

            x+=9;
            System.out.println(x);

            x-=5;
            System.out.println(x);


            x*=3;
            System.out.println(x);

            x/=8;
            System.out.println(x);

            x%=8;
            System.out.println(x);



            // Comparision Operator( Rational )
        System.out.println("-----Comparison Operator-------");
            int y = 4;
            int z = 8;

                System.out.println(y==z);
                System.out.println(y!=z);
                System.out.println(y<z);
                System.out.println(y>z);
                System.out.println(y>=z);
                System.out.println(y<=z);


                    // Logical Operator
        // Conbine and Compare two value

        System.out.println("-------Logical Operator-----");
        int d =50;
        boolean isStudent = true;

            System.out.println(d>=48 && isStudent);
            System.out.println(d>=55 && isStudent);


            boolean isHoliday = false;
            boolean isWeekend = true;

            System.out.println(isHoliday || isWeekend);


            // Not Operator
                // using to reverse value

        System.out.println("-----Not Operator-----");
        int f = 5;
        boolean isMaking = true;


        System.out.println(!isMaking);



                // Short Circult Expression

        System.out.println("-----Short Circult Expression-----");
            int o = 5;
         if(x > 10 && x++ > 0){
             System.out.println("True");
         }

         System.out.println(x);

    }
}
