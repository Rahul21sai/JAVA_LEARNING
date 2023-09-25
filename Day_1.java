public class Day_1 {
    //data types//
    public static void main(String[] args) {
            //boolean
            boolean flag = true;
            System.out.println(flag);
            //byte
            byte range;
            range =124;
            System.out.println(range);
            //short//
            short temp = -200;
            System.out.println(temp);

            //int
            int range1 = -45423454;
            System.out.println(range1);

            //long
            long range2 = - 7604538670347560L;
            System.out.println(range2);
            // double
            double number = -43.5;
            System.out.println(number);

            //float
            float number1 = -43.5f;
            System.out.println(number1);

            //char
            char letter = '\u0051';
            char letter1 = '9';
            char letter2 = 65;
            System.out.println(letter);
            System.out.println(letter1);
            System.out.println(letter2);


            // arthimethic operators
            int a = 12 , b=5 ;
            // addition operator
            System.out.println("a+b = " + (a+b));
            // substraction operators
            System.out.println("a-b = " + (a-b));
            // multipilication
            System.out.println("a*b = ="+ (a*b));
            //division
            System.out.println("a/b = " + (a/b));
            //modulo
            System.out.println("a%b = "+ (a%b));
// assignment operators
            // creating variable
            int r  = 4 ;
            int var ;
            var = r;
            System.out.println("var using =:"+ var );
            var += r;
            System.out.println("var using +=" +var );
            var *= r;
            System.out.println("var using *=" +var);
            var /=r;
            System.out.println("var using /=" +var);

            //java relational operators
            int c = 7 , d = 11 ;
            System.out.println("c is "+ c  +  "and d is "+d);
            //==operator
            System.out.println(c==d);
            System.out.println(c!=d);
            System.out.println(c>d);
            System.out.println(c<d);
            System.out.println(c>=d);
            System.out.println(c<=d);
            // java logical operators
            //&& operator
            System.out.println((5>3) && (8>5));
            System.out.println((5>3) && (8<5));
            // || operator
            System.out.println((5<3) || (8>5));
            System.out.println((5>3) || (8<5));
            System.out.println((5<3) || (8<5));
            // ! operator
            System.out.println((!(5 == 3)));
            System.out.println(!(5>3));

            //java unary operator
            int s = 12 , e =12;
            int result1, result2 ;
            System.out.println("value of s ; " +s);
            // increment operator
            result1=++s;
            System.out.println("after increment:"+ result1);
            System.out.println("value of b :" +e);
            // decrement operator
            result2 = --b;
            System.out.println("after decrement :"+ result2);

            //java bitwise operators
            // | if either of bits is 1 , it gives 1 , else it shows 0
            // & if both bits are 1 it gives 1 , else it shows 0
            // ^ if corresponding bits are different it gives 1 else it shows 0
            // ~ it makes 0 t0 1 , 1 to 0

            int u = 5;
            int z = 7;
            // bitwise and
            // 0101 & 0111 = 0101 =5
            System.out.println("u&z= " +(u & d));
            // bitwise or
            // 0101 | 0111 = 0111 = 7
            System.out.println("u|z = " +(u | z));
            // bitwise xor
            // 0101 ^ 0111 = 0010 = 2
            System.out.println("u^z = " +(u ^ z));
            // bitwsie not
            System.out.println("~u= "+ ~u);


            // java instance of operator
            String str = "program";
            boolean result20 ;
            result20 = str instanceof String;
            System.out.println(" is str an object of string ?"+ result20);

        }
    }
