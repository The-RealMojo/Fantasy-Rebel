# fantasy Soccer Game – Rules & Format

## 1. Overview
This project is a web-based fantasy soccer game where users create a team of real-life soccer players and earn points based on their performances in matches. The goal is to score more fantasy points than other users over weekly gameweeks and across the season.

The game is designed with a clear separation between:
- Frontend (UI and interaction)
- Backend (game rules and logic)
- Database (persistent game data)

---

## 2. Account & Access
- Users must create a free account to participate
- Users log in to manage their fantasy team and view standings
- Each user is allowed **one fantasy team per account**

---

## 3. Team Creation & Budget
- Each fantasy team consists of **8 players**
    - **5 starting players**
    - **3 substitutes (bench)**
- Total team budget: **£50 million**
- Players can be selected from any supported real-world leagues
- Team composition rules:
    - Any mix of positions is allowed
    - Budget and team size rules must always be satisfied

---

## 4. Scoring System

### Positive Actions

| Action | Points |
|------|--------|
| Goal | +5 |
| Assist | +3 |
| Clean Sheet (Defenders & Goalkeepers) | +4 |
| Clean Sheet (Midfielders) | +1 |
| Every 3 Saves (Goalkeepers) | +1 |

### Negative Actions

| Action | Points |
|------|--------|
| Yellow Card | -1 |
| Red Card | -3 |
| Own Goal | -4 |
| Penalty Miss | -2 |
| Conceding 2+ Goals (GK/DEF) | -1 |
| Conceding 4+ Goals (GK/DEF) | -2 |

### Bonus Points

| Achievement | Points |
|-----------|--------|
| Man of the Match | +3 |
| Hat-trick | +5 |
| Team Win (Starting players only) | +1 |

---

## 5. Captaincy
- Each team selects **one captain**
- The captain’s total points for the gameweek are **doubled**
- A **vice-captain** is also selected
- If the captain does not play, the vice-captain automatically receives double points

---

## 6. Gameweeks
- The season is divided into **gameweeks**
- A gameweek represents one real-world football week
- Points are calculated after all matches in a gameweek are completed
- Leaderboards update after each gameweek

---

## 7. Transfers
- Unlimited transfers are allowed before the season starts
- During the season:
    - Users receive **2 free transfers per gameweek**
    - A maximum of **1 unused transfer** may carry over to the next gameweek
    - Additional transfers beyond the free limit cost **-4 points each**

---

## 8. Automatic Substitutions
- If a starting player does not play:
    - Bench players are substituted in automatically
    - Substitutions occur in a predefined bench order
- A minimum of **5 starting players** must have played for a team to be eligible for points in a gameweek

---

## 9. Competitions

### Weekly Competition
- Winner: Highest points scored in a single gameweek
- Tiebreaker:
    1. Total goals scored by the fantasy team
    2. Fewest transfers used

### Season Competition
- Champion: Highest total points across the season
- Runner-up: Second-highest points
- Top 10 teams are recorded in a permanent hall of fame

---

## 10. Leagues
- All users automatically participate in the **Global League**
- Users can create or join **Private Leagues** using invite codes

---

## 11. Deadlines
- Team changes must be completed **1 hour before the first match of a gameweek**
- Points are finalized **2 hours after the final match** of the gameweek