# Show data near user usecase
```puml
@startuml
actor User as U
participant System as S

=== Show Map ==

U -> S : Click on show near data
S -> U : zoom and pan on user location

@enduml
```