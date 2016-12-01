#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<sys/types.h>

int main(){
  int n,x;
  pid_t pid;
  do{
    printf(Inserire numero tra 1 e 4: ");
    scanf("%d",&n);
  }while((n<1)||(n>4));
  printf("Padre PID %d, Figlio PID %d \n",getppid(),getpid());
  for(x=0;x<n;x++){
    pid=fork();
    if(pid==0){
      sleep(1);
      printf("Padre PID %d, Figlio PID %d \n",getppid(),getpid());
    }
  }
}  
      
