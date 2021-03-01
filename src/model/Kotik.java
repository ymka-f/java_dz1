package model;

public class Kotik
{
    public static int count_kotiks;

    private int prettiness;
    private String name;
    private int weight;
    private String meow;
    public  int satiety;

    public Kotik(int prettiness, String name, int weight, String meow, int satiety)
    {
        setKotik(prettiness, name, weight, meow, satiety);
        count_kotiks++;
    }

    public Kotik()
    {
        count_kotiks++;
    }

    public void setKotik(int prettiness, String name, int weight, String meow, int satiety)
    {
        this.prettiness = prettiness;
        this.name = name;
        this.weight = weight;
        this.meow = meow;
        this.satiety = satiety;
    }

    public int getPrettiness()
    {
        return prettiness;
    }

    public String getName()
    {
        return name;
    }

    public int getWeight()
    {
        return weight;
    }

    public String getMeow()
    {
        return meow;
    }

    private boolean sleep()
    {
        if (satiety > 0)
        {
            satiety--;
            System.out.print("Котик спит \n");
            return true;
        }
        else
        {
            System.out.print("Котик просит кушать \n");
            return false;
        }
    }

    private boolean play()
    {
        if (satiety > 0)
        {
            satiety--;
            System.out.print("Котик играет \n");
            return true;
        }
        else
        {
            System.out.print("Котик просит кушать \n");
            return false;
        }
    }

    private boolean chaseMouse()
    {
        if (satiety > 0)
        {
            satiety--;
            System.out.print("Котик гоняется за мышкой \n");
            return true;
        }
        else
        {
            System.out.print("Котик просит кушать \n");
            return false;
        }
    }

    private boolean tygydyk()
    {
        if (satiety > 0)
        {
            satiety--;
            System.out.print("Котик делает тыгыдык \n");
            return true;
        }
        else
        {
            System.out.print("Котик просит кушать \n");
            return false;
        }
    }

    private boolean lookTheWindow()
    {
        if (satiety > 0)
        {
            satiety--;
            System.out.print("Котик смотрит в окно \n");
            return true;
        }
        else
        {
            System.out.print("Котик просит кушать \n");
            return false;
        }
    }

    public void liveAnotherDay()
    {
        for (int hour = 0; hour < 24; hour++)
        {
            int action = (int) (Math.random() * 5 + 1);
            System.out.print(hour + ":00 - ");
            switch (action)
            {
                case 1:
                    if (!sleep()) eat();
                    break;
                case 2:
                    if (!play()) eat();
                    break;
                case 3:
                    if (!chaseMouse()) eat();
                    break;
                case 4:
                    if (!tygydyk()) eat();
                    break;
                case 5:
                    if (!lookTheWindow()) eat();
                    break;
            }
        }
    }

    void eat(int addSatiety)
    {
        satiety += addSatiety;
    }

    void eat(int addSatiety, String foodName)
    {
        satiety += addSatiety;
    }

    void eat()
    {
        eat(8, "Whiskas");
    }
}
