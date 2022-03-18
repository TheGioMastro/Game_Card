# Game_Card
Progetto Gioco Carte relativo a informatica.

# UML ->
![alt text](https://github.com/TheGioMastro/Game_Card/blob/main/UML%20Gioco%20Carte%20-%20Page%201%20(1).png?raw=true)

## Ruoli nel gruppo
#### Giorgio Mastrogiovanni
#### Michele Celozzi
#### Alessandro Generali
#### Alessandro Poggi

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
Il gioco incomincia avendo in mano 5 carte, si possono pescare massimo 10 carte in tutta la giocata, in mano si possono avere massimo 12 carte.
Esistono due mazzi per giocatore, il primo è quello da cui si pesca una carta all’inizio del proprio turno finché non esaurisce, il secondo mazzo chiamato cimitero contiene le carte sconfitte e quelle utilizzate, da quest’ultimo non è possibile riprendere le carte se non tramite una abilità apposita.

### Campo:
Il campo è formato da due parti, la prima è la parte di attacco in cui le carte devono essere scoperte, se il giocatore viene attaccato le carte in attacco faranno da scudo con la propria vita o con le proprie abilità difendendo a costo della loro vita. La seconda parte del campo è formata dalle carte coperte, visibili solo al giocatore che le ha predisposte. In questa parte di campo possono essere messe solo carte trappola o carte le quali non hanno attacco e difesa, si possono richiamare mentre l'avversario sta attaccando e quindi per avere la possibilità di usare il loro effetto.

### Mazzo:
Il proprio mazzo con cui si incomincia è formato da 5 carte randomiche selezionate tra quelle del proprio mazzo di partenza, si può avere un massimo di 12 carte in mano e il mazzo da cui si pesca è formato da 10 carte pescabili una all’inizio di ogni turno fino all'esaurimento.

### Tipologia carte:
Il mazzo generale è composto da più tipi di carte:

	> Carte Mostro:
	> Carte Magia:
	> Carte Trappola:
## Analisi tecnica
## Analisi classi
## Casi di test
