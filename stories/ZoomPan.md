# Zoom or pan the map

```puml
@startuml

Actor User as U
Participant System as S

== Show map ==

U -> S : Ask for zooming or panning
S -> U : Dynamically change the map

@enduml
```