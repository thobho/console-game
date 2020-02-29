# Game

1. Dodaj do gry na początku metodę, która umożliwi "stworzenie" przez niego
bohatera.

2. Przeanalizuj jakie jak wygląda algorytm walki Elfa i Krasnoluda (Dwarf)

2. Obecnie w grze zaimplementowane są obecnie 2 rasy. Dodaj 3 rasę "Human".
Należy to zrobić przez nadpisanie klasy Hero, oraz przez zmodyfikowanie klasy
HeroFactory.

3. Dodaj jeszcze jedną implementację typu Land. Może to być, np.
Wieś, gdzie użytkownik nie będzie mógł się spodziewać, czy będzie musiał walczyć,
czy np, będzie mógł kupić broń.

4. Obecnie każdy tworzony bohater ma stałą ustalone zdrowie i obrażenia jakie może zadać.

```
    private static final int MAX_HERO_HEALTH = 100;
    private static final int DEFAULT_DAMAGE = 10;
```

Stwórz statyczną metodę w klasie Hero o nazwie createHeroWithRandomStrength, która będzie zwracać bohatera,
który zdrowie będzie miał losowe w przedziale od 50 do 120, a obrażenia (danmage) od 5 do 40.

5. Dodaj swoje własne modyfikacje do gry.

# Kolekcje

1. Napisz metodę, która przymie Listę intów i zwróci Listę, która zawiera
elementy o parzystych indeksach.

2. Napisz metodę, która przyjmie Listę (np. intów) i zwróci listę, która nie zawiera
duplikatów.

3. Napisz metodą, ktora przymie Listę stringów i zwróci mapę, której kluczami są
indeksy, natomiast wartościami elemnty listy.

4. Napisz metodę, ktora przyjmie Mapę, gdzie kluczami jest PESEL człowieka,
natomiast wartością typ Person(imie, nazwisko) i zwróci mapę, której kluczami
jest obiekt String reprezentujący nazwisko, natomiast warością liczba mówiąca
ile razy osoba o danym nazisku występuje w mapie zadanej w parametrze.

# Wyjątki
1. Napisz metodę, checkPassword, która sprawdza poprawność podanego hasła (zwraca boolean).
* Hasło musi być dłuższe niż 8 znaków
* Hasło musi posiaadć przynajmniej jeden znak specjlany
* Haslo musi posiadać przynajmniej jedną wielką literę

Jeżeli którykolwiej z podncyh warunków nie jest spełniony metoda powinna
rzucać własny wyjątek.

2. Napisz metodę main, która pobierze od użytkownika stringa i sprawdzi, czy
podane hasło jest poprawne. Jeżeli metoda checkPassword rzuci wyjątek, należy go
obsłużyc w bloku try-catch.

