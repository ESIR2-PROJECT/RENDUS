# Class diagram

```mermaid

classDiagram

class DataService {
    getAllBornes()
    getBornesUntil(Date d)
}

class TimeLineComponent {
    Date date
}

class MapComponent {
    TimeLineComponent end
    Date start

    onUpdate()
}

class Borne {
    String nomEnseigne
    Station station
    String priseTypeEf
    Horaire[] horaires
    Date dateMiseEnService
    int datagouv_dataset_id
    int datagouv_resource_id
    String datagouv_organization_or_owner
    Coordonnees coordonnees
    Ville ville
    boolean consolidatedIsLonLatCorrect
    double consolidatedIsCodeInseeVerified
}
class Horaire {
    Date dateDebut
    Date dateFin
}
class Station {
    String nomStation
    String adresseStation
}
class Coordonnees {
    double longitude
    double latitude
}
class Ville {
    String commune
    String codePostal
}
class Traffic {
    Date dateReferentiel
    String route
    int longueur
    Coordonnees coordonnees
    int anneeMesureTrafic
    double TotalMoyenJournalierAnnuel
}
class Immatriculation {
    int departement
    int count_elecHydro
    int count_hybrRechargeable
    int total
}
class StockVehicule {
    int codeGeo
    int libGeo
    Date dateArrete
    int nbVehRechargeableBesoin
    int communeGeom
}
Borne --> Station : contains
Borne --> Horaire : contains
Borne --> Coordonnees : contains
Borne --> Ville : contains

DataService --> Borne
DataService --> Traffic
DataService --> Immatriculation
DataService --> StockVehicule

MapComponent ..> DataService
MapComponent --> TimeLineComponent : contains

```