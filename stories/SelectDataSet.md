# Select dataset usecase

```mermaid
sequenceDiagram
    actor U as User
    participant S as System
    
    note over U, S: Show Map
    
    U ->> S : Select Dataset
    S ->> U : Refresh map
```