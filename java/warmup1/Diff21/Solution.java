// T - O(1), S - O(1)

public int diff21(int n) {
  if (n <= 21) {
    return 21 - n;
  } else {
    return (n - 21) * 2;
  }
}
