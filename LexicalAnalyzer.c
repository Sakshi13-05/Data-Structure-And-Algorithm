#include<stdio.h>
#include<string.h>
#include<conio.h>

void main(){
    char s[100]="";
    printf("enter string\n");
    scanf("%s",s);
    int i=0,state=0;
    
    while(s[i]!='\0'){
        if(s[i]=='b'&&state==0) state=0;

        else if(s[i]=='a'&&state==0) state=1;

        else if(s[i]=='a'&&state==1) state=1;

        else if(s[i]=='b'&&state==1) state=2;

        else if(s[i]=='b'&&state==1) state=1;

        else if(s[i]=='b'&&state==2) state=3;

        else if(state==3) state=3;
        i++;
    }
    if(state==3) printf("Accepted\n");
    else printf("Rejected");
}