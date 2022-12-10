public class Main {
    public static void main(String[] args) {


        //System.out.println("Hello Veronika!");

        /*int my_number = 5;
        double second_number;

        System.out.println("My number is " + my_number);

        second_number = 22.5;
        System.out.println("My number is " + second_number);

        String my_string = "My first sting";

        System.out.println(my_string);
        System.out.println(my_string.toLowerCase());
        System.out.println(my_string.toUpperCase());
        System.out.println(my_string.length());
        System.out.println(my_string.charAt(0));*/

        //int a = 10;
        //int b = 3;

        /*System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);

        System.out.println(a/b);

        System.out.println(a%b);*/
        /*System.out.println(++a); //Сначала +1 потом показать
        System.out.println(--b); //Сначала -1 потом показать

        System.out.println(a++); //Сначала показать потом +1
        System.out.println(b--); //Сначала показать потом -1

        System.out.println(a);
        System.out.println(b);

        System.out.println("мой текст " + a + " my second text");*/

        /*
        >
        <
        >=
        <=

        == сравнивают равны ли 2 значение
        != сравниваюь что значения не равны
         */
        /*System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a==b);
        System.out.println(a!=b);*/

        int age = 17;

        if (age>=18) {
            System.out.println("You are an old person!");
        } else {
            System.out.println("You are a child!");
        }

        int weekDay = 10;

        if (weekDay ==1) {
            System.out.println("Monday!");
        }

        switch (weekDay){
            case 1:
                System.out.println("Monday!");
                break;
            case 2:
                System.out.println("Tuesday!");
                break;
            case 3:
                System.out.println("Wednesday!");
                break;
            case 4:
                System.out.println("Thursday!");
                break;
            case 5:
                System.out.println("Friday!");
                break;
            case 6:
                System.out.println("Satursay!");
                break;
            case 7:
                System.out.println("Sunday!");
                break;
            default:
                System.out.println("No such day");
        }


    }
}