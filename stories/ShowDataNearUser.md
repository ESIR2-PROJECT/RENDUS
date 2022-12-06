# Show data near user usecase
```mermaid
sequenceDiagram
    actor U as User
    participant S as System
    
    note over U, S: Show Map    
    
    U ->> S : Click on show near data
    S ->> U : zoom and pan on user location
```