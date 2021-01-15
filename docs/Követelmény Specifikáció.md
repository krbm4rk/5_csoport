# Követelmény specifikáció

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
    - Kért - e áramot vagy lakókocsit.
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

## Vágyálomrendszer

- A vágyálom rendszer azért felelős, hogy kifejtsük benne mit szeretnénk
  célul a programunkban a 100%-ban ideális esetben. Ilyen-olyan
  feature-ök jelenléte, és ideális állapotuk.

- A projekt céla egy olyan termék készítése ami kielégíti a kemping számára a felzárkózást
  a többi konkurens céghez online környezetet bisztosítva garantálja a kemping zavartalan
  működését.
  
- Csökkentse a pénzkezelés idejét és költségeit.
  Megkönnyítse az alkalmazottak munkáját.
  Könyvelés egyszerűsítése.
  
- A rendszer tegye követhetőbbé, mely cellák vannak lefoglalva és melyek a legnépszerűbbek.

- Lehessen kilistázni az aktuális foglalásokat:
  - Melyik cella van lefoglalva.
  - Kért - e áramot vagy lakókocsit.
  - A vendég neve.
  - Mettől meddig foglalta le.

## Funkcionális követelmények

- Frontend
- Backend

## Igényelt üzleti folyamatok

- A megrendelőnek kérésére a recepciós munkáját könnyítjük meg azzal hogy lekérheti az
ügyfelek adatait, és erre vonatkozóan a rendszer kiszámolja a tartózkodási időt , és a 
fizetendő összeget.

## Követelménylista

- (A programozás szempontjából talán a legfontosabb része a
   dokumentumnak. Itt kell leírni azt, hogy milyen funkciókkal kell
   rendelkeznie a programunknak, ezeknek milyen al-funkciói vannak)
   
## Fogalomtár

- cella: itt most nem börtönre kell gondolni , hanem parcellára , felosztott részegység

  
