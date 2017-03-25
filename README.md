Sujet : Conversion littérale de nombre.
======================================= 

Use cases :
-----------

1.    Conversion de 1 vers UN

      En tant qu’utilisateur, je veux saisir le chiffre “1” dans une console et l’application doit me répondre "UN" en majuscule.

      Avec tout autre chiffre saisi, l’application doit me répondre "ERREUR 1 : saisie incorrecte"       

 

2.    Conversion de 2 à 9

      En tant qu’utilisateur, je veux saisir un chiffre entre “2” et “9” dans une console et l’application doit me répondre la transcription littérale du chiffre saisi.

      Avec tout autre chiffre saisi, l’application doit me répondre "ERREUR 1 : saisie incorrecte"      

 

3.    Conversion de 10 à 16

      En tant qu’utilisateur, je veux saisir un nombre entre “10” et “16” dans une console et l’application doit me répondre la transcription littérale du nombre saisi.

      Avec tout autre chiffre saisi, l’application doit me répondre "ERREUR 1 : saisie incorrecte"       

 

4.    Conversion de 17 à 19

      En tant qu’utilisateur, je veux saisir un nombre entre “17” et “19” dans une console et l’application doit me répondre la transcription littérale du nombre saisi.

      Avec tout autre chiffre saisi, l’application doit me répondre "ERREUR 1 : transcription littérale impossible pour ce nombre [nb]"

 

5.    (facultatif) Conversion de 20 à 69

      En tant qu’utilisateur, je veux saisir un nombre entre “20” et “69” dans une console et l’application doit me répondre la transcription littérale du nombre saisi.

      Avec tout autre chiffre saisi, l’application doit me répondre "ERREUR 1 : transcription littérale impossible pour ce nombre [nb]"

 

6.    Implementation de addition

      En tant qu’utilisateur, je veux saisir un nombre suivi du caractère "+" suivi d’un second nombre dans une console et l’application doit me répondre la transcription littérale de l’addition des deux nombres saisis.

      Si la saisie ne respecte pas le pattern décrit ci-dessus, l’application doit me répondre "ERREUR 2 : format de saisie incorrecte"

      Si le résultat de l’addition ne peut pas être transcrit littéralement, l’application doit me répondre "ERREUR 1 : transcription littérale impossible pour ce nombre [nb]"

 

7.    Implementation de la soustraction

      En tant qu’utilisateur, je veux saisir un nombre suivi du caractère "-" suivi d’un second nombre dans une console et l’application doit me répondre la transcription littérale de la soustraction des deux nombres saisis.

      Si la saisie ne respecte pas le pattern décrit ci-dessus, l’application doit me répondre "ERREUR 2 : format de saisie incorrecte"

      Si le résultat de la soustraction ne peut pas être transcrit littéralement, l’application doit me répondre "ERREUR 1 : transcription littérale impossible pour ce nombre [nb]"


8.    Gestion du 0

      En tant qu’utilisateur, je veux réaliser la soustraction d’un nombre par lui-même dans une console et l’application doit me répondre "ZERO"

 

Il est possible d’ajouter le UC suivants :

-       Gestion des négatifs

-       Fonction inverse (UN -> 1)

-       Gestion de la virgule

-       Internationalisation (gros morceau avec introduction d’une stratégie de transcription)

 

Note : Les UCs 1 à 4 peuvent être regroupés de façon générale « Conversion de 1 à 19 » et laisser la liberté aux tutorés de réaliser le découpage en UCs (introduction à l’agilité).