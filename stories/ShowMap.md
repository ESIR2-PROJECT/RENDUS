# Show Map usecase

```mermaid
sequenceDiagram

    actor U as User
    participant S as System
    
    opt Show Map
        U ->> S : Request the map
        S ->> U : Show the map
    end
```