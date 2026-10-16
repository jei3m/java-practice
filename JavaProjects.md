## **1. Restaurant Bill Calculator**
- Input Customer Name, Food Bill
- Calculates the following:
  - **Service Charge** (ALWAYS 10% of Food Bill)
    - `Service Charge = Food Bill * 10%`
  - **Subtotal** (Food Bill + Service Charge)
    - `Subtotal = Food Bill + Service Charge`
  - **VAT** (Philippines standard rate: 12%)
    - `VAT = Subtotal * 12%`
  - **Total Bill** (Subtotal + VAT)
    - `Total = Subtotal + VAT`
  - **Bill Category** (USE Conditional Operator)
    - If Total Bill is 3000 or more → "EXPENSIVE". Otherwise → "AFFORDABLE"

**Expected Output:**
```
--- Restaurant Bill ---
Customer: Juan
Food Bill: 1500.0
Service Charge: 150.0
Subtotal: 1650.0
VAT (12%): 198.0
Total Bill: 1848.0
Category: AFFORDABLE
```

---

## **2. BMI Calculator**
- Input Weight (kg) and Height (m)
- Calculates the following:
  - BMI (use formula: `BMI = Weight / (Height * Height)`)
  - Category (use IF ELSE)
    - Below 18.5 → "Underweight"
    - 18.5–24.9 → "Normal"
    - 25.0–29.9 → "Overweight"
    - 30.0 and above → "Obese"
  - Health Advice (USE Conditional Operator)
    - If BMI is 18.5–24.9 → "KEEP IT UP". Otherwise → "SEE A DOCTOR"

**Expected Output:**
```
--- BMI Report ---
Weight  : 70.0
Height  : 1.75
BMI     : 22.86
Category: Normal
Advice  : KEEP IT UP
```

---

## **3. Grade Calculator**
- Input Grades for 5 Subjects
- Calculates the following:
  - Total
  - Average
  - Letter (use IF ELSE)
    - 90–100 → A
    - 80–89 → B
    - 70–79 → C
    - 60–69 → D
    - Below 60 → F
  - Remarks (USE Ternary Operator)
    - Less than 60 "FAILED". Otherwise "PASSED"

**Expected Output:**
```
--- Results ---
Total  : 260.0
Average: 52.0
Letter : F
Remark : FAILED
```

---

## **4. Payroll Calculator**
- Input Employee Name, Daily Rate, and Number of Days Worked
- Calculates the following:
  - Gross Pay (use formula: `Gross = Daily Rate * Days Worked`)
  - Tax (use IF ELSE)
    - Gross less than 10000 → 0% tax
    - Gross 10000–29999 → 10% tax
    - Gross 30000 and above → 20% tax
  - Net Pay (use formula: `Net = Gross - Tax`)
  - Employment Status (USE Conditional Operator)
    - If Net Pay is 15000 or more → "REGULAR". Otherwise → "PROBATIONARY"

**Expected Output:**
```
--- Payslip ---
Employee    : Juan
Daily Rate  : 500.0
Days Worked : 20
Gross Pay   : 10000.0
Tax         : 1000.0
Net Pay     : 9000.0
Status      : PROBATIONARY
```

## **5. Simple Arithmetic Calculator**
- [Input] Two numbers (num1 and num2) and an operation choice (1, 2, 3, or 4)
- Calculates the following:
  - Addition (num1 + num2)
  - Subtraction (num1 - num2)
  - Multiplication (num1 * num2)
  - Division (num1 / num2)
  - Uses a **switch statement** to determine which operation to perform

**Code Snippet:**
```
switch (variable)
{
  case exprsn1:
    statements;
  break;

  case exprsn2:
    statement;
  break;

  case exprsn3:
    statement;
  break;

  default:
    statement;
}
```

**Expected Input:**
```
=== SIMPLE ARITHMETIC CALCULATOR ===
Enter first number:
10
Enter second number:
5
Choose an Operation: [1] Addition [2] Subtraction [3] Multiply [4] Divide
1
```

**Expected Output:**
```
Result: 10 + 5 = 15
```

## **6. Enhanced Simple Arithmetic Calculator (with While Loop)**
- [Input] Two numbers (num1 and num2), an operation choice (1, 2, 3, or 4), and a choice to continue (1 = Yes, 2 = No)
- Calculates the following:
  - Addition (num1 + num2)
  - Subtraction (num1 - num2)
  - Multiplication (num1 * num2)
  - Division (num1 / num2)
  - Uses a **switch statement** to determine which operation to perform
  - Uses a **while loop** to keep the calculator running until the user chooses to stop

**Expected Input:**
```
Enter first number: 10
Enter second number: 5
Choose an Operation: [1] Addition [2] Subtraction [3] Multiply [4] Divide
Enter your choice: 1
Do you want to continue using the calculator? [1] Yes [2] No: 2
```

**Expected Output:**
```
=== SIMPLE ARITHMETIC CALCULATOR ===

Result: 10 + 5 = 15

Thank you!
```