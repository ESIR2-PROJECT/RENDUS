# Show info on data point usecase

```mermaid
sequenceDiagram

actor U as User
participant S as System

note over U, S: Show Map

S ->> U : Click on a data point
U ->> S : Show a popup with more infos
```