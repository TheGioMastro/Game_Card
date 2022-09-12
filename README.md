
# Gioco Carte

Gioco di Carte è un progetto realizzato durante l'anno scolastico, ispirato a differti giochi di carte, tra cui Yu-Gi-Oh e Magic prendendo ispirazione dalle loro meccaniche di gioco principali.

(Gioco di Carte is a project develpoed during the school year, inspired by different cards games, among which Yu-Gi-Oh and Magic taking inspiration from their game mechanics.)


## Authors & Roles

- [@Gold3nGT](https://www.github.com/gold3ngt) ![forthebadge](https://img.shields.io/badge/Class:-Player,%20Campo,%20Gioco-red?style=flat-square)
- [@TheGioMastro](https://www.github.com/thegiomastro)  ![forthebadge](https://img.shields.io/badge/Class:-Main-red?style=flat-square) ![forthebadge](https://img.shields.io/badge/Other:-GUI-blue?style=flat-square)
- [@Poggi](https://www.github.com/poggi19) ![forthebadge](https://img.shields.io/badge/Class:-Carta,%20Magia,%20Personaggio-red?style=flat-square)
- [@Michele](https://www.github.com/celox56) ![forthebadge](https://img.shields.io/badge/Class:-MazzoCampo,%20Cimitero,%20Mazzo-red?style=flat-square) ![forthebadge](https://img.shields.io/badge/Other:-Grafica_Carte-blue?style=flat-square)
- [@Generali](https://www.github.com/perimetro) ![forthebadge](https://img.shields.io/badge/Class:-Descrizione,%20Deck,%20Mano-red?style=flat-square)

## Roadmap

- Gioco multiplayer da remoto (Multiplayer game from remote computers)

- Supporto per lingue aggiuntive (Multiple Language support)

- Modalità single player (Single Player Mode)

## UML
![alt text](https://github.com/TheGioMastro/Game_Card/blob/main/UML/UML_Progetto_gioco_carte.png?raw=true)

### Cards
![alt text](https://github.com/TheGioMastro/Game_Card/blob/main/UML/Carte_UML.png?raw=true)
### General
![alt text](https://github.com/TheGioMastro/Game_Card/blob/main/UML/Generale_UML.png?raw=true)
### GUI
![alt text](https://github.com/TheGioMastro/Game_Card/blob/main/UML/Grafica_UML.png?raw=true)

## Documentation

- Obbiettivo:
  Creare un gioco di carte con 3 deck differti cercando di rendere il gioco equilibrato
  
(- Objective
  Develope a card game with 3 different deck trying to make the game balanced)
  
- Regole:
  - Descrizione schermata di gioco:
      Nel gioco sono presenti 2 campi, 1 per ogni player; per ogni campo è presente una mazzo delle carte che devono ancora essere pescate (Pesca), un mazzo dove sono       presenti tutte le carte morte o utilizzate (Cimitero), un mazzo dove sono presenti le carte in mano al giocatore (Mano) ed infine la sezione Campo dove vengono         posizionate le carte in posizone di difesa.<br>
      Inoltre sono presenti 2 pulsati il primo dedicato al passaggio del turno al giocatore successivo ed il secondo per impostare o disattivare la modalità schermo         intero (preimpostata di base).
      
  - Descrizione carte magia:
      - Terremoto:
          Distrugge una carta Personaggio dal campo avversario
      - Doppio Attacco:
          Permette di attacare due volte durante lo stesso turno
      - Resurrezione:
          Resuscita una carta casuale dal proprio cimitero
      - Blocca Attacco:
          Impedisce all'avversario di esguire un attacco durante il suo prossimo turno
      - Luna Piena:
          Potenzia tutte le carte del proprio deck Licantropo per un turno
(- Rules:
  - Game screen description:
      In the game there are 2 fields, 1 for each player; for each field there is a deck of cards that have yet to be drawn (Draw), a deck containing all the dead or         used cards (Graveyard), a deck containing the cards in the player's hand (Hand) and finally the Field section where cards are placed in defense position.<br>
      There are also 2 buttons, the first dedicated to passing the turn to the next player and the second to set or deactivate the full screen mode (default default).
 
 - Magic card description:
      - Earthquake:
          Destroys a Character card from the opponent's field.
      - Double Attack:
          Allows you to attack twice during the same turn.
      - Resurrect:
          Revive a random card from your graveyard.
      - Block Attack:
          Prevents the opponent from making an attack during his next turn.
      - Full Moon:
          Boost all cards in your Werewolf deck for one turn
 )
 
- Meccaniche di gioco:
  - Campo:
    - Mazzi:
      - Mano:
        Dove sono contenute tutte le carte che il giocatore ha nella sua mano (8 Carte max).
        
      - Mazzo Campo:
        Dove sono contenute tutte le carte in gioco del giocatore (6 Carte max).
        
      - Cimitero:
        Dove sono contenute tutte le carte Personaggio morte o Magia utilizzate.
        
      - Deck:
        Dove sono contenute tutte le carte non ancora pescate.
        
  - Pesca:
    Metodo che estrae casualmente una carta dal deck e la aggiunge alla Mano.
    
  - Utilizzo Carte Magia:
    Le carte magia una volta attivate vengono distrutte e il loro effetto viene utilizzato 
    
  - Attacco:
    Dopo aver selezionato una carta dal proprio campo, tramite un menù a tendina, è possibile scegliere la carta avversaria a cui verrà scalata la vita, se i punti         attacco dell'attaccante superato i punti vita del bersaglio la differenza viene scalata al Player possessore della carta bersaglio.
    
  - Attacco Diretto:
    Se nel campo avversario non sono presenti carte è possibile, tramite un menù a tendina, è possibile attaccare direttamente l'avversario scalandogli la sua vita         totale dai punti attacco della carta attaccante.

(- Game mechanics:
  - Campo:
    - Mazzi:
      - Mano:
        Where are contained all the cards that the player has in his hand (8 Cards max).
        
      - Mazzo Campo:
        Where all the player's cards are contained (6 Cards max).
        
      - Cimitero:
        Where all the used Character cards or Magic cards are contained.
        
      - Deck:
        Where all the cards not yet drawn are contained.
        
  - Draw:
    Method that randomly draws a card from the deck and adds it to the Hand.
    
  - Use of Magic Cards:
    Once activated, magic cards are destroyed and their effect is used
    
  - Attack:
    After selecting a card from your field, through a drop-down menu, you can choose the opponent card to which the life will be decreased, if the attack points of the     attacker exceed the life points of the target the difference is scaled to the Player owning the card target.
    
  - Direct Attack:
    If there are no cards in the opponent's field it is possible, through a drop-down menu, it is possible to attack the opponent directly by decreasing his total life     from the attack points of the attacking card.

)

    ## Tech Stack

      - Java - JDK 16.0.2 
      - JavaFX - JDK-fx 16.0.2



## Contributing

Contributions are always welcome!

Please contact `giuliano.colombo04@gmail.com` or `giorgiogio402@gmail.com`
to ask for contributing.

