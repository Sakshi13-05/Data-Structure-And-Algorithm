#include<stdio.h>
#include<conio.h>
#include<string.h>

struct sym{
    char s[10];
    int val;
};
struct lit{
    char l[10];
    int val;
};

void main(){
    char src[5][3][10]={
        {"SAMPLE","START","0"},
        {"","A","1,FOUR"},
        {"TEMP","EQU","10"},
        {"","A","=F'3'"},
        {"","END",""}
    };

    struct sym ST[10];
    struct lit LT[20];
    int st_cnt=0,lt_cnt=0,lc=0;

    printf("LC\tLABEL\tOPCODE\tOPERAND\n");

    for(int i=0;i<5;i++){
        // if label is there then add to symbol table
        if(strlen(src[i][0])>0){
            strcpy(ST[st_cnt].s,src[i][0]);
        }

        if(strcmp(src[i][1],"EQU")==0){
            ST[st_cnt].val=10;
        }else{
            ST[st_cnt].val=lc;
        }
        st_cnt++;

        // if operand contain = add it to literal table
        if(src[i][2][0]=='='){
            strcpy(LT[lt_cnt].l,src[i][2]);
            LT[lt_cnt].val=-1;
            lt_cnt++;
        }

        printf("%d\t%s\t%s\t%s\n",lc,src[i][0],src[i][1],src[i][2]);

        if(strcmp(src[i][1],"START")==0||strcmp(src[i][1],"EQU")==0) lc+=0;
        else lc+=4;

        
    }
    printf("SYMBOL TABLE\n");
        for(int i=0;i<st_cnt;i++){
            printf("%s\t%d\n",ST[i].s,ST[i].val);
        }
    printf("LITERAL TABLE\n");
        for(int i=0;i<lt_cnt;i++){
            printf("%s\t%d\n",LT[i].l,LT[i].val);
        }
}