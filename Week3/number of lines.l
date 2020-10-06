No.of lines


%{ 
#include<stdio.h> 
int lc=0; /Global variables/
%} 
  
/Rule Section/
%% 
\n lc++; //line counter 
 
%% 
  
main() 
{ 
    // The function that starts the analysis 
    yylex(); 
      
    printf("\nNo. of lines=%d, lc);   
      
}
