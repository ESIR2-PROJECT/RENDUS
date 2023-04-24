Nous travaillons sur le projet des bornes électriques, qui avait pour but de visualiser les données de bornes électriques sur une carte interactive. 


# Evaluation du projet

Voici les users stories principales du projets : 
- Montrer une map avec les points de recharge
- Possible de zoomer ou de dézoomer la map
- Sélectionner certaines données à afficher
- Envoyer un feedback
- Afficher les données en fonction du temps
- Afficher les données à proximité de l’utilisateur
- Afficher les informations détaillées sur une donnée

Toutes les users stories citées lors de l’analyse du projet ont été réalisées sauf celle “envoyer un feedback” car nous estimons que c’était la moins intéressante donc la dernière à implémenter. Donc nous n’avons pas eu le temps de l’implémenter.  
Mais à part cette user stories nous avons bien un site fonctionnelle qui affiche les bornes (qui s’actualise tous les jours) sur une carte. Et il est possible d'interagir avec ces bornes.  
On peut dire que le projet dans sa globalité est une réussite et à bien respecter les attendus. 

# Evaluation de l’équipe
Une particularité de notre groupe est que nous avons perdu 2 membres qui sont partie en mobilité internationale et nous avons récupéré une personne qui revenait de mobilité. Nous avons donc dû nous adapter à cette nouvelle disposition, réorganiser notre groupe et expliquer son fonctionnement, ses enjeux à Arthur qui nous à rejoint. Nous n’avons pas eu trop de difficultés à nous adapter. Arthur à su s’intégrer à notre groupe et nous réussit facilement à nous répartir la charge de travail de Tom et Thomas. 

Notre travail de groupe marchait correctement, le jira nous à grandement été utile à la communication et à la planification du travail. Nous n’avions pas de temps morts, une fois une fonctionnalité ajoutée, il nous suffisait de regarder dans le backlog de sprint et de s’attribuer une tâche. 

Fabien semble être celui qui à le plus coder, mais nous avons globalement tous participé équitablement au projet. 

Il n’y a pas eu de gros problème de conflit, de retards, d’absence, etc… Nous étions tous engagés dans le projet. 

# Problèmes rencontrées

Un des problèmes principaux rencontrés est la mauvaise définition de l'objectif de l’IA. Comme au début du projet l’IA nous semblait flou et nous ne voyions pas ce que l'on pouvait faire avec. Nous avions donc décidé de remettre ça à plus tard et de s’y confronter en temps voulu. Malheureusement nous sommes arrivés à l’étape de l’IA très tard dans le projet et donc définir les objectifs de celle-ci en prenant en compte le temps restant était compliqué. C’est pourquoi notre IA est peu développée, nous avons juste mis en place une prédiction pour déterminer l’évolution du nombre de bornes en France sur les prochaines années.


Nous avons aussi rencontré un problème de données. En effet, nous récupérons le dataset officiel des bornes de recharge. Cependant les données ne sont pas toutes normalisées. Par exemple, nous nous sommes retrouvées avec des années aberrantes (1970,1, …). Nous avons donc dû passer du temps (que nous n’avions pas prévu) à analyser les données et supprimer celles qui ne sont pas cohérentes. 

La prise en main de MapBox à été compliquée en effet, comme nous avons beaucoup de données a affichées (60 000) la map à commencé à devenir trop lourdes pour être afficher. Nous avons donc dû réfléchir à des solutions. C’est pourquoi nous avons mis en place du clustering de données pour que ce soit beaucoup plus léger à afficher.   

# Analyse du code

Une erreur de notre part à été de ne pas mettre en place de test. Cela peut s’expliquer par plusieurs raisons, tout d'abord nous utilisons de nouvelles technos qui ne sont pas totalement maîtrisées par tout le monde, donc mettre en place des tests sur des technos qui ne sont pas à 100% maîtriser prends du temps, chose sur lesquels nous nous sommes pas attardés. C’est pourquoi on ne retrouve presque aucun test sur notre projet. Nous avons regardé directement  à la main si les nouvelles fonctionnalités étaient correctes.

 Une bonne pratique que nous aurions dû mettre en place c’est de l’intégration continue .En effets, nous avions bien un git pour la gestion de code mais pour gérer les images dockers et pour déployer sur le serveur du site nous avons aucune CI/CD ce qui peut prendre du temps à la mains. Nous aurions dû mettre cela en place sur le projet dès le début, mais ça n'a pas été fait et après nous n'avions pas le temps. 


# Recommandation 

Si nous devions refaire le projet, nous passerions plus de temps sur la définition du projet, l’analyse technique et des besoins. Pour mieux définir les objectifs et les délimitations du projet (IA). Passer plus de temps sur la mise en place de l'environnement de dev en mettant en place dès le début des tests et une CI/CD pour être tranquille après et avoir un code sûr. 

