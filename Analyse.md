# Analyse du projet
Nous avons choisi pour projet celui sur les voitures électriques et les bornes de recharges. L’objectif est de créer un produit utilisable par des clients (particulier ou entreprises) qui permette de récupérer les lieux et des informations sur les bornes de recharge électrique à partir d’une carte intéractive. Nous avons donc plusieurs objectifs qui se démarquent :
- Visualisation des bornes de recharge sur une map selon une date
- Analyse et compréhension de l’évolution des infrastructures

À partir de ces deux objectifs, on détermine les problématiques que l’on devra résoudre lors de l’élaboration du projet. On dégage donc les principales questions à résoudre :
- Comment le nombre d’infrastructures de recharge évolue-t-il en France ? 
- Comparer cette évolution avec celle du parc de véhicules électriques et les objectifs pour 2030 ainsi que d’autres indicateurs qui semblent pertinents. 
- La répartition des infrastructures de recharge sur le territoire correspond-elle à une logique de distribution de la population et de trafic routier ? 

Une autre question essentielle pour le périmètre est le choix du public ciblé. En effet, le produit doit fournir des informations sur la position et le nombre de bornes de recharge, mais aussi des informations sur leur utilisation, et les besoins dans certaines régions. Ainsi, le projet sera destiné aux :
- particuliers (voir la distribution et la localisation des bornes)
- autorités (où devrait-on installer les futures bornes) 

On définit plusieurs use cases qu’un utilisateur peut avoir besoin d’effectuer sur le produit, ce qui nous permettra de définir les différentes fonctionnalités du système  En effet, un utilisateur souhaite simplement utiliser le produit pour trouver un point de recharge proche de chez lui, ou bien trouver les nouvelles bornes de recharge récemment misent en service. En revanche, les autorités auront besoin des détails sur l'utilisation des bornes. Dans tous les cas, cela nous amène aux fonctionnalités suivantes 
- Montrer une map avec les points de recharge
- Possible de zoomer ou de dézoomer la map
- Sélectionner certaines données à afficher 
- Envoyer un feedback
- Afficher les données en fonction du temps 
- Afficher les données à proximité de l’utilisateur 
- Afficher les informations détaillées sur une donnée

# Les données
Pour réaliser notre projet, nous avons besoin de beaucoup de données pour alimenter notre site et qu’il soit viable. Nous disposons de plusieurs dataset pour effectuer nos analyses. 
Tout d'abord, nous avons des informations sur les bornes de recharge pour véhicules électriques. Cela sera sur ce dataset qu’on va principalement récupérer les données pour alimenter notre projet. 

Pour effectuer différentes métriques (nombre de voitures par borne, nombre de bornes par régions, …)  nous possédons d’autre dataset : 
- Trafic moyen journalier annuel sur le réseau routier national
- Données sur la population (recensement, …)
- Données sur les immatriculations des véhicules ( nb de voiture électrique par département)
- Voitures particulières immatriculées par commune et par type de recharger (nb  de voiture électrique par commune) 

Dans un premier temps, nous devons définir les champs qui nous intéressent sur chaque dataset pour faire un premier traitement. Puis, nous pourrons sélectionner en fonction des différentes métriques les données utiles à nos calculs. 

# Outil de gestion de projet
Pour la gestion de projet, nous utiliserons **Jira**. On peut lancer des sprints, créer des backlogs, assigné des tickets à des personnes. Ainsi, on peut vérifier le bon avancement de chaque personne sur le projet, bien découper les étapes. On peut connecter github avec jira pour assigner des tickets à des branches. 

Pour la communication, nous utilisons **Discord**, et un drive google comme gestionnaire de document.

Pour le partage du projet, nous avons choisi **GitHub**, notamment pour les possibilités d’intégration continue que fournit la plateforme.

Pour les brainstormings, le design et noter des idées à la volée, nous utilisons **Figma**

# Choix des technologies
Dans un premier temps, nous ferons un front-end avec **Angular**.
Nous travaillons sur cette technologie en module de WEB et sommes donc plus à l’aise avec.
Pour le back-end, nous avons choisi d'utiliser Java car nous avons de l'expérience avec ce langage et en maîtrisons les concepts, en effet, le framework **Spring** nous permettra de gérer les requêtes, nous en profitons aussi pour apprendre de nouvelles choses. 

# Architecture du projet
```mermaid
graph LR
    
    Frontend
    
    S[Scheduler]
    
    S --> Getter
    S --> IA
    
    
    subgraph Backend
        Getter
        IA
        API
        DBobjects
        
        DataBase
        Getter --> DataBase
        API --> DataBase
        IA <--> API
        
        Getter -.-> DBobjects
        API -.-> DBobjects
    end
    
    subgraph External
        Bornes[Bornes de Recharge]
    end
    
    Frontend --> API
    Getter --> Bornes
    
```

Nous utilisons un conteneur docker comportant le front end sous Angular.
Ce container sera relié à la MapBox qui permettra d’afficher la carte interactive.
Les données seront chargées depuis le back intégré à un autre conteneur docker.
Ce dernier sera développé en Java sous le framework Spring il sera (?) lié à une base de données MySQL.
Nous tirons nos données du dataset du gouvernement pour la localisation des bornes de recharge des véhicules électriques. Ce dataset est actualisé tous les jours en temps réel.