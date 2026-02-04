# Domain Design – Fantasy Soccer Game

## Core Entities (Persisted in Database)

### User
- id
- username
- email
- password

### Player
- id
- name
- position
- price
- realTeam

### FantasyTeam
- id
- name
- budgetRemaining
- totalPoints
- user

### Match
- id
- gameweek
- date

### MatchPerformance
- id
- player
- match
- goals
- assists
- cleanSheet
- yellowCards
- redCards

---

## Supporting Entities

### Gameweek
- id
- number
- isCompleted

---

## Value Objects (No Direct Database Table)

### Position
- GOALKEEPER
- DEFENDER
- MIDFIELDER
- FORWARD

### Budget
- maxBudget
- remainingBudget

---

## Domain Services (Pure Logic)

### PointsCalculator
Responsible for:
- Calculating player points based on MatchPerformance
- Applying position-specific scoring rules
- Applying captain multipliers

### TeamValidator
Responsible for:
- Enforcing budget limits
- Enforcing team size rules

---

## Notes
- All game rules and calculations live in the backend domain layer
- Frontend consumes only calculated results via API responses
