# Show Map usecase

```puml
@startuml

Actor User as U
Participant System as S

group Show map
...
    U -> S : Request the map
    S -> U : Show the map
...
end
@enduml
```