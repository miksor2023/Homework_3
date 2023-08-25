//
//домашнее задание 23.08.23
public class Main {
    public static void main(String[] args) {
        //
        //задача 1
        byte studentsNumber = 35;
        short taxAmount = 5550;
        int distance = 256543;
        long accountBalance = 999123L;
        float temp  = 12.23f;
        double bigAmount = -1.65463E120;
        System.out.println("\nЗадача 1");
        System.out.println("Значение переменной studentsNumber с типом byte = " + studentsNumber);
        System.out.println("Значение переменной taxAmount с типом short = " + taxAmount);
        System.out.println("Значение переменной distance с типом int = " + distance);
        System.out.println("Значение переменной accountBalance с типом long = " + accountBalance);
        System.out.println("Значение переменной temp с типом float = " + temp);
        System.out.println("Значение переменной bigAmount с типом double = " + bigAmount);
        //
        //задача 2
        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        int e = -159;
        int f = 27879;
        byte g = 67;
        //
        //задача 3
        int pupilNum1 = 23;//ученики Людмилы Павловны
        int pupilNum2 = 27;//ученики Анны Сергеевны
        int pupilNum3 = 30;//ученики Екатерины Андреевны
        int paperQty = 480;//общее количество листов
        int pupilSum = pupilNum1+pupilNum2+pupilNum3;//общее количество учеников
        int pupilRate = paperQty/pupilSum;//расчёт бумаги на одного ученика
        System.out.println("\nЗадача 3");
        System.out.println("На каждого ученика рассчитано " + pupilRate + " листов бумаги");
        //
        //задача 4
        int machineOutput1 = 16;//произведено бутылок
        int timeInterval1 = 2;//отрезок времени 2 минуты
        int timeInterval2 = 20;//отрезок времени 20 минут
        int timeInterval3 = 24*60;//отрезок времени 1 сутки, выраженный в минутах (24 часа по 60 минут)
        int timeInterval4 = 3*24*60;//отрезок времени 3 дня в минутах
        int timeInterval5 = 30*24*60;//отрезок времени 1 месяц в минутах
        int bottleMakingSpeed = machineOutput1/timeInterval1;//произведено бутылок за 1 минуту
        int machineOutput2 = timeInterval2*bottleMakingSpeed;//расчёт производительности за 20 минут
        int machineOutput3 = timeInterval3*bottleMakingSpeed;//расчёт производительности за 1 сутки
        int machineOutput4 = timeInterval4*bottleMakingSpeed;//расчёт производительности за 3 дня
        int machineOutput5 = timeInterval5*bottleMakingSpeed;//расчёт производительности за 1 месяц
        System.out.println("\nЗадача 4");
        System.out.println("За 20 минут машина произвела " + machineOutput2 + " штук бутылок");
        System.out.println("За 1 день машина произвела " + machineOutput3 + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + machineOutput4 + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + machineOutput5 + " штук бутылок");
        //
        //задача 5
        int totalJar = 120;//общее количество банок
        int whiteJar = 2;//количество банок белой краски на класс
        int brownJar = 4;//количество банок коричневой краски на класс
        int jarsForClass = whiteJar+brownJar;//количество банок двух цветов на класс
        int classQty = totalJar/jarsForClass;//расчёт количества классов
        int totalWhiteJar = classQty*whiteJar;//расчёт общего количества белой краски
        int toltalBrownJar = classQty*brownJar;//расчёт общего количества коричневой краски
        System.out.println("\nЗадача 5");
        System.out.println("В школе, где " + classQty + " классов, нужно " + totalWhiteJar + " банок белой краски и " + toltalBrownJar + " банок коричневой краски");
        //
        //задача 6
        int bananaRecipeQty = 5;//количество бананов в рецепте
        int milkRecipeQty = 200;//количество молока в рецепте
        int icecreamRecipeQty = 2;//количество мороженного в рецепте
        int eggRecipeQty = 4;//количество яиц в рецепте
        int bananaMass = 80;//масса 1 банана в граммах
        double milkMass = 1.05;//масса 1 мл молока в граммах
        int icecreamMass = 100;//масса 1 брикета мороженного в граммах
        int eggMass = 70;//масса 1 яйца в граммах
        double weightGram = (bananaRecipeQty*bananaMass) + (milkRecipeQty*milkMass) + (icecreamRecipeQty*icecreamMass) + (eggRecipeQty*eggMass);
        double weightKilo = weightGram/1000;//переводим граммы в килограммы, для конастанты 1000 переменную решил не объявлять
        System.out.println("\nЗадача 6");
        System.out.println("Вес завтрака " + weightGram + " грамм");
        System.out.println("Вес завтрака " + weightKilo + " килограмм");
        //
        //задача 7
        int totalWeightLoss = 7000;//желаемая потеря веса в граммах
        int daylyLoss1 = 250;//потеря веса за день, значение 1
        int daylyLoss2 = 500;//потеря веса за день, значение 1
        int dayQty1 = totalWeightLoss/daylyLoss1;//расчёт времени при скорости похудения 250 гр/день
        int dayQty2 = totalWeightLoss/daylyLoss2;//расчёт времени при скорости похудения 500 гр/день
        int averageDayQty = (dayQty1 + dayQty2)/2;//расчёт среднего количества дней
        System.out.println("\nЗадача 7");
        System.out.println("При скорости похудения 250 гр/день для потери 7 кг потребуется " + dayQty1 + " дней");
        System.out.println("При скорости похудения 500 гр/день для потери 7 кг потребуется " + dayQty2 + " дней");
        System.out.println("В среднем для потери 7 кг потребуется " + averageDayQty + " дней");
        //
        //задача 8
        int salary1 = 67760;//текущая зарплата Маши
        int salary2 = 83690;//текущая зарплата Дениса
        int salary3 = 76230;//текущая зарплата Кристины
        float higherSalary1 = salary1*1.1f;//повышаем зарплату на 10%
        float higherSalary2 = salary2*1.1f;//повышаем зарплату на 10%
        float higherSalary3 = salary3*1.1f;//повышаем зарплату на 10%
        float yearSalaryIncrease1 = (higherSalary1 - salary1) * 12;//вычисляем годовой прирост зарплаты
        float yearSalaryIncrease2 = (higherSalary2 - salary2) * 12;//вычисляем годовой прирост зарплаты
        float yearSalaryIncrease3 = (higherSalary3 - salary3) * 12;//вычисляем годовой прирост зарплаты
        System.out.println("\nЗадача 8");
        System.out.println("Маша теперь получает " + higherSalary1 + " рублей, годовой доход вырос на " + yearSalaryIncrease1 + " рублей");
        System.out.println("Денис теперь получает " + higherSalary2 + " рублей, годовой доход вырос на " + yearSalaryIncrease2 + " рублей");
        System.out.println("Кристина теперь получает " + higherSalary3 + " рублей, годовой доход вырос на " + yearSalaryIncrease3 + " рублей");












    }
}