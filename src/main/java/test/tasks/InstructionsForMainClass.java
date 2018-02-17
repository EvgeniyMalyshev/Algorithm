package test.tasks;

import test.tasks.difficult.MainFileManagerClass;
import test.tasks.middle.CodingString;
import test.tasks.middle.RetNMax;
import test.tasks.simple.FactorClass;
import test.tasks.simple.Palindrome;
import test.tasks.simple.Ret2ndMax;
import test.tasks.simple.SearchString;

import java.io.FileNotFoundException;

public class InstructionsForMainClass {
    public void startFunc(String[] args){

//simple tasks
        if (args[0].equals("simple.Ret2ndMax")) {

            //create an array with the second argument
            int[] m = new int[args.length - 1];
            for (int i = 0; i < m.length; i++) {
                m[i] = Integer.parseInt(args[i + 1]);
            }
            Ret2ndMax retInt = new Ret2ndMax();
            System.out.println(retInt.retInt(m));

        } else if (args[0].equals("simple.FactorClass")) {
            FactorClass factorClass = new FactorClass();
            System.out.println(factorClass.factorFunc(args[1]));

        } else if (args[0].equals("simple.Palindrome")){
            Palindrome palindrome = new Palindrome();
            System.out.println(palindrome.checkPalindrom(args[1]));

        }else if (args[0].equals("simple.SearchString")){
            SearchString searchString = new SearchString();
            String str = "";
            //create an string with the second argument
            for (int i = 0; i < args.length-2; i++){
                str += args[i+2]+" ";
            }
            System.out.println(str);
            System.out.println(searchString.find(args[1],str));
        }

        //middle tasks

        else if(args[0].equals("middle.RetNMax")){

            int n = Integer.parseInt(args[1]);//N-th max value

            //create an array with the third argument
            int[] m = new int[args.length - 2];
            for (int i = 0; i < m.length; i++) {
                m[i] = Integer.parseInt(args[2 + i ]);
            }

            RetNMax retNMax = new RetNMax();
            System.out.println(retNMax.retInt(m,n));
        }else if (args[0].equals("middle.CodingString")) {
            CodingString codingString = new CodingString();
            System.out.println(codingString.encoding(args[1]));


        }

        //difficult task
        else if (args[0].equals("difficult.MainFileMangerClass")){
            MainFileManagerClass mainFileMangerClass = new MainFileManagerClass();
            try {
                mainFileMangerClass.fMFunc(args[1]);
            }catch (FileNotFoundException e){
                System.out.println("File not found");
            }
        }


    }
}
