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
    usecase "Prevision" as UC10
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
UC1 <.-- UC10

@enduml
```