# Funkcionális specifikáció

## Áttekintés
- Ebben a fejezetben röviden ismertetem a projektünk egészét. Milyen
  technológiákat szeretnénk alkalmazni, hogyan fog működni az alkalmazásunk.

- A fejlesztés célja egy vizuálisan részletes, és átlátható
  web alkalmazás készítése, amely képes nyílvántartani egy kemping
  foglalásait, és megjeleníteni parcelláinak állapotát.
  
- Az alkalmazást a kemping recepciósa kezeli.
  A cellákat egy vagy több éjszakára is le lehet foglani.
  Dönteni lehet hogy sátras vagy lakókocsis.
  Minden cellához kérhető akár áram is.
  Ki lehet listázni az aktuális ffoglalásokat minden adaatukkal együtt:
    - Melyik cella van lefoglalva.
    - Kért - e áramot
    - Kért - e lakókocsit.
    - A vendég neve.
    - Mettől meddig foglalta le

- Mindez elérhető a recepciós számára , aki ebböl számolja ki,
  hogy az adott cella foglaló mennyit is fizet az eltöltött napokért.
  
## Jelenlegi helyzet

- Ennek a fejezetnek a feladata kifejteni, hogy miért van
  szükség az alkalmazásunkra. Érdemes minél lényegretörőbbnek
  lenni benne, minél több pontban ecsetelve a szükséget.

- A kempingnek szüksége van egy átfogó rendszerre ami korszerűsíti a jelenlegi
  papíros és jegyzeteléses számolási rendszert, átláthatóbbá és értelmezhetőbbé teszi
  a vevők igényeit és visszakövethetőbbé a pénzösszegek befolyását.
  
- A jelenlegi papíros megoldás túl lassú ahhoz, hogy megfelelően kielégítse a vendégek igényeit.
  Ráadásul az alkalmazottaknak kevesebb ideje marad egyéb teendőikre.
  
- A befolyó összegek nyomonkövetése jelenlegi formájában nehéz.

- Nehéz több évre visszamenőleg keresni.
  A papírok karbantartása sok időt vesz igénybe.

## Követelménylista

- A programozás szempontjából talán a legfontosabb része a
  dokumentumnak. Itt kell leírni azt, hogy milyen funkciókkal kell
  rendelkeznie a programunknak, ezeknek milyen al-funkciói vannak.
  
- ID: 1
  - Modul: Feladattípus
  - Név: Hozzáadás
  - Verzió: 1.0
  - Kifejtés: Adatok hozzáadása az adatbázishoz
  
- ID: 2
  - Modul: Feladattípus
  - Név: Törlés
  - Verzió: 1.0
  - Kifejtés: Adatok törlése az adatbázisból
  
- ID: 3
  - Modul: Feladattípus
  - Név: Listázás
  - Verzió: 1.0
  - Kifejtés: Adatok listázása
  
- ID: 4
  - Modul: Felület
  - Név: Navigációs menü
  - Verzió: 1.0
  - Kifejtés: Navigációs menü létrehozása, ahol a kezdőlapra kattintva a kezdőlap jelenik meg.
  
- ID: 5
  - Modul: Felület
  - Név: Foglalás felület
  - Verzió: 1.0
  - Kifejtés: A foglalások kezelésének egy felület. Lehet hozzáadni, törölni és az űrlap alatt listázni.
  
- ID: 6
  - Modul: Felület
  - Név: Számla felület
  - Verzió: 1.0
  - Kifejtés: A számlák kezelésének egy felület. Lehet hozzáadni és az űrlap alatt listázni.
   
##Használati esetek

- A recepciós kezeli a rendszert.
- A recepciós adatokat tud hozzáadni és módosítani azokat.
- A recepciós adatokat tud törölni.
- A recepciós láthatja az adatbázisban lévő adatokat.

##Forgatókönyv

- A rendszer csak a recepciós tudja kezelni. Egyszerre egy dolgot tud csinálni

## Fogalomtár

- Cella: itt most nem börtönre kell gondolni , hanem parcellára , felosztott részegység
- Számla: Fizetésről bizonylat. Mint a boltokban a nyugta.

  
