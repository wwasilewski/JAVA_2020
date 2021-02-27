/*
Przygotuj aplikację, a w niej następujące klasy
a. Circle
b. Rectangle
c. Square
d. Triangle
e. Figure - klasa bazowa dla powyższych klas.
Dla każdej klasy przygotuj metody double countPermiterer() obliczającą obwód
figury, double countSurface() obliczającą powierzchnię figury oraz getDetailedInfo()
wyświetlającą wszystkie dostępne parametry figury: typ(nazwa), zmienne (np.
długość, szerokość, promień), obwód i powierzchnia.
f. Utwórz i zaimplementuj klasę parameters dla każdej figury,
i. CircleParameters
ii. RectangleParameters
iii. SquareParameters
iv. TriangleParameters
v. Parameters - klasa bazowa dla powyższych klas
g. Przygotuj dla każdej figury osobną klasę, która zajmuje się pobieraniem
wszystkich niezbędnych parametrów do utworzenia jej instancji. Pobieranie
niech odbywa się poprzez konsolę. Metoda pobierająca powinna nazywać się
Parameters getFigureParametersFromUser()
h. Wykorzystaj przygotowanie klasy do pobrania i utworzenia każdego z
obiektów. Tworzenie obiektów powinno odbywać się poprzez przekazanie
klasy Parameters do obiektu figury.
*/

package powtorka.tydzien5.programowanie1.ex007.ex4;

public abstract class Figure {

    public abstract double countPerimeter();

    public abstract double countSurface();

    public abstract void getDetailedInfo();
}
