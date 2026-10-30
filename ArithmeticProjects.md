## 1. Restaurant Bill Splitter

**Inputs:** Number of people, Bill amount only

**Sample Output:**
```
=== Restaurant Bill Splitter ===
Enter number of people: 4
Enter bill amount: 1200

--- Receipt ---
Total Bill:   1200.00
Per Person:   300.00
```

---

## 2. Simple Payroll System

**Inputs:** Employee name, Daily rate, Days worked, Overtime hours, Overtime rate per hour

**Expected Output:**
```
=== Simple Payroll System ===
Enter employee name: Juan
Enter daily rate: 500
Enter days worked: 20
Enter overtime hours: 5
Enter overtime rate per hour: 100

--- Payslip ---
Employee:      Juan
Basic Pay:     10000.00
Overtime Pay:  500.00
Gross Pay:     10500.00
```

---

## **3. Movie Ticket Pricing System**

**Inputs:**
- Customer age
- Number of tickets
- Day type (1 = Weekday, 2 = Weekend)
- Student ID status (1 = Yes, 2 = No)

**Calculations:**

| Adjustment | Condition | Rate | Formula | Example (Base = 250) |
|------------|-----------|------|---------|----------------------|
| **Base Price** | Always | — | Fixed | `250.00` |
| **Age Discount** | Age ≥ 60 (senior) OR Age ≤ 12 (child) | 20% | `Base Price × 0.20` | `250 × 0.20 = 50.00` |
| **Student Discount** | Student ID = Yes (1) | 15% | `Base Price × 0.15` | `250 × 0.15 = 37.50` |
| **Weekend Fee** | Day type = Weekend (2) | 10% | `Base Price × 0.10` | `250 × 0.10 = 25.00` |
| **Price per Ticket** | Always | — | `Base − Age Discount − Student Discount + Weekend Fee` | `250 − 0 − 37.50 + 0 = 212.50` |
| **Total** | Always | — | `Price per Ticket × Number of Tickets` | `212.50 × 3 = 637.50` |

**Step-by-step for the sample input (age = 20, tickets = 3, weekday, student = yes):**

1. **Base Price** = `250.00`
2. **Age Discount** → age 20 is not ≥ 60 and not ≤ 12 → **no discount** = `0.00`
3. **Student Discount** → student = yes → `250 × 0.15` = `37.50`
4. **Weekend Fee** → weekday = no fee = `0.00`
5. **Price per Ticket** = `250 − 0 − 37.50 + 0` = `212.50`
6. **Total** = `212.50 × 3` = `637.50`

**Expected Output:**
```
=== Movie Ticket Pricing ===
Enter age: 20
Enter number of tickets: 3
Day type [1] Weekday [2] Weekend: 1
Are you a student? [1] Yes [2] No: 1

--- Ticket Summary ---
Base Price:    250.0
Age Discount:  0.0
Student Disc:  37.5
Weekend Fee:   0.0
Price/Ticket:  212.5
Total:         637.5
```

---

## **4. Electricity Bill Calculator**

**Inputs:**
- Customer name
- Previous meter reading
- Current meter reading
- Rate per kWh
- Fixed charge

**Calculations:**

| Item | Condition | Formula | Example (prev = 1200, curr = 1450, rate = 12.5, fixed = 100) |
|------|-----------|---------|-------------------------------------------------------------|
| **Consumption** | Always | `Current Reading − Previous Reading` | `1450 − 1200 = 250 kWh` |
| **Energy Charge** | Always | `Consumption × Rate per kWh` | `250 × 12.5 = 3125.00` |
| **Subtotal** | Always | `Energy Charge + Fixed Charge` | `3125 + 100 = 3225.00` |
| **VAT** | Always | `Subtotal × 0.12` | `3225 × 0.12 = 387.00` |
| **Total Bill** | Always | `Subtotal + VAT` | `3225 + 387 = 3612.00` |

**Step-by-step for the sample input:**

1. **Consumption** = `1450 − 1200` = `250 kWh`
2. **Energy Charge** = `250 × 12.5` = `3125.00`
3. **Subtotal** = `3125 + 100` = `3225.00`
4. **VAT (12%)** = `3225 × 0.12` = `387.00`
5. **Total Bill** = `3225 + 387` = `3612.00`

**Expected Output:**
```
=== Electricity Bill Calculator ===
Enter customer name: Pedro
Enter previous reading: 1200
Enter current reading: 1450
Enter rate per kWh: 12.5
Enter fixed charge: 100

--- Electric Bill ---
Customer:       Pedro
Consumption:    250 kWh
Energy Charge:  3125.0
Fixed Charge:   100.0
VAT (12%):      387.0
Total Bill:     3612.0
```

---

## **5. Gym Membership Fee Calculator**

**Inputs:**
- Member name
- Membership plan (1 = Monthly, 2 = Quarterly, 3 = Annual)
- Number of personal training sessions
- Trainer tier (1 = Basic, 2 = Premium)

**Calculations:**

| Item | Condition | Formula / Rate | Example (plan = 2, sessions = 8, tier = 2) |
|------|-----------|----------------|--------------------------------------------|
| **Plan Cost** | Plan 1 = Monthly | Fixed `1500.00` | — |
| | Plan 2 = Quarterly | Fixed `4500.00` | `4500.00` |
| | Plan 3 = Annual | Fixed `15000.00` | — |
| **Session Rate** | Tier 1 = Basic | Fixed `500.00` per session | — |
| | Tier 2 = Premium | Fixed `800.00` per session | `800.00` |
| **Training Cost** | Always | `Sessions × Session Rate` | `8 × 800 = 6400.00` |
| **Subtotal** | Always | `Plan Cost + Training Cost` | `4500 + 6400 = 10900.00` |
| **Loyalty Discount** | Annual plan (3) **OR** 5+ sessions | `Subtotal × 0.05` | `10900 × 0.05 = 545.00` |
| **Total Fee** | Always | `Subtotal − Loyalty Discount` | `10900 − 545 = 10355.00` |

**Step-by-step for the sample input (Quarterly, 8 sessions, Premium):**

1. **Plan Cost** → Quarterly = `4500.00`
2. **Session Rate** → Premium = `800.00` per session
3. **Training Cost** = `8 × 800` = `6400.00`
4. **Subtotal** = `4500 + 6400` = `10900.00`
5. **Loyalty Discount** → 8 sessions ≥ 5 → `10900 × 0.05` = `545.00`
6. **Total Fee** = `10900 − 545` = `10355.00`

**Expected Output:**
```
=== Gym Membership Calculator ===
Enter member name: Carlo
Membership plan [1] Monthly [2] Quarterly [3] Annual: 2
Enter personal training sessions: 8
Trainer tier [1] Basic [2] Premium: 2

--- Membership Summary ---
Member:           Carlo
Plan Cost:        4500.0
Training Cost:    6400.0
Subtotal:         10900.0
Loyalty Discount: 545.0
Total Fee:        10355.0
```

---