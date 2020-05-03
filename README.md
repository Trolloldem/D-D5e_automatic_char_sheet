# D-D5e_automatic_char_sheet

## Urgenti:
* equipment wrapper -> Gianluca
* equipmentPiece checker -> Gabriele
* vettore di consumabili -> Valerio

## Non urgenti:
* Fixare il fatto che in characterWraper l'hashmap è sempre indicizzato ad -1
* Modificare il nome delle classi malformedPropery e notSubClass aggiungendo la parola Exception

## Opzionali
* PDFBox, vedere come scrivere
* Usare i set
* da vedere: come scaricare un eventuale PDF
* Rinominare il g4 da digits4 a qualcosa di più appropriato

##Bugs
Se definisco il seguente equipment con il tab:
```json
	create Equipment AdoEquip{
	armor:Full plate
	shield:Yes
	consumables:(Gold*10,Gold*11)
	weapon:Axe
}
```
Il sistema va in nullPointerException