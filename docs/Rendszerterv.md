# Rendszerterv

## Rndszer célja 

- A rendszer célja a recepciós munkájánka megkönnyítése a kempingben
- A program webes felületen fut , és egy adatbázisból éri el az adatokat
- A recepciós egy navigációs menünk keresztül érheti el a felületet
- Fontos, hogy a recepciós könnyen el tudjon igazodni a felületeken ezért minimalista felhasználói
 felületet kap a program
 
## Projektterv

- A projekten résztvevő kollégák
    - Szalóki Dávid
    - Bódi Cintia Maja
    - Bencsik Krisztián
    
- Backend munkálatok
  - Szalóki Dávid
  - Bódi Cintia Maja
  - Bencsik Krisztián
  
- Frontend munkálatok
  - Bódi Cintia Maja
  
- Ütemterv
  - Követelmény specifikáció
    * Feladat: 
    * Prioritás: 0
    * Becslés: 12
  - Funkcionális specifikáció
    * Feladat: 
    * Prioritás: 0
    * Becslés: 12
  - Rendszerterv:
    * Feladat: 
    * Prioritás: 0
    * Becslés: 16
  - Adattárolás:
    * Feladat: Adatmodell megtervezése
    * Prioritás: 0
    * Becslés: 4
  - Adattárolás:
    * Feladat: Adatbázis megvalósítása a szerveren
    * Prioritás: 1
    * Becslés: 1
    
- Mérföldkövek
  - Az adatmodell bemutatása megtörtént.
  
##Üzleti folyamatok modellje:

- Üzleti szereplők:
  - Recepciós
  
- Üzleti folyamatok:
  - Feladatok felvitele módosítása
  - Adatbázis hozzáférés
  
##Követelmények

- Funkcionális
  - Webes környezeten való működés
  - Meglévő foglalások és számlák adatainak tárolása

- Nemfunkcionális
  - Gyors listázás
  - Egyszerű, egyértelmű hozzáadás
  
- Törvényi előírások, szabványok
  - GDPR-nek való megfelelés
  
##Funkcionális terv

- Rendszerszereplők
  - Recepciós
  
- Rendszerhasználati esetek és lefutásaik
  - Recepciós
    * Teljes hozzáférése van a rendszerhez
    * Adatokat látja és változtathat rajta
    * Adatok hozzáadására, törlésére van lehetőségük

- Menü hierarchiák
  - Kezdőlap
    * Foglalások
    * Számlák
    
##Fizikai környezet

- Az alkalmazás webplatformra  készül.
- Nincsenek megvásárolt komponenseink.
- Fejlesztői eszközök:
  - Notepad++
  - JetBrains Webstorm
  - JetBrains IntelliJ IDEA
  - MySQL Workbench

##Architektúrális terv

- Backend
  - A rendszerhez szükség van egy adatbázis szerverre, ebben az esetben
    MySql-t használunk.
  - A kliensekkel JSON objektumokkal kommunikál.
  
- Frontend
  - A web alkalmazás JetBrains Webstorm keretrendszer használatával készül el
  
##Implementációs terv

- Frontend
  - A Webes felület főként HTML, CSS, és Javascript nyelven fog készülni.
  - Ezeket a technológiákat amennyire csak lehet külön fájlokba írva készítjük,
    és úgy fogjuk egymáshoz csatolni a jobb átláthatóság, könnyebb változtathatóság, 
    és könnyebb bővítés érdekében.
  - Képes lesz felhasználni a Backend részen futó szolgáltatás metódusait,
    ezáltal tud felvinni és lekérdezni adatokat az adatbázisból.
    
##Tesztterv

- Tesztelési eljárások
  - Unit teszt
    * Ahol csak lehetséges, szükséges már a fejlesztési idő alatt
      is tesztelni, hogy a metódusok megfelelően működnek-e.
    * Ezért a metódusok megfelelő működésének biztosítására mindegyikhez írni
      kell Unit teszteket, a minél nagyobb kódlefedettséget szem előtt tartva.
    * A metódusok akkor vannak kész, ha a tesztesetek hiba nélkül lefutnak az egyes metódusokon
    
  - Alfa teszt
    * A tesztet a fejlesztők végzik.
    * A teszt elsődleges célja: az eddig meglévő funkcióknak a különböző böngészőkkel való kompatibilitásának tesztelése. 
    * Az eljárás sikeres, ha különböző böngészőkben megfelelően működnek a különböző funkciók.
    * A teszt időtartama x idő.
    
  - Béta teszt
    * A tesztet a fejlesztők végzik.
    * Tesztelendő böngészők: Opera, Firefox, Google Chrome, Safari
    * A teszt időtartama x idő.
    
- Tesztelendő funkciók
  - Backend
    * Képesnek kell lennie csatlakozni webes klienshez.
    * Képesnek kell lennie egy időben kiszolgálni több klienst is.
    * Fel kell tudnia tölteni, és le kell tudnia kérdezni az adatbázis adatait.

##Telepítési terv

- A szoftver webes felületéhez csak egy ajánlott böngésző telepítése
  szükséges, külön szoftver nem kell hozzá.
- Például: Google Chrome, Firefox, Opera
