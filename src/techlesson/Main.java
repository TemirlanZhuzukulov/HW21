package techlesson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            try (FileReader fileReader = new FileReader("MyText.txt")) {
                Scanner scanner = new Scanner(fileReader);
                while (scanner.hasNext()) {
                    System.out.println(scanner.nextLine());
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


//        private static void fileWriter () {
//            try (FileWriter fileWriter = new FileWriter("MyText.txt");) {
//                fileWriter.write("""
//                        Aa [ ei ] [эй]	Nn [ en ] [эн]
//                        Bb [ bi: ] [би]	Oo [ ou ] [оу]
//                        Cc [ si: ] [си]	Pp [ pi: ] [пи]
//                        Dd [ di: ] [ди]	Qq [ kju: ] [кью]
//                        Ee [ i: ] [и]	Rr [ a: ] [а:, ар]
//                        Ff [ ef ] [эф]	Ss [ es ] [эс]
//                        Gg [ dʒi: ] [джи]	Tt [ ti: ] [ти]
//                        Hh [ eitʃ ] [эйч]	Uu [ ju: ] [ю]
//                        Ii [ ai ] [ай]	Vv [ vi: ] [ви]
//                        Jj [ dʒei ] [джей]	Ww [ `dʌbl `ju: ] [дабл-ю]
//                        Kk [ kei ] [кей]	Xx [ eks ] [экс]
//                        Ll [ el ] [эл]	Yy [ wai ] [уай]
//                        Mm [ em ] [эм]	Zz [ zed / ziː] [зед / зи]""");
//                fileWriter.close();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}