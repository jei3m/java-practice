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

## 4. Electricity Bill Calculator

**Inputs:**
- Customer name
- Previous meter reading
- Current meter reading
- Rate per kWh

**Calculations:**

| Item | Formula | Example (prev = 1200, curr = 1450, rate = 12.5) |
|------|---------|--------------------------------------------------|
| **Consumption** | `Current Reading − Previous Reading` | `1450 − 1200 = 250 kWh` |
| **Total Bill** | `Consumption × Rate per kWh` | `250 × 12.5 = 3125.00` |

**Step-by-step for the sample input:**

1. **Consumption** = `1450 − 1200` = `250 kWh`
2. **Total Bill** = `250 × 12.5` = `3125.00`

**Expected Output:**
```
=== Electricity Bill Calculator ===
Enter customer name: Pedro
Enter previous reading: 1200
Enter current reading: 1450
Enter rate per kWh: 12.5

--- Electric Bill ---
Customer:      Pedro
Consumption:   250 kWh
Total Bill:    3125.00
```

---

## 5. Gym Membership Fee Calculator

**Inputs:**
- Member name
- Membership plan (1 = Monthly, 2 = Quarterly, 3 = Annual)
- Number of personal training sessions

**Calculations:**

| Item | Condition | Formula / Rate | Example (plan = 2, sessions = 8) |
|------|-----------|----------------|----------------------------------|
| **Plan Cost** | Plan 1 = Monthly | Fixed `1500.00` | — |
| | Plan 2 = Quarterly | Fixed `4500.00` | `4500.00` |
| | Plan 3 = Annual | Fixed `15000.00` | — |
| **Training Cost** | Always | `Sessions × 500.00` | `8 × 500 = 4000.00` |
| **Total Fee** | Always | `Plan Cost + Training Cost` | `4500 + 4000 = 8500.00` |

**Step-by-step for the sample input (Quarterly, 8 sessions):**

1. **Plan Cost** → Quarterly = `4500.00`
2. **Training Cost** = `8 × 500` = `4000.00`
3. **Total Fee** = `4500 + 4000` = `8500.00`

**Expected Output:**
```
=== Gym Membership Calculator ===
Enter member name: Carlo
Membership plan [1] Monthly [2] Quarterly [3] Annual: 2
Enter personal training sessions: 8

--- Membership Summary ---
Member:         Carlo
Plan Cost:      4500.00
Training Cost:  4000.00
Total Fee:      8500.00
```

---