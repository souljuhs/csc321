//Sidney Mcclendon
//csc-321

#include <stdio.h>

int main() {
	int i;
	float f;
	char c;
	double d;

	printf("Enter an integer: ");
	scanf("%d", &i);
	if(i > 1) {
		printf("Integer variable is greater than 1\n");
	} else {
		printf("Integer variable is less than or equal to 1\n");
	}

	printf("Enter a float: ");
	scanf("%f", &f);
	if(f > 1.0) {
		printf("Float variable is greater than 1.0\n");
	}

	printf("Enter a character: ");
	scanf(" %c", &c);
	if(c != 'a') {
		printf("Character variable does not equal the letter 'a'\n");
	}

	printf("Enter a double: ");
	scanf("%lf", &d);
	if(d > 10.0) {
		printf("Double variable is greater than 10.0\n");
	}

	return 0;
}
