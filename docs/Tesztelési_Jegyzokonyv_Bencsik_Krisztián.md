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
|1.|Foglalás hozzáadás|<p>Swagger,</p><p>Microsoft Edge Böngésző</p>|<p>Adatbázisban új adat jelenik meg</p><p></p>|<p>Adatbázisban új foglalás jelenik meg</p><p></p>|Megfelelő|
|2.|Foglalások kilistázása|<p>Swagger,</p><p>Microsoft Edge Böngésző</p>|Kilistázza a foglalásokat|Kilistázza a foglalásokat|Megfelelő|
|3.|Foglalás törlése|<p>Swagger,</p><p>Microsoft Edge Böngésző</p>|Foglalás törlődik a listából|Foglalás törlődik a listából|Megfelelő|
|4.|Számla kiállítása|<p>Swagger,</p><p>Microsoft Edge Böngésző</p>|A számla felkerül az adatbázisba|Nem funkcionál|Sikertelen|
|5.|Számlák kilistázása|<p>Swagger,</p><p>Microsoft Edge Böngésző</p>|A számlák kilistázásra kerülnek|Nem funkcionál|Sikertelen|
|6.|Számla törlése|<p>Swagger,</p><p>Microsoft Edge Böngésző</p>|A számla törlődik az adatbázisból|Nem funkcionál|Sikertelen|