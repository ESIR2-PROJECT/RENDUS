import java.util.Date;

public class Borne {
    String nomEnseigne;
    Station station;
    String priseTypeEf;
    Date[] horaires;
    String dateMiseEnService;
    int datagouv_dataset_id;
    int datagouv_resource_id;
    String datagouv_organization_or_owner;
    Coordonnees Coordonnees;
    Ville ville;
    boolean consolidatedIsLonLatCorrect;
    double consolidatedIsCodeInseeVerified;
}

class Station {
    String nomStation;
    String adresseStation;
}
class Coordonnees {
    double longitude;
    double latitude;
}

class Ville {
    String commune;
    String codePostal;
}