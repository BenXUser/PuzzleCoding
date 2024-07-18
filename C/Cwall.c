/**
 * @Author BenXUser
 * @Author Swee4T
 * @File Cwall.c
 * @Copyright BenXUser & Swee4T
 * @Brief TBA
 * @Date 07/09/2024
 */

#include <stdio.h>


/* ======= HAIKU =======
	Your identity,
	your name, your shadow, your "YOU".
	Which "USER" are you?
*/
void getUserOS() {
	printf("HELLO %s\n", getenv("USERNAME"));
	return
}


/* ======= HAIKU =======
	You have nothing now -
	set your nothing with nothing -
	What do you have now?
*/
bool stringIsNull(char *string) {
	if (string == NULL) {
        printf("NULL STRING CANNOT!\n");
        printf("BE ALLOCATED!\n");
        return true;
    }
    return false;
}