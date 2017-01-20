#include <stdio.h>
int main(void){
  char a;
  int b;
  char *ap = &a;
  int *bp = &b;
  printf("&a=%p, &b=%p\n", ap, bp);
  ap++;
  bp += 2;
  printf("&a=%p, &b=%p\n", ap, bp);
  return 0;
}
