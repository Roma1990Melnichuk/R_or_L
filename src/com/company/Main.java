import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {









    public static void main(String[] args) throws Exception {
        int b = 0;
        while (true){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String first = reader.readLine();
            String year = reader.readLine();
            String month = reader.readLine();
            String day= reader.readLine();
            int y = Integer.parseInt(year);
            int m = Integer.parseInt(month);
            int d = Integer.parseInt(day);

            System.out.println("Меня зовут" + first);
            System.out.println( "Я родился " + y +"."+ m +"."+ d);



}




       }
    }




//    public static class Apple {
//        public static int appPrice= 0;
//
//        public static void addAppPrice(int appPrice) {
//            Apple.appPrice = Apple.appPrice + appPrice;
//        }
//    }



//    public static void setCatCount(int catsCount) {
//        Main.catsCount =catsCount;
//    }
//    public static void addNewCat (){
//        Main.catCount = catCount+1;
//}
//    public void setname (String name) {
//    this.name = name;
//}


//    public static int sumDigitsInNumber(int number) {
//        int sum = 0;
//        while (number > 0) {
//            sum = sum + number % 10;
//
//            number = number / 10;
//            System.out.println(number);
//        }
//        return sum;
//    }






//    public static int sumDigitsInNumber(int number) {
//        int sum = 0;
//        while (number > 0) {
//            sum = sum + number % 10;
//
//            number = number / 10;
//            System.out.println(number);
//        }
//        return sum;
//    }










//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String bigMoney = reader.readLine();
//        int money = Integer.parseInt(bigMoney);
//        System.out.println("Я буду зарабатывать $" + money + " в час");
//        System.out.println(getmeteFromCentimetre(243));
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        String name = reader.readLine();
//        String name2 = reader.readLine();
//        String name3 = reader.readLine();
//        //String sAge = reader.readLine();
//        //String year = reader.readLine();
//       // int nAge = Integer.parseInt(sAge);
//        //int nYear = Integer.parseInt(year);
//        System.out.println( name +" + "+name2 + " + "+ name3 + " = Чистая любовь, да-да!" );


//    public static int getmeteFromCentimetre(int centimetre){
//        return centimetre/100;
//    }



//    public static class Red {
//        public Red() {
//            System.out.println("Red");
//        }
//    }
//        public static class Orange {
//            public Orange() {
//                System.out.println("Orange");
//            }
//        }
//            public static class Blue {
//                public Blue() {
//                    System.out.println("Blue");
//                }
//            }
//                public static class Green {
//                    public Green() {
//                        System.out.println("Green");
//                    }
//                }
//mMr();
//writeToConsole("Hello world");
//convertToSeconds(3);
//convertToSeconds(24);
//System.out.println(getVolume(25,5,2));





//public static void writeToConsole(String s) {
//    String toPrint = "printing: " + s;
//    System.out.println(toPrint);
//}
//
//public static int convertToSeconds(int hour){
//    int sec =hour *3600;
//    System.out.println(sec);
//return sec;
//}
//public static int getVolume (int a, int b, int c){
//    int volume = a * b * c *1000;
//    return volume;
//}
//public  static void mMr(){
//    String mama = "Мама";
//    String mila = "Мыла";
//    String rama = "Раму";
//    System.out.println(mama+mila+rama);
//    System.out.println(mama+rama+mila);
//    System.out.println(mila+mama+rama);
//    System.out.println(mila+rama+mama);
//    System.out.println(rama+mama+mila);
//    System.out.println(rama+mila+mama);
//}

