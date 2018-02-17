import test.tasks.InstructionsForMainClass;

public class Main {
    public static void main(String[] args) throws Exception{

        if (args.length>0){
        InstructionsForMainClass instructionsForMainClass = new InstructionsForMainClass();
        instructionsForMainClass.startFunc(args);

        }else {
        System.out.println(
                "\n" +
                        "+ вид вызова нужной программы (выполняется в папке с .jar-файлом): \n"+
                        "+ java -jar ***.jar arg1 arg2 arg3... ,\n"+
                        "+ где arg1 - название нужной программы(приведенно ниже)\n" +
                        "+ arg2 arg3... - ее агрументы\n "+
                        "\n" +
                        "*******simple module*******\n"+
                        "\n" +
                        "+ Программа, возвращающая 2-й по величине элемент набора чисел.\n" +
                        "+ simple.Ret2ndMax + arg1 + arg2 + arg3 ...\n" +
                        "\n" +
                        "+ Программа, выполняющая разложение числа на набор простых множителей.\n"+
                        "+ simple.FactorClass + arg\n" +
                        "\n" +
                        "+ Программа, выполняющая проверку строки на то, что она является палиндромом.\n"+
                        "+ simple.Palindrome + arg \n" +
                        "\n" +
                        "+ Программа, выполняющая поиск подстроки в строке.\n"+
                        "+ simple.SearchString + arg1(Substring) + arg2(String)\n " +
                        "\n" +
                        "*******middle module*******\n" +
                        "\n" +
                        "+ Программа, возвращающая n-й по величине элемент набора чисел.\n"+
                        "+ middle.RetNMax + arg(n-е по величине число) + arg2 + ahg3 ...\n" +
                        "\n" +
                        "+ Программа выполняющая Run-length encoding кодирование строки (aaabccdd -> 3a1b2c2d).\n"+
                        "+ middle.CodingString + arg\n" +
                        "\n" +
                        "Программа выполняющая Run-length decoding кодирование строки (3a1b2c2d -> aaabccdd).\n"+
                        "+ middle.DecodingString + arg\n" +
                        "\n" +
                        "*******difficult module*******\n "+
                        "\n" +
                        "+ command-line утилита, принимающая в качестве аргумента имя файла и\n" +
                        "+ обрабатывающую указанный файл.\n"+
                        "+ difficult.MainManagerClass + arg(путь к файлу)\n" +
                        "\n" +
                        "Пример: \n" +
                        "java -jar devTestTaskAId-1.0-SNAPSHOT.jar  middle.CodingString aaaddccp\n"
        );

    }
}
}
