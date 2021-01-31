import java.util.*;

public class myString {

    String revertString(final String inputStr){
        String inStr = inputStr;                //Объявляем переменные и присваиваем значение нашей строчке
        String myStrOut = "";
        for (int i=0;i<inStr.length();i++)      //заходим в цикл, перебираем каждый символ строчки
        {
            if(((inStr.charAt(i))>=65)&&((inStr.charAt(i)<=90)))        //Если входит в диапазон A-Z
                myStrOut=inStr.charAt(i)+myStrOut;                      //то добавить символ в нашу новую строчку
            if(((inStr.charAt(i))>=97)&&((inStr.charAt(i)<=122)))       //Если входит в диапазон a-z
                myStrOut=inStr.charAt(i)+myStrOut;                      //то добавить символ в нашу новую строчку
        }
        return myStrOut;       //возвращаем строку
    }
}
