import static java.lang.Math.pow;
public class General
{
    public static void main(String[] args)
    {
        int stop = 20;//время остановки
        double step = 2;//шаг
        double kol;//кол-во элементов
        kol = (stop / step) + 1;
        double []y1 = new double[20];//первое уравнение
        double []y2 = new double[20]; // второе уравнение
        double []u1 = new double[20];
        for (int i = 0; i <= kol; i++)
        {
            u1[i] = 20 - 0.01*i;//изменение температуры
        }
        y2[2] = 0.9 * y2[1] + u1[1];// для второго значения второго уравнения
        for (int i = 1; i <= kol; i++)
        {
            y1[i] = 0.988*y1[i - 1] + 0.232 * u1[i - 1];
            System.out.println ("y1 = " + y1[i]);
        }
        for (int i = 2; i <= kol; i++)
        {
            y2[i] = 0.9 * y2[i - 1] - 0.001 * (pow(y2[i - 2], 2) + u1[i - 1]);
            System.out.println("y2 = "+ y2[i]);
        }
    }
}
