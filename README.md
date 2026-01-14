[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/IcXF8gkE)
# Experiment 10: Peak Element

## Problem Statement

An element is called a **peak element** if its value is not smaller than the value of its adjacent elements (if they exist).
* For the first element, consider only the element adjacent to its right.
* For the last element, consider only the element adjacent to its left.

Given an array `arr` of size $n$, find the index of the **first** peak element.
If a peak element does not exist, print -1.

## Input Format

* The first line contains an integer $n$.
* The second line contains $n$ space-separated integers.

## Output Format

Return the **index** of the peak element (0-based indexing) if present, else return -1.

### Example 1

**Input:**

```text
4
5 10 20 15
```

**Output:**

```text
2
```

**Explanation:**
20 is greater than both of its neighbors (10 and 15). Hence 20 is the peak element. Index is 2.

### Example 2

**Input:**

```text
7
10 20 15 2 23 64 67
```

**Output:**

```text
1
```

**Explanation:**
20 is greater than 10 and 15. It is the first peak encountered. (67 is also a peak, but we need the first one).
