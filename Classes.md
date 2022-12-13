# Class diagram

```mermaid
classDiagram
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
class Trafic {
    Date dateReferentiel
    String route
    int longueur
    double xD
    double zD
    int anneeMesureTrafic
    String TMJA
}
class Immatriculation {
    int departement
    int elecHydro
    int hybrRechargeable
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
```