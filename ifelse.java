class Solution {
    public void studentGrade(int marks) {
        if(marks>=90){
            cout<<"A";
        }
        else{
            if(marks>=70){
                cout<<"B";
            }
            else{
                if(marks>=50){
                    cout<<"C"
                }
                else{
                    if(marks>=35){
                        cout<<"D";
                    }
                    else{
                        cout<<"Fail";
                    }
                }
            }
        }


    }
}
