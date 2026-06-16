#include<stdio.h>
#include<string.h>

int main(){
    char mnt[10], ala1[10], ala2[10];
    char opc[10], opr1[10];
    int is_macro = 0;

    FILE *in = fopen("IN.txt", "r");

    while(fscanf(in, "%s", opc) != EOF){

        // MACRO start
        if(strcmp(opc, "MACRO") == 0){
            is_macro = 1;

            fscanf(in, "%s%s%s", mnt, ala1, ala2);
            printf("Macro Defined: %s\n", mnt);
        }

        // MACRO end
        else if(strcmp(opc, "MEND") == 0){
            is_macro = 0;
            printf("Macro Ended\n");
        }

        // inside macro
        else if(is_macro){
            fscanf(in, "%s", opr1);   // read operand

            if(strcmp(opr1, ala1) == 0) strcpy(opr1, "#0");
            if(strcmp(opr1, ala2) == 0) strcpy(opr1, "#1");

            printf("%s\t%s\n", opc, opr1);
        }

        // normal code
        else{
            printf("%s\n", opc);
        }
    }

    fclose(in);
    return 0;
}