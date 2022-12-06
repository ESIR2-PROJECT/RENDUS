# Show data over time usecase
```mermaid
sequenceDiagram

actor U as User
participant S as System

note over U, S: Show Map

U ->> S : Select the date
S ->> U : Show and update data until this date on the map

```