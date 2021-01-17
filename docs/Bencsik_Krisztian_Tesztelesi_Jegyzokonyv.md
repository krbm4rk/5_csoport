|**Rendszer megnevezése**|Kemping|
| :- | :- |
|**Tesztelés erőforrás-szükséglete Vállalkozó oldalon**|szerver, terminál szimuláció,|
|**Tesztelés erőforrás-szükséglete Felhasználó oldalon**|Szerver, terminál|

Átvételi eljáráson résztvevők:

Név: Bencsik Krisztián

Beosztás: Backend Fejlesztő

Dátum: 2020.01.15

|**Sorszám**|**Funkció leírása**|**Vizsgálat módja/eszköze**|**Elvárt eredmény**|**Aktuális eredmény**|**Megfelelősség státusza**|
| :-------- | :---------------- | :------------------------ | :---------------- | :------------------ | :----------------------- |
|Általános funkcionális teszt|
|1.|Ügyfél (bérlő) hozzáadás|<p>Swagger,</p><p>Google crome Böngésző</p>|<p>Adatbázisban új adat jelenik meg</p><p></p>|<p>Adatbázisban új termék jelenik meg</p><p></p>|Megfelelő|
|2.|Ügyfél idejének lekérése|<p>Swagger,</p><p>Mozzilla Böngésző</p>|Visszatér az ügyfél idejével|Visszatér az összes termékkel|Megfelelő|
|3.|Cellafoglalás|<p>Swagger,</p><p>Google crome Böngésző</p>|Dátum és vendégek száma alapján foglalás leadása, adatbázisba felvétel|Dátum és vendégek száma alapján foglalás leadása, adatbázisba felvétel|Megfelelő|
|4.|Foglalások lekérése|<p>Swagger,</p><p>Google crome Böngésző</p>|Visszatér az összes Cellafoglalással|Visszatér az összes Cellafoglalással|Megfelelő|
|5.|Recepciós felvétel|<p>Swagger,</p><p>Google crome Böngésző</p>|ID megkapása, Cella megadásával,|ID megkapása, Cella megadásával,|Megfelelő|