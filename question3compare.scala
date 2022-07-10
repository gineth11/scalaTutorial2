object quest3{

    def main(args: Array[String]): Unit ={

      //question 3 comparison java with scala
      var(a,b,c,d)=(2,3,4,5);
      var(k,g) = (4.3f,4.0f);
      //println(--b*a+c*d--);      not support -- in scala
      //println(a++);              not support ++ in scala
      println (-2*(g-k) +c);      // 4.6000004
      //println (c=c++);           not support ++ in scala
      //println (c=++c*a++);       not support ++ in scala
   

    }


  /*
    public class q3 {
        public static void main(String[] args) {

        int a = 2, b = 3, c = 4, d = 5;
        float k = 4.3f, g = 4.0f;
        // java supports increment and decrement operators

        System.out.println(--b * a + c * d--);
        System.out.println(a++);
        System.out.println(-2 * (g - k) + c);
        System.out.println(c = c++);
        System.out.println(c = ++c * a++);

        }
   }*/

} 