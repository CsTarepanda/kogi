#include <stdio.h>
void swap(int *p, int*q)
{
  int tmp;
  tmp = *p;
  *p = *q;
  *q = tmp;
}

int main(void)
{
  int a = 3, b = 4;
  swap(&a, &b);
  printf("a=%d, b=%d\n", a, b);
  return 0;
}
