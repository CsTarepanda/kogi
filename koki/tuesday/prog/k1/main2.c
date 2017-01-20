#include <stdio.h>

int main(void){
  char moji, st[15] = "programming";
  char *p = st;
  printf("p=%p\n", p);
  int i = 0;
  for(i = 0; i < 30; i++){
    printf("%c", *p);
    p++;
  }
  moji = *(p + 5);
  return 0;
}
