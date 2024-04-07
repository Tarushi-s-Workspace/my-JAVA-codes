public class pattern9 {          //0-1 triangle
    public static void main(String args[]){
        int n=5;  //rows is 5
        for(int i=1;i<=n;i++){ //outer loop

            //inner loop
            for(int j=1;j<=i;j++){
                int sum = i+j;
                if(sum%2==0){    // even
                    System.out.print("1 ");
                } else{  //odd
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

    }
}


//basically to print this 5 rows vala, 0-1 ka triangle we are looking 
//at this pattern in the form of a matrix of 5 X 5 we can see that sum of each block/unit
//i+j is either odd or even. in case of sum as even we are printing 1 and in case of odd number as sum , 0 is being printed,
//using this particular property of sum involving i and j we will write the code
//so understanding pattern in ques is very important
// even i+j "1"
//odd i+j "0"
// remember that i th is row and j th is the column
//any numbers modulo by 2 if returns 0 >> number is even
