#include<string.h>
#include<conio.h>
#include<stdio.h>

void main(){
    char lab[10],opc[10],opr[10];
    int loc;
    FILE *in;

    in=fopen("INTER.txt","r");

    printf("LOCATION\tMNEMONIC\tMACHINE CODE\n");
    

    while(fscanf(in,"%d%s%s%s",&loc,lab,opc,opr)!=EOF){
        if(strcmp(opc,"USING")==0){
            printf("%d\t%s\t%s\t[BASE TABLE UPDATE]\n",loc,opc,opr);
        }else if(strcmp(opc,"DS")==0 || strcmp(opc,"DC")==0){
            printf("%d\t%s\t%s\t[DATA AREA]\n",loc,opc,opr);
        }else if(strcmp(opc,"A")==0){
            printf("%d\t%s\t%s\t\tA500\n",loc,opc,opr);
        }else if(strcmp(opc,"L")==0){
            printf("%d\t%s\t%s\t\t5800\n",loc,opc,opr);
        }
    }
}