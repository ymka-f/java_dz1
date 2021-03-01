import model.Kotik;

public class Application
{
    public static void main(String[] args)
    {
        Kotik first = new Kotik(5, "Васька", 4, "Мяу", 6);
        Kotik second = new Kotik();
        second.setKotik(9, "Люсьен", 3, "Miaou", 4);
        first.liveAnotherDay();
        System.out.println(first.getName() + " весит " + first.getWeight() + "кг.");
        System.out.println("Коты разговаривают " + (first.getMeow().equals(second.getMeow()) ? "одинаково" : "по-разному"));
        System.out.println("Всего экземпляров Kotiks: " + Kotik.count_kotiks);
    }
}


