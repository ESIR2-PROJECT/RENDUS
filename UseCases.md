# Use Cases

## List of Use Cases
- Show map
- Zoomer avec des boutons sur la carte
- Afficher des données de dataset sur la carte
- Afficher les données en fonction du temps
- Afficher les données à proximité de l'utilisateur
- Filtrer les données affichées
- Afficher des informations détaillées sur une donnée


```puml
@startuml

left to right direction

actor "User" as fc

rectangle "Systeme" {
    usecase "Show map" as UC1
    usecase "Zoom or pan the map" as UC2
    usecase "Show data on the map" as UC3
    usecase "Show data over time" as UC4
    usecase "Show data near the user" as UC5
    usecase "Select datasets" as UC6
    usecase "Show infos on a data point" as UC7
    usecase "Export data" as UC8
    usecase "Send feedback" as UC9
}

fc --> UC1
fc --> UC9

UC1 <.-- UC2
UC1 <.-- UC3
UC1 <.-- UC4
UC1 <.-- UC5
UC1 <.-- UC6
UC1 <.-- UC7
UC1 <.-- UC8

@enduml
```

## User stories :

### Export data
![ExportData](http://www.plantuml.com/plantuml/svg/LSzT2i8m30VmzvpYVm5t066YYCyAfGS8QxOLjhMq6UhjROSEx5kQNxxEMJdfEaz4bqv3WisIm1cM7YNXEnzvKPXtLfdhlo5gMvWnF35pHDiI3Ici4VUeFYmyOGxEzxxZ6YBqq54gfQPf2ELP74umEE8wyZB8bdS-nudVuZPPbQdA5cMZOvM_Bh8uehtDxHL3qXtiXQOmHD_fckItXspsEuREHPJJFm00 "ExportData")

### Zoom and pan
![ZoomPan](http://www.plantuml.com/plantuml/svg/5OvT2WCX48FVvnIvG2zGiEn23r0G3p1OkqhzMNHAiQVl-1QIBo7R4ExoAPbezz8wt0WTFE3eeK7owUGgi7D8ACktHCR0nlP5uHF643bSRh2uOXzll7JZrrf9zO1ARLULP1VZbBdFoYLvpdd2Hwv7WCImjeYsK9zwvGy0 "ZoomPan")

### Full scenario
![Scenario](http://www.plantuml.com/plantuml/svg/RP51JiGm34NtEOKlm0LOe443IEpGH3c0bNZQYDGfjIlKs-FCCEs8ilq_VlxVEOZYfFDGd7kEMYS8GXEWG70VPkIOHsG5luZIq7JlN8279_3m22VwcaaKj2SOS7I-6S4CtzVlLLsVlzKuoqs6oZRFJBADlIoCGuvOoWAnH-ve3_5KA6gpfovp1vPVix4IAWhf1WkZIGIPprKWPHaBBfJQsXtpM7ByRCvvJLXgl70ttf5OxJHtyL_z--aESWtSbkv2j73_RlvjWxi-VsvvRM64Mrsv359oxa2SxFz-0000 "Scenario")

### Select data set
![SelectDataSet](http://www.plantuml.com/plantuml/svg/5Sr12i8m48NX_Jl5ku0N428Lt0hYa0CCSQI5fWsP4V7sfjllN_oJX_Rur1MubjWxirkdEZCU8onbQRe5vUTXzN01KgBC-vTtRKm9o3nTA3nJRBKIl6ceMq0EpyEVzkxcCwisOBBjDNv_ "SelectDataSet")

### Show feedback
![SendFeedback](http://www.plantuml.com/plantuml/svg/POz12eCm54Jt_nI3-rwWYs8HtBOGSe2O_BR1c4ZoNNZxHYkuw7RclO5fYvWionI8xbPIXYwSOGeqFMlXhPzD5AYr24zRheWqBZSeND45RqUaY4PnTEYPtM3is61OH58ajO6wWe-P_o7dJKZlSwtt8S17o8VnIddwwLkpYtjyoETo5rBXlJlcgArm_VC5 "SendFeedback")

### Show data near user
![ShowDataNearUser](http://www.plantuml.com/plantuml/svg/5Ov12WCX40Jlyuh-G3wmO5Z8UK_Y0mOLLkBEYCuIajT7hzr5TU_3kDjzLU9esX56xk21G6tc9PR6Ol3VOVbQkITopi6V-i713SuH1JoUyDZmgYM-eOAnQidSaTYO_0B217wgqo89qxguUwrLZMn5XMZFakQLFm00 "ShowDataNearUser")

### Show data over time
![ShowDataOverTime](http://www.plantuml.com/plantuml/svg/7SvR2WCX38NXzwpYRA0RA5Xc5b0eY0i86XZ16neftNrrNlFz1t8CvQup9wBJQ-rmGpfumD5dGVInSL7Otr39-sw9Z36mL_tYpGt643ayNh1umaeIhz1B45Y5x0QtOUTS0cRRi9KnYyQquZZk6hNSoyoDw90IrbT_ "ShowDataOverTime")

### Show infos on data point
![ShowInfoOnDataPoint](http://www.plantuml.com/plantuml/svg/7Sv12iCm34JHlKun5-W52Yw1hhioFe1mN28QMy9M2BrzdMx_Os2MuTpzg3iHPzUED4e73oIo2PB5k3dYTtYfLuz48GJ4JK-ys102KSJjWOGxdhla3xI1iR8pJAKvfOlZvF_egdOOJl4DLNk1jBSEegMqTHxv0G00 "ShowInfoOnDataPoint")

### Show Map
![ShowMap](http://www.plantuml.com/plantuml/svg/DSx12SCm30NGkwRu2zG3z53I3KA51p2fQ09nx5eofTjN3bG77VJ-1qrggLdFEz5ziT8GLHgI8jBii2rRJOU1lsgInvs9Ngtq2bxB1pbL2Y4GV28kDp2kUCYxYnfibJCma0T6nxFsbr6LuqcJB__X1m00 "ShowMap")