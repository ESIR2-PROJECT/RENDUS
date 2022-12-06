# Show info on data point usecase

```puml
@startuml

actor User as U
participant System as S

=== Show Map ==

S -> U : Click on a data point
U -> S : Show a popup with more infos

@enduml
```