# STEP Semester 3 — Session 1: Day 1 Live-Coding Problems

Topic package: `day1_live_coding`

The five problems from `STEP-SEM-3 Week 1 Problems.pdf` are implemented in `class_problems` because the PDF labels these as a Day 1 Live-Coding Session.

- Rock-Paper-Scissors Game — random computer move, 5 rounds, round table, wins/losses/draws and win percentage.
- Palindrome Checker — iterative, recursive and array-reversal approaches.
- Team BMI Calculator — BMI status classification and formatted wellness report.
- First Non-Repeating Character — frequency counting and left-to-right scan.
- Reverse Customer Name — returns a reversed copy while preserving the original string.

## Compile

```bash
javac -d out src/main/java/day1_live_coding/class_problems/*.java
```

## Run

```bash
java -cp out day1_live_coding.class_problems.RockPaperScissorsGame
java -cp out day1_live_coding.class_problems.PalindromeChecker
java -cp out day1_live_coding.class_problems.TeamBMICalculator
java -cp out day1_live_coding.class_problems.FirstNonRepeatingCharacter
java -cp out day1_live_coding.class_problems.ReverseCustomerName
```
