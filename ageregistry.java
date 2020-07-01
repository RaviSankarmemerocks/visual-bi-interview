package com.company;

import java.util.Arrays;
import java.util.Scanner;

import java.util.ArrayList;
public class ageregistry {
    public static void main(String args[]){
        ArrayList<String> age_group=new ArrayList<String>();
        

        age_group.add("1-10");
        age_group.add("11-20");
        age_group.add("21-30");
        age_group.add("31-40");
        age_group.add("41-50");
        age_group.add("51-60");
        age_group.add("61-70");
        age_group.add("71-80");
        age_group.add("81-90");
        age_group.add("91-100");
      
       int age_count[]=new int [10];
        Arrays.fill(age_count,0);
        Scanner sc=new Scanner(System.in);

        AgeRegistry(age_group,age_count);
    }
    public static void AgeRegistry(ArrayList<String> age_group,int [] age_count){


      
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of records..(enter -1 to quit)");
        int no_of_input=sc.nextInt();
        if(no_of_input==-1){return;};
        for(int i=0;i<no_of_input;i++){
            int age=sc.nextInt();

            if(age>=1&&age<=10){

                
                age_count[0]=age_count[0]+1;
            }else if(age>=11&&age<=20){

                age_count[1]=age_count[1]+1;


            }else if(age>=21&&age<=30){

                age_count[2]=age_count[2]+1;



            }else if(age>=31&&age<=40){

                age_count[3]=age_count[3]+1;



            }else if(age>=41&&age<=50){

                age_count[4]=age_count[4]+1;



            }else if(age>=51&&age<=60){

                age_count[5]=age_count[5]+1;



            }else if(age>=61&&age<=70){

                age_count[6]=age_count[6]+1;



            }else if(age>=71&&age<=80){

                age_count[7]=age_count[7]+1;



            }else if(age>=81&&age<=90){

                age_count[8]=age_count[8]+1;



            }else if(age>=91&&age<=100){

                age_count[9]=age_count[9]+1;



            }else if(age==-1){
                System.out.println("AGE          TOTAL_NO_OF_COUNT");
                for(int j=0;j<age_group.size();j++){
                    System.out.println(age_group.get(j)+"          "+age_count[j]);
                }
                return;
            }
        }
        System.out.println("AGE          TOTAL_NO_OF_COUNT");
        for(int j=0;j<age_group.size();j++){
            System.out.println(age_group.get(j)+"          "+age_count[j]);
        }

        AgeRegistry(age_group,age_count);

    }
}
