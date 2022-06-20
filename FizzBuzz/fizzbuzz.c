/******************************************************************************
Clean Code Development - FizzBuzz
*******************************************************************************/

#include <stdio.h>
#include <string.h>


//Defines and constants
/******************************************************************************/
#define NUMBERS_TO_PRINT 100
const char Fizz[] = "Fizz";
const char Buzz[] = "Buzz";


//Test Helpers
/******************************************************************************/



//Private Functions
/******************************************************************************/
int
IsItDeivadabelBy (int numerator, int denominator)
{
  int isDivadableBy = 0;

  int reminder = numerator % denominator;
  if (reminder == 0)
    {
      isDivadableBy = 1;
    }

  return isDivadableBy;
}


void
ReplaceNumber (int n, char *out)
{


  if (IsItDeivadabelBy (n, 3))
    {
      strcat (out, Fizz);
    }
  if (IsItDeivadabelBy (n, 5))
    {
      strcat (out, Buzz);
    }
  if (out[0] == 0)
    {
      sprintf (out, "%d", n);
    }
  strcat (out, "\n");
}


int
main ()
{
  char *text[9];

  for (int n = 0; n <= NUMBERS_TO_PRINT; n++)
    {
      memset (text, 0, sizeof (text));
      ReplaceNumber (n, text);
      printf (text);
    }

  return 0;
}
