# Problem: Abracadabra

<br>

Given an integer `n`, return a string list where:

- `arr[i] == "abracadabra"` if `i` is divisible by `3` and `5`,
- `arr[i] == "abraca"` if `i` is divisible by `3`,
- `arr[i] == "dabra"` If `i` is divisible by `5`,
- `arr[i] == i` (as a string) if none of the above conditions are true.

<br>

**Example 1:**

<pre>
<b>Input:</b> n = 3;
<b>Output:</b> ["1", "2", "abraca"]
</pre>

**Example 2:**

<pre>
<b>Input:</b> n = 5;
<b>Output:</b> ["1", "2", "abraca", "4", "dabra"]
</pre>

**Example 3:**

<pre>
<b>Input:</b> n = 15;
<b>Output:</b> ["1", "2", "abraca", "4", "dabra", "abraca", "7", "8", "abraca", "dabra", "11", "abraca", "13", "14", "abracadabra"]
</pre>