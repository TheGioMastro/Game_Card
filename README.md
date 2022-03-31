# Game_Card
Progetto Gioco Carte relativo a informatica.

# UML ->
![alt text](https://github.com/TheGioMastro/Game_Card/blob/main/_ProgGiocoCarte%20-%20Gruppo.png?raw=true)

## Ruoli nel gruppo
#### Giorgio Mastrogiovanni
#### Michele Celozzi
#### Alessandro Generali
#### Alessandro Poggi
#### Giuliano Tommaso Colombo

## Analisi delle richieste
Si hanno delle carte da gioco che rappresentano un Personaggio che può essere di tipo Umano o Mostro.
Un Personaggio di tipo Umano ha forza fisica pari a 10 e ha il metodo combatti, un Personaggio di tipo Mostro ha forza fisica pari a 15 e ha il metodo azzanno.
I Personaggi del gioco sono Eroe, Vampiro e Licantropo:
Eroe è Umano;
Vampiro è Mostro;
Licantropo è Mostro nelle notti di luna piena e Umano il resto del tempo.
Il combattimento fa subire 3 danni, mentre l’azzanno fa subire 2 danni all’avversario.

## Ipotesi aggiuntive
### Info Generali:
Il gioco incomincia avendo in mano 4 carte, si possono pescare massimo 11 carte in tutta la giocata, in mano si possono avere massimo 8 carte.
Il mazzo complessivo è composto da 15 carte.
Esistono due mazzi per giocatore, il primo è quello da cui si pesca una carta all’inizio del proprio turno finché non esaurisce, il secondo mazzo chiamato cimitero contiene le carte sconfitte e quelle utilizzate, da quest’ultimo non è possibile riprendere le carte se non tramite una abilità apposita.

### Campo:
Il campo è formato da una parteche è quella di attacco in cui le carte devono essere scoperte, se il giocatore viene attaccato le carte in attacco/difesa faranno da scudo difendendo a costo della loro vita.
Se in campo c'è una carta attacco e una difesa viene attaccata prima quella difesa, se l'avversario attacca una carta attacco e l'attacco della prima carta è maggiore della difesa della seconda il giocatore attaccato avrà un danno recato pari alla differenza dei due valori. La carta difesa non fa subire danno al proprio evocatore.

### Mazzo:
Il proprio mazzo con cui si incomincia è formato da 5 carte randomiche selezionate tra quelle del proprio mazzo di partenza, si può avere un massimo di 12 carte in mano e il mazzo da cui si pesca è formato da 10 carte pescabili una all’inizio di ogni turno fino all'esaurimento.

### Tipologia carte:
Il mazzo generale è composto da più tipi di carte:

	- Carte Mostro:
		Tipo Attacco
			> LP(Life Points)	DP(Defense Point)
			  
		Tipo Difesa
			> LP(Life Points)	DP(Defense Point)
	- Carte Magia:
		> Possibilità di attaccare 2 volte nello stesso turno.
		> Distruggi una carta dal campo avversario.
		> Pesca l'ultima carta dal cimitero.
		> Toglie la possibilità dell'attacare all'avversario per il turno successivo.
		Deck Vampiro
			> Sacca di sangue: aggiunge alla sua difesa l'attacco affettuato(solo per il prossimo turno resta la vita aggiunta).
		Deck Licantropo
			> Luna piena: tutte le carte in gioco aggiungono 500 in attacco e in difesa(durata un turno).
		Deck Eroe
			> Spirito indomito: aggiunge 1000 all'attacco e toglie 200 alla difesa(l'attacco aggiuntivo si toglie al turno successiovo, la difesa no).
## Analisi tecnica
## Analisi classi
## Casi di test
