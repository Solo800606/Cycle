public class One {
}



//складываем числа в строчку от 2+2 - 2+5 до 5+2 - 5+5
/*int first = 5;
int second = 5;
        for (int i = 2; i <= first; i++) {
        for (int j = 2; j <= second; j++) {
        //Здесь используем print + \t (табуляция между строками)
        System.out.print(j + "+" + i + "=" + i + j + "\t");
            }
                    System.out.println("");
        }
                }
                }*/

//складываем числа в столбец от 2+2 - 2+5 до 5+2 - 5+5
/*int first = 5;
int second = 5;
        for (int i = 2; i <= first; i++) {
        for (int j = 2; j <= second; j++) {
        System.out.println(i + " + " + j + " = " + i + j);
            }
                    System.out.println("");
        }
                }
                }*/

//Весь алфавит
/*String res = "";
//Здесь обявляем счетчик для i & j, для i  счетчик двигается вперед, для j двигается назад
        for (char i = 'A'; i <= 'Z'; i++) {
res += i + " ";
        }
        System.out.println(res);
    }*/

//переменная аккумулятор, ее значение
/*int max = 10;
int res = 0;
//
        for (int i=1; i <= max; i++) {
        System.out.print(res+" + " +i+ " = ");
res+=i;
            System.out.println(res);
        }
                System.out.println(res);
    }
            }*/

//два счетчика в одном цикле
/*int max = 15;
//Здесь обявляем счетчик для i & j, для i  счетчик двигается вперед, для j двигается назад
        for (int i = 1, j=max; i <= max; i++, j--) {
        System.out.println(i+ "-"+j);
        }*/

//Динамическое изменения шага, не совсем верное
/*int max = 100;
int shag = 1;
        for (int i = 1; i < max; i += shag) {
        System.out.println(i);
            if (i > 9 && shag == 1) shag = 10;
        }*/
//Верное решение --------------- в два цикла
/*int max = 100;
int i;
//Здесь обявляем если значение i от 1 до всё с шагом 1
        for (i = 1; i <= max && i < 10; i++) {
        System.out.println(i);
        }
                //Здесь выполняется если значение i 10 от max с шагом 10
                for (; i <= max; i += 10) {
        System.out.println(i);
        }*/
//Верное решение ----------------------- шаг меняется три раза
/*for (i = 1; i <= max && i < 10; i++) {
        System.out.println(i);
        }
                //Здесь выполняется если значение i 10 от max с шагом 10
                for (; i <= max; i += 10) {
        System.out.println(i);
        }
                //Здесь выполняется если значение i больше 70 с шагом 1
                if (i==max) return;
i-=10;
        for (; i <= max; i ++) {
        System.out.println(i);
        }*/



//Вывести все четные числа путем деления остатка на 2, не совсем верное
/*int max = 100;
        for (int i = 1; i < max; i++) {
        if (i % 2 == 0) System.out.println(i);
        }*/
//Верное решение ---------------
/*int max = 100;
        for (int i = 2; i < max; i += 2) {
        System.out.println(i);
        }*/


//Степень 2-х
/*int x = 2;
int max = 100;
        for (int res = 1; res < max; res *= x) {
        System.out.println(res);
        }*/


//Таблица умножения на 2
/*
int x = 2;
int max = 10;
        for (int i = 1; i <= max; i++) {
        System.out.println(x + "*" + i + "=" + x * i);
        }*/
