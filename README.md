## Zadanie od zákazníka
Naša pizzeria by potrebovala jednoduchý rezervačný systém na objednávanie pizze. Zákazníci by si mohli objednať pizzu online, zvoliť si typ pizze, veľkosť, prípadné prílohy a čas doručenia alebo osobného vyzdvihnutia. Systém by mal umožňovať evidenciu objednávok, notifikácie o stave objednávky a online platbu.

Zákazník by mal mať možnosť vidieť históriu svojich objednávok a hodnotiť objednávku po doručení.

## Zber požiadaviek

### Funkčné požiadavky
- **RQ01** Systém umožní zákazníkovi vytvoriť objednávku.
- **RQ02** Systém umožní zákazníkovi vybrať typ pizze, veľkosť a prílohy.
- **RQ03** Systém eviduje stav objednávky (nová, pripravená, doručená, zrušená).
- **RQ04** Systém umožní notifikovať zákazníka o zmene stavu objednávky (e-mail alebo SMS).
- **RQ05** Systém umožní zákazníkovi zvoliť spôsob doručenia (osobné vyzdvihnutie alebo donáška).
- **RQ06** Systém umožní zákazníkovi zaplatiť online kartou alebo hotovosťou pri doručení.
- **RQ07** Systém umožní administrátorovi spravovať menu (pridávať/meniť typy pízz a prílohy).
- **RQ08** Systém umožní zákazníkovi pridať poznámku k objednávke (napr. bez cibule).
- **RQ09** Systém eviduje čas objednávky a požadovaný čas doručenia.
- **RQ10** Systém umožní zákazníkovi vidieť históriu svojich objednávok.
- **RQ11** Systém umožní zákazníkovi hodnotiť objednávku (1-5 hviezdičiek a komentár).
- **RQ12** Systém umožní administrátorovi nastaviť časové okná pre prijímanie objednávok.
- **RQ13** Systém automaticky zruší nevyzdvihnutú objednávku po určitej dobe.
- **RQ14** Systém umožní administrátorovi vidieť štatistiky o predaných pizzách.
- **RQ15** Systém umožní registrovaným zákazníkom získať zľavy na základe počtu objednávok.

## Slovník pojmov

| **Pojem**      | **Anglický názov**| **Definícia**                                   |
|----------------|-------------------|-------------------------------------------------|
| **Objednávka** | Order             | Požiadavka zákazníka na doručenie pizze. |
| **Pizza**      | Pizza             | Produkt, ktorý si zákazník objednáva. |
| **Príloha**    | Topping           | Doplnková ingrediencia na pizzu (napr. syr, šunka). |
| **Zákazník**   | Customer          | Osoba, ktorá si objednáva pizzu. |
| **Doručenie**  | Delivery          | Spôsob doručenia pizze na adresu zákazníka. |
|**Vyzdvihnutie**| Pickup            | Osobné vyzdvihnutie objednávky v pizzerii. |
| **Hodnotenie** | Review            | Spätná väzba zákazníka na objednávku. |
| **Platba**     | Payment           | Spôsob úhrady objednávky (online alebo hotovosť). |
| **Admin**      | Admin             | Zamestnanec pizzerie, ktorý spravuje objednávky a menu. |
| **Menu**       | Menu              | Zoznam dostupných pízz a príloh. |

