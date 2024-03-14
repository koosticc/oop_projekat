# Class Tacka

Zahtev 0: Klasa Tacka je podklasa klase Oblik.
Zahtev 1: Klasa Tacka mora da sadrzi atribute koje ce predstavljati koordinate tacke u 2D prostoru, a vrednost su tipa int.
Zahtev 2: Klasa Tacka treba da sadrzi atribut kojim se opisuje da li je selected ili ne.
Zahtev 3: Klasa Tacka treba da ima default konstruktor.
Zahtev 4: Klasa Tacka treba da sadrzi konstruktor preko kojeg inicijalizujemo vrednosti koordinata tacke.
Zahtev 5: Klasa Tacka treba da ima konstruktor kojim se inicijaluzuju vrednosti svih atributa klase.
Zahtev 6: Klasa Tacka treba da ima metodu kojom se izracunava rastojanje tacke od neke druge tacke.
Zahtev 7: Klasa Tacka treba da sadrzi metodu kojom se odredjuje da li tacka sadrzi neku drugu tacku (distanca izmedju dve tacke je manja ili jednaka 2).
Zahtev 8: Klasa Tacka treba da ima metodu toString, koja vraca koordinate tacke u zagradi razdvojene zapetom.
Zahtev 9: Klasa Tacka treba da ima metodu equals, koja prima univerzalni tip Object i vraca boolean u zavisnosti da li je objekat jednak sa datim objektom ( da li imaju iste koordinate ).
Zahtev 10: Klasa Tacka treba da Getters i Setters za koordinate.
Zahtev 11: Klasa Tacka treba da override metodu Draw i da u toj metodi setuje boju na crnu, nacrta liniju uz pomocu metode DrawLine sa argumentima: x-2; y; x+2; y;.
Zahtev 12: Klasa Tacka treba da nacrta vertikalnu liniju uz metodu DrawLine sa argumentima: x; y-2; x; y+2.
Zahtev 13: Ako je tacka selektovana treba da promeni boju u plavu i da se oko nje nacrta Rectangle uz pomocu metode DrawRec sa sl argumentima: x-2;y-2;4;4; i treba da override.
Zahtev 14: Klasa Tacka treba da sadrzi metodu za pomeranje tako sto ce da se tacka pomeri na nove date koordinate (MoveTo) i treba da je override.
Zahtev 15: Klasa Tacka treba da override metodu MoveBy. 
Zahtev 16: Klasa Tacka treba da override metodu CompareTo.