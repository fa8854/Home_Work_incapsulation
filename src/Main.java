public class Main {
    public static void main(String[] args) {
        Human Maksim = new Human(1998, "", "Минск","бренд-менеджером");
        Human Anna = new Human(1993, "Аня", "Москвы" , "методистом образовательных программ");
        Human Katya = new Human(1992,"Катя","Калининград" , "продакт-менеджером");
        Human Artem = new Human(1995,"Артем","Москва", "директором по развитию бизнеса");
        Human Vadim = new Human(2001,"Вадим","Казани"," не работает");
        System.out.println(Maksim);
        System.out.println(Anna);
        System.out.println(Katya);
        System.out.println(Artem);
        Vadim.setYearOfBrith(-7);
        System.out.println(Vadim);

        flower rose = new flower("Роза обыкновенная "," ","Голландия",35.59,0);
        flower hrizontema = new flower("Хризантема", " ", "",15, 5);
        flower pion = new flower("Пион"," ","Англии",69.9,1);
        flower gipsofila = new flower("Гипсофила ", " ","Турции", 19.5,10);
        System.out.println(rose);
        System.out.println(hrizontema);
        System.out.println(pion);
        System.out.println(gipsofila);


    }
}