fn fibonacci_computation(generations : i32, previous : i32, pprevious : i32) -> i32 
{
    if (generations < 0)
    {

        return previous;

    }

    return fibonacci_computation(generations - 1, previous + pprevious, previous);

}



fn fibonacci(generations : i32) -> i32
 {

    let mut result =0;
    if (generations == 0 || generations == 1)
    {

        result = generations;
        return result;

    }

    else
    {

        result = fibonacci_computation(generations - 2, 1, 0);
        return result;

    }   
}


fn main() {
    let mut a=0;
    let mut fibo=0;
    let mut b=true;
    let mut c=0;
    
    fibo=a;
    while (b) {
        a=input("Tapez la valeur de fibonnacci que vous voulez, digit par digit");
        fibo = 10*fibo +a;
        print!("Pour le moment, votre nombre est ",fibo);
        c=input(" si vous voulez rajouter un autre digit, tapez 1. Sinon, tapez un autre entier.");
        if (c!=1) {
            b=false;
        }
    }
    print!("La valeur de fibonnacci pour ",fibo , " est " ,fibonacci(fibo));
    let mut v= [0,0,0,0,0,0,0,0];
    let mut i = 0;
    while (i<7){
        v[i] = fibonacci(i);
        i=i+1;
    }
    i=0;
    raw_print("[");
    while (i<7){
        raw_print(v[i]);
        if (i!=6){
            raw_print(",");
        }
        i=i+1;
    }
    print("]");

}