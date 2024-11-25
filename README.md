# Linear Footage Calculator

## Description

The **Linear Footage Calculator** is a program designed to calculate the optimal linear footage used by a set of freight items in a truck. It considers key factors such as item dimensions and stackability to minimize the space occupied by the freight.

Linear footage is a critical measure in the logistics industry for determining freight costs in shared trucks (LTL shipments). This program ensures accurate calculation and efficient space utilization.

---

## Features

- Handles stackable and non-stackable items.
- Calculates total linear footage required.
- Rounds up to the nearest whole number for accurate measurement.

---

## Assumptions

1. The truck is assumed to have infinite length for simplicity.
2. A maximum of 20 items (skids/pallets) can be provided as input.
3. The width of a truck is 96 inches (standard).
4. Turnable items are ignored for this implementation.

---

## How to Compile and Run

### Prerequisites

- Java Development Kit (JDK) version 8 or higher.

### Steps to Compile

1. Open a terminal or command prompt.
2. Navigate to the project directory where the source code is located.
3. Compile the Java files:
   ```bash
   javac src/*.java
   ```
