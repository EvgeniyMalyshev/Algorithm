package test.tasks.simple;

public class Palindrome {
    public String checkPalindrom(String str){

        char[] ch = new char[str.length()];

        String invStr = "";

        for (int i = 0; i <  str.length(); i++){
            ch[i] = str.charAt(( str.length()-1) - i);
            invStr += ch[i];
        }
        if(invStr.equals(str)){
            return str + " is  Palindrom";
        }
        else{
            return str + " is not Palindrom";
        }

    }
}
