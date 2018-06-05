#include "position.h"

int main(void){
    
    position p;
    p.x = 100;

    printf("x = %d\n", p.x);
    
    position p2;
    p2.x = -300;
    if(p2.x < 0){
        p2.x *= -1;
    }
    printf("x = %d\n", p2.x);
    return EXIT_SUCCESS;
}
