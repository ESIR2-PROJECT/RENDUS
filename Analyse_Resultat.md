
# Analyse des données récoltées

Le but de la création de cet outil est d'ensuite pouvoir analyser les données à notre disposition et de pouvoir en tirer des conclusion tant en termes d'évolution du nombre de nouvelles bornes que de la position dans lesquelles elles sont et seront à l'avenir. C'est pourquoi nous avons pu réaliser une petite analyse des données en analysant les courbes d'évolution du nombre de nouvelles bornes par année sur toute la France mais également pas région.
Nous avons sommé le nombre de nouvelles bornes par années afin de pouvoir avoir une meilleure visualisation son évolution. Voici le résultat : 

![image](https://user-images.githubusercontent.com/108394043/235179604-44b0b70c-1e79-47c2-be65-0db297689a3d.png)


Comme on peut le constater à partir de l’année 2020 on observe une grande augmentation du nombre de nouvelles bornes et une augmentation qui ne cesse de croître dès lors. A noter que les chiffres de l'année 2023 n'étant disponible que des 4 premiers mois car nous sommes en avril 2023 lors de cette analyse, c'est pourquoi nous avons décidé de procéder à une estimation du nombre de bornes dans les années à venir.


#Estimation des nouvelles bornes pour les prochaines années: 
En entraînant un modèle de régression linéaire sur le nombre de bornes par année, on obtient une projection de la courbe des nouvelles bornes par année. Cette projection est disponible sur l'image suivante:


![image](https://user-images.githubusercontent.com/108394043/235685401-a23c67e2-60e2-41f4-97aa-69d61d0a24a3.png)

Comme nous pouvons le constater le nombre de nouvelles bornes en France devrait dépasser les 50000/an avant 2030, il est donc important d'analyser les besoins et les régions en manque puisque le marché des bornes de recharge connaît une expansion sans nul doute et qui devrait s'accentuer avec la loi d'interdiction de vente de voiture thermique neuve pour 2035. 
Pour une analyse plus poussée et plus localement, nous avons également produit les courbes de nouvelles bornes par départements, celles-ci sont disponibles dans ce fichier [suivant](doc/all_plots.pdf).

On peut y voir une forte augmentation dans les départements de la région parisienne avec une année 2022 ayant vu plus de 1000 nouvelles bornes arriver dans ses départements tandis que dans Loiret ou la Meuse moins d'une cinquantaine sont présentes. C'est pourquoi il faudra coupler l'analyse de ces données avec les besoins sur le terrain, et cela est rendu possible grâce à la mise à disposition d'une base de données avec le nombre de voitures électriques en France.

![image](https://user-images.githubusercontent.com/108394043/235659720-d9c6051d-5160-40da-bffe-198bbd409518.png)
