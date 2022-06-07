
# Gioco Carte

Gioco di Carte è un progetto realizzato durante l'anno scolastico, ispirato a differti giochi di carte, tra cui Yu-Gi-Oh e Magic prendendo ispirazione dalle loro meccaniche di gioco principali.


## Authors & Roles

- [@Gold3nGT](https://www.github.com/gold3ngt) ![forthebadge](https://img.shields.io/badge/Class:-Player,%20Campo,%20Gioco-red?style=flat-square)
- [@TheGioMastro](https://www.github.com/thegiomastro)  ![forthebadge](https://img.shields.io/badge/Class:-Main-red?style=flat-square) ![forthebadge](https://img.shields.io/badge/Other:-GUI-blue?style=flat-square)
- [@Poggi](https://www.github.com/poggi19) ![forthebadge](https://img.shields.io/badge/Class:-Carta,%20Magia,%20Personaggio-red?style=flat-square)
- [@Michele](https://www.github.com/celox56) ![forthebadge](https://img.shields.io/badge/Class:-MazzoCampo,%20Cimitero,%20Mazzo-red?style=flat-square) ![forthebadge](https://img.shields.io/badge/Other:-Grafica_Carte-blue?style=flat-square)
- [@Generali](https://www.github.com/perimetro) ![forthebadge](https://img.shields.io/badge/Class:-Descrizione,%20Deck,%20Mano-red?style=flat-square)

## Roadmap

- Gioco multiplayer da remoto

- Supporto per lingue aggiuntive

- Modalità single player

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

- Meccaniche di gioco:
  - Campo:
    AAAAA
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
    Dopo aver selezionato una carta dal campo, tramite un menù a tendina, è possibile scegliere il bersaglio a cui verrà scalata dalla vita, l'attacco della carta         attaccante.
    
    ## Tech Stack

- Java - JDK 16.0.2 
- JavaFX - JDK-fx 16.0.2


## Contributing

Contributions are always welcome!

Please contact `giuliano.colombo04@gmail.com` or `giorgiogio402@gmail.com`
to ask for contributing.

