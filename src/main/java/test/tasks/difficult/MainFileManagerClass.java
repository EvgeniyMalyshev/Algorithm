package test.tasks.difficult;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class MainFileManagerClass {
    private static String ack = "ACK";  //function Ackermann
    private static String f = "F";  //Factorial
    private static String fib = "FIB";  //function Fibonacci
    static FileManager fileManager = new FileManager();

    public void fMFunc(String fileName) throws FileNotFoundException {
        String outFileName = fileName + ".res.txt";////create out file dir.
        MainFileManagerClass mainClassReaderFile = new MainFileManagerClass();

        ArrayList list = fileManager.read(fileName);//read the incoming file

        for (int i = 0; i < list.size();i++){
            //  System.out.println(list.get(i));
            String mes = String.valueOf(list.get(i));//assigned the string from the string array
            String[] arrMes = mes.split(" ");//parse n-th string in an array
            mainClassReaderFile.mathOp(arrMes, i+1,outFileName);//call the function and send number of string
        }
        System.out.println("результаты сохронены в файл:\n" + outFileName);
    }


    //call the necessary function
    public  void mathOp(String[] arr, int i, String outFileName){
        if(arr[0].equals(ack)){
            int arg1 = Integer.parseInt(arr[1]);
            int arg2 = Integer.parseInt(arr[2]);

            System.out.println(Ackermann.ackFunc(arg1, arg2));

            String res = i+ " " + String.valueOf(Ackermann.ackFunc(arg1, arg2));
            fileManager.write(outFileName,res);

        }else if(arr[0].equals(f)){
            int arg = Integer.parseInt(arr[1]);

            System.out.println(Factorial.factFunc(arg));
            String res = i+ " " + String.valueOf(Factorial.factFunc(arg));
            fileManager.write(outFileName,res);

        }else if(arr[0].equals(fib)){
            int arg = Integer.parseInt(arr[1]);

            //  System.out.println(Fibonacci.fibFunc(arg));
            String res = i+ " " +  String.valueOf(Fibonacci.fibFunc(arg));
            fileManager.write(outFileName,res);

        }else{
            System.out.println("error function");
        }
    }
}
