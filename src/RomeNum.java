import java.util.*;

public class RomeNum {
    String myRomeNum;               //Объявляем переменные
    String myRomeString;

    String getRomeNum(final int num)
    {
        myRomeNum="";               //обнуляем переменные путём присваивания пустой строки
        myRomeString="";
        myRomeNum+=num;             //преобразуем наше значение в строку
        int j=myRomeNum.length();
        for (int i=0;i<myRomeNum.length();i++)      //заходим в цикл, перебираем каждый символ числа
        {                                                           //в нашу переменную добавляем новое значение,
            myRomeString += ifRomeNum(myRomeNum.charAt(i), --j);    // при помощи вызова функции
        }                                                           //в саму функцию передаем символ числа и его позицию
        return myRomeString;        //возвращаем строку
    }

    String ifRomeNum(char ch, int positionNum)
    {
        int myNum=Integer.parseInt(ch+"");      //переводим символ в число
        String ifRomeNumStr="";         //обнуляем переменные путём присваивания пустой строки
        while (myNum>0){
            switch (myNum) {            //выбираем действие, в зависимости от нашего числа
                case (4):ifRomeNumStr += positionOne(positionNum)+positionFive(positionNum); myNum=0; break;
                case (5):ifRomeNumStr = positionFive(positionNum)+ifRomeNumStr;myNum=0;break;
                case (9):ifRomeNumStr += positionOne(positionNum)+positionOne(positionNum+1);myNum=0;break;
                default: ifRomeNumStr += positionOne(positionNum); break;
            }
            myNum--;
        }
        return ifRomeNumStr;        //возвращаем строку
    }

    String positionOne(int positionNum){
        String RomeNumOneStr="";               //обнуляем переменные путём присваивания пустой строки
        switch (positionNum) {                  //выбираем действие, в зависимости от нашей позиции
            case (0): RomeNumOneStr += "I"; break;
            case (1): RomeNumOneStr += "X"; break;
            case (2): RomeNumOneStr += "C"; break;
            case (3): RomeNumOneStr += "M"; break;
            default: RomeNumOneStr += "?"; break;
        }
        return RomeNumOneStr;        //возвращаем строку
    }

    String positionFive(int positionNum){
        String RomeNumOneStr="";               //обнуляем переменные путём присваивания пустой строки
        switch (positionNum) {                  //выбираем действие, в зависимости от нашей позиции
            case (0): RomeNumOneStr += "V"; break;
            case (1): RomeNumOneStr += "L"; break;
            case (2): RomeNumOneStr += "D"; break;
            default: RomeNumOneStr += "?"; break;
        }
        return RomeNumOneStr;        //возвращаем строку
    }

}
