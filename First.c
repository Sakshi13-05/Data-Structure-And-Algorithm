#include<stdio.h>
#include<conio.h>
#include<string.h>
#include<ctype.h>

char pdt[10][20]={
    "E->E+R|T",
    "T->i"
};
int n=2;

void first(char c){
    if(!isupper(c)){
        printf("%c",c);
        return;
    }
    for(int i=0;i<n;i++){
        if(pdt[i][0]==c){
            if(islower(pdt[i][3])||pdt[i][3]=='#'){
                printf("%c",pdt[i][3]);
            }else{
                first(pdt[i][3]);
            }
        }
    }
}

void follow(char c){
    if(pdt[0][0]==c){
        printf("$ ");
        return;
    }
    for(int i=0;i<n;i++){
        for(int j=3;j<strlen(pdt[i]);j++){
            if(pdt[i][j]==c){
                if(pdt[i][j+1]!='\0'){
                    first(pdt[i][j+1]);
                }else if(pdt[i][j+1]=='\0'&&c!=pdt[i][0]){
                    follow(pdt[i][0]);
                }
            }
        }
    }
}
void remove_left(){
    char alpha[10],beta[10];
    int i=4,j=0,k=0;

    if(pdt[0][0]==pdt[0][3]){

        while(pdt[0][i]!='|')
            alpha[j++]=pdt[0][i++];
        alpha[j]='\0';

        i++;

        while(pdt[0][i]!='\0')
            beta[k++]=pdt[0][i++];
        beta[k]='\0';

        printf("%c->%s%c\n",pdt[0][0],beta,pdt[0][0]);
        printf("%c->%s%c\n",pdt[0][0],alpha,pdt[0][0]);


    }else{
        printf("no recursion\n");
    }
}
void main(){
    remove_left();
}

