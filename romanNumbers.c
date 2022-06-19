

int translateRomanNumber(char * romanNumberString);
int translateRomanLiteral(char oneLiteral);

int translateRomanNumber(char * romanNumberString)
{
    int i =0;
    int value;
    
    while(romanNumberString[i] != '/0')
    {
        if(i==0)
        {
            value = romanNumberString[i];
        }
        else
        {
            if(romanNumberString[i] <= romanNumberString[i-1])
            {
                value =+ romanNumberString[i];
            }
            else
                value =- romanNumberString[i];
            }
        }
        i++,
    }
    
    return value;
}

int translateRomanLiteral(char oneLiteral)
{
    int value;
    
    switch(oneLiteral)
    {
        case 'I':
        {
            value = 1;
             break;
        }
        case 'V':
        {
            value = 5;
             break;
        }
        case 'X':
        {
            value = 10;
             break;
        }
        case 'L':
        {
            value = 50;
             break;
        }
        case 'C':
        {
            value = 100;
            break;
        }
        case 'D':
        {
            value = 500;
            break;
        }
        case 'M':
        {
            value = 1000;
            break;
        }
        default:
        {
            value =0;
        }
        break;
    }
    
    return value;
}
