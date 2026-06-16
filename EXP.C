#include<stdio.h>
#include<string.h>
#include<stdio.h>

int main(){
    int loc;
    char lab[10],opc[10],ope[10];
    FILE *fp;

    fp=fopen("INTER.txt","r");
    if(fp==NULL){
        printf("Unable to open INTER.txt\n");
        return 1;
    }

    while(fscanf(fp,"%d%s%s%s",&loc,lab,opc,ope)!=EOF){

        if(strcmp(opc,"USING")==0) {
            printf("%d\t%s\t%s\t[Base Table Update]\n",loc,opc,ope);
        }
        else if((strcmp(opc,"DS")==0)||(strcmp(opc,"DC")==0)) {
            printf("%d\t%s\t%s\t[Data Area]\n",loc,opc,ope);
        }
        if(strcmp(opc,"A")==0) {
            printf("%d\t%s\t%s\t5A00\n",loc,opc,ope);
        }
        else if(strcmp(opc,"L")==0) {
            printf("%d\t%s\t%s\t5800\n",loc,opc,ope);
        }
    }
    fclose(fp);
}
