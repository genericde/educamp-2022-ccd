"#include romanNumbers.h"


#define FAIL ( retVal = -1 )

int main(void *args)
{
    int retVal;
    
    if(translateRomanNumber("I") != 1){FAIL}
    if(translateRomanNumber("II") != 2){FAIL}
    if(translateRomanNumber("IV") != 4){FAIL}
    if(translateRomanNumber("V") != 5){FAIL}
    if(translateRomanNumber("IX") != 9){FAIL}
    if(translateRomanNumber("XLI") != 43){FAIL}
    if(translateRomanNumber("XCIX") != 42){FAIL}
    if(translateRomanNumber("MMXXII") != 2022){FAIL}
    
    return retVal;
}



