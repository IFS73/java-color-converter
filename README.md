# Convertisseur de codes couleur

L'objectif de cet exercice est de créer un outil en ligne de commande capable de convertir un code couleur hexadécimal (exemple: `#FFCC00`) en code RGB (exemple: `rgb(255, 204, 0)`) et inversement. Les algorithmes permettant de transformer l'un en l'autre sont déjà présents; il faudrait en revanche ajouter la gestion de la saisie par l'utilisateur. De plus, il faudrait écrire le code d'une manière qu'il soit facile à faire évoluer (maintenable), en prévision du moment où nous aurons besoin d'ajouter une nouvelle modalité en entrée et/ou en sortie (par exemple la modalité [HSL](https://fr.wikipedia.org/wiki/Teinte_saturation_lumi%C3%A8re)).

## 1. Ajouter une saisie de l'utilisateur

Lorsque l'application est lancée, un menu doit s'afficher proposant à l'utilisateur de:

1. Entrer un code hexadécimal,
2. Entrer trois valeurs de rouge, vert, et bleu.

L'utilisateur doit pouvoir rentrer 1 ou 2 pour accéder à la fonctionnalité désirée.

Par la suite, l'utilisateur doit être invité à saisir soit une valeur contenant 6 chiffres hexadécimaux, soit un nombre compris entre 0 et 255 trois fois de suite.

En fonction de l'option choisie, l'un des deux algorithmes présents dans le code de départ doit renvoyée la valeur désirée, convertie dans l'autre format.

<details>
<summary>Documentation</summary>
https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html
</details>

### BONUS

L'application doit vérifier que chaque saisie utilisateur respecte bien le format désiré.

## 2. Refactoriser les algorithmes de conversion

Écrire une méthode statique **rgbToHex()** et une méthode statique **hexToRgb()** dans la class **App**. Ces méthodes doivent reprendre les deux algorithmes de conversion présents dans le code de départ et être appelées à l'endroit adéquat.

## 3. Écrire une classe Color

Dans un fichier **Color.java**, écrire une classe **Color** qui réponde aux spécifications suivantes:

- Elle doit avoir trois propriétés représentant une valeur de rouge, une valeur de vert, et une valeur de bleu.
- Elle peut être initialisée avec un constructeur qui prend comme paramètres trois valeurs de rouge, vert et bleu.
- Elle peut être initialisée avec un constructeur qui prend comme paramètre un code couleur hexadécimal, et à partir duquel il remplit ses trois valeurs de rouge, vert, bleu.
- Elle doit avoir une méthode qui affiche le code `rgb(X, X, X)` correspondant à ses valeurs.
- Elle doit avoir une méthode qui affiche le code hexadécimal correspondant à ses valeurs.

Utiliser cette classe de manière adéquate pour refactoriser le processus principal dans la class **App**.

## BONUS: Ajouter la modalité HSL

Ajouter dans la classe **Color**:

- Un constructeur qui prend trois valeurs de teinte, saturation, luminance, à partir desquelles il remplit ses trois valeurs de rouge, vert, bleu.
- Une méthode qui affiche le code `hsl(X, X, X)` correspondant à ses valeurs.

Puis, ajouter dans le menu de l'application la possibilité d'écrire trois valeurs de teinte, saturation, luminance. Peu importe la modalité d'entrée choisie, l'application doit renvoyer le code couleur dans les trois formats supportés.

<details>
<summary>Solution</summary>
https://stackoverflow.com/questions/2353211/hsl-to-rgb-color-conversion#answer-29316972
</details>
