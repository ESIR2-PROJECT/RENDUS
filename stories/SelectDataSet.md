# Select dataset usecase

```puml
@startuml

Actor User as U
Participant System as S

== Show Map ==

U -> S : Select Dataset
S -> U : Refresh map

@enduml
```